#!/bin/bash

# Check input parameters
if [ $# -ne 2 ]; then
    echo "❌ Usage: $0 <base_directory1> <base_directory2>"
    echo "   This script will compare all matching subdirectories between two base directories"
    exit 1
fi

base_dir1="$1"
base_dir2="$2"
log_dir="result/correctness"
batch_log_file="$log_dir/batch_comparison.log"
summary_log_file="$log_dir/batch_summary.log"

# Check if base directories exist
if [ ! -d "$base_dir1" ]; then
    echo "❌ ERROR: Base directory $base_dir1 does not exist"
    exit 1
fi

if [ ! -d "$base_dir2" ]; then
    echo "❌ ERROR: Base directory $base_dir2 does not exist"
    exit 1
fi

# Create log directory if it doesn't exist
mkdir -p "$log_dir"

# Append to log files (don't clear them)
echo "==========================================" >> "$batch_log_file"
echo "🔍 Batch comparison started at: $(date '+%Y-%m-%d %H:%M:%S %Z')" >> "$batch_log_file"
echo "🔍 Comparing: $base_dir1 vs $base_dir2" >> "$batch_log_file"
echo "==========================================" >> "$batch_log_file"

echo "==========================================" >> "$summary_log_file"
echo "🔍 Batch comparison started at: $(date '+%Y-%m-%d %H:%M:%S %Z')" >> "$summary_log_file"
echo "🔍 Comparing: $base_dir1 vs $base_dir2" >> "$summary_log_file"

echo "🔍 Starting batch comparison between $base_dir1 and $base_dir2..."
echo "🔍 Starting batch comparison between $base_dir1 and $base_dir2..." | tee -a "$batch_log_file"

# Get list of common subdirectories
echo "" | tee -a "$batch_log_file"
echo "📁 Finding common subdirectories..." | tee -a "$batch_log_file"

common_dirs=()
success_count=0
fail_count=0
skip_count=0

# Find all subdirectories in base_dir1 and check if they exist in base_dir2
while IFS= read -r -d '' subdir1; do
    dirname=$(basename "$subdir1")
    subdir2="$base_dir2/$dirname"
    
    if [ -d "$subdir2" ]; then
        common_dirs+=("$dirname")
    fi
done < <(find "$base_dir1" -mindepth 1 -maxdepth 1 -type d -print0)

if [ ${#common_dirs[@]} -eq 0 ]; then
    echo "❌ No common subdirectories found between $base_dir1 and $base_dir2" | tee -a "$batch_log_file" "$summary_log_file"
    exit 1
fi

echo "" | tee -a "$batch_log_file"

# Process each common directory
echo "" | tee -a "$batch_log_file"
echo "🔄 Starting individual comparisons..." | tee -a "$batch_log_file"
echo "==========================================" | tee -a "$batch_log_file"

# Function to extract verified numbers from "Running" section
extract_verified_numbers() {
    local file="$1"
    # Extract the verified numbers from Running section
    awk '
    /^Running \*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*/ {
        in_running = 1
        next
    }
    in_running && /^The following are verified/ {
        in_verified = 1
        count = 0
        next
    }
    in_verified && /^Numb of k = [0-9]:/ {
        if (count < 3) {
            # Extract the number after the tab/space
            split($0, parts, /:[[:space:]]+/)
            if (length(parts) >= 2) {
                print parts[2]
            }
            count++
        }
    }
    in_running && /^Estimating/ {
        exit
    }
    ' "$file"
}

# Function to compare single directory pair
compare_single_directory() {
    local dir1="$1"
    local dir2="$2"
    local dirname="$3"
    local log_file="$4/comparison_${dirname}.log"
    
    > "$log_file"
    
    echo "🔍 Starting comparison of properties_summary.txt in $dir1 and $dir2..." >> "$log_file"
    
    # Check if files exist
    file1="$dir1/properties_summary.txt"
    file2="$dir2/properties_summary.txt"
    
    # Skip if either file doesn't exist (no error)
    if [ ! -f "$file1" ] || [ ! -f "$file2" ]; then
        echo "📝 SKIP: properties_summary.txt not found in one or both directories" >> "$log_file"
        return 2  # Return 2 for skip
    fi
    
    echo "📊 Extracting verified numbers from Running section..." >> "$log_file"
    
    numbers1=($(extract_verified_numbers "$file1"))
    numbers2=($(extract_verified_numbers "$file2"))
    
    # Debug output
    echo "Extracted from $file1: ${numbers1[@]}" >> "$log_file"
    echo "Extracted from $file2: ${numbers2[@]}" >> "$log_file"
    
    # Check if we extracted exactly 3 numbers from each file
    if [ ${#numbers1[@]} -ne 3 ]; then
        echo "❌ ERROR: Expected 3 verified numbers in $file1, but found ${#numbers1[@]}" >> "$log_file"
        return 1
    fi
    
    if [ ${#numbers2[@]} -ne 3 ]; then
        echo "❌ ERROR: Expected 3 verified numbers in $file2, but found ${#numbers2[@]}" >> "$log_file"
        return 1
    fi
    
    # Compare values
    all_match=true
    echo "" >> "$log_file"
    echo "📊 Comparison Results:" >> "$log_file"
    echo "======================" >> "$log_file"
    
    for i in {0..2}; do
        k=$((i + 1))
        
        if [ "${numbers1[$i]}" = "${numbers2[$i]}" ]; then
            result="✅ MATCH"
        else
            result="❌ MISMATCH"
            all_match=false
        fi
        
        output_line="k=$k (verified): $dir1=${numbers1[$i]}, $dir2=${numbers2[$i]} - $result"
        echo "$output_line" >> "$log_file"
    done
    
    # Final summary
    echo "" >> "$log_file"
    echo "🎯 FINAL SUMMARY" >> "$log_file"
    echo "================" >> "$log_file"
    if $all_match; then
        final_result="🎉 SUCCESS: All verified 'Numb of k' values in Running section match perfectly!"
    else
        final_result="⚠️ WARNING: Some verified 'Numb of k' values in Running section do not match"
    fi
    
    echo "$final_result" >> "$log_file"
    echo "📝 Detailed log saved to: $log_file" >> "$log_file"
    
    # Return success only if all match
    if $all_match; then
        return 0
    else
        return 1
    fi
}

# Create a temporary directory for individual comparison logs
temp_log_dir=$(mktemp -d)

for dirname in "${common_dirs[@]}"; do
    subdir1="$base_dir1/$dirname"
    subdir2="$base_dir2/$dirname"
    
    echo "" | tee -a "$batch_log_file"
    echo "🔍 Comparing: $dirname" | tee -a "$batch_log_file"
    echo "  Source: $subdir1" | tee -a "$batch_log_file"
    echo "  Target: $subdir2" | tee -a "$batch_log_file"
    echo "------------------------------------------" | tee -a "$batch_log_file"
    
    # Run the comparison
    compare_result=$(compare_single_directory "$subdir1" "$subdir2" "$dirname" "$temp_log_dir")
    exit_code=$?
    
    if [ $exit_code -eq 0 ]; then
        echo "✅ SUCCESS: Comparison completed for $dirname" | tee -a "$batch_log_file"
        ((success_count++))
        
        # Append the individual log to batch log
        individual_log="$temp_log_dir/comparison_${dirname}.log"
        if [ -f "$individual_log" ]; then
            cat "$individual_log" >> "$batch_log_file"
        fi
    elif [ $exit_code -eq 2 ]; then
        echo "⏭️  SKIPPED: properties_summary.txt not found in $dirname" | tee -a "$batch_log_file"
        ((skip_count++))
        
        # Append the individual log to batch log
        individual_log="$temp_log_dir/comparison_${dirname}.log"
        if [ -f "$individual_log" ]; then
            cat "$individual_log" >> "$batch_log_file"
        fi
    else
        echo "❌ FAILED: Comparison failed for $dirname" | tee -a "$batch_log_file"
        echo "❌ $dirname" >> "$summary_log_file"
        ((fail_count++))
        
        # Append the individual log to batch log
        individual_log="$temp_log_dir/comparison_${dirname}.log"
        if [ -f "$individual_log" ]; then
            cat "$individual_log" >> "$batch_log_file"
        fi
    fi
    
    echo "------------------------------------------" | tee -a "$batch_log_file"
done

# Clean up temporary directory
rm -rf "$temp_log_dir"

# Final summary
echo "" | tee -a "$batch_log_file"
echo "🎯 BATCH COMPARISON COMPLETE" | tee -a "$batch_log_file"
echo "============================" | tee -a "$batch_log_file"

if [ $fail_count -eq 0 ]; then
    echo "🎉 SUCCESS: All comparisons completed successfully!" | tee -a "$batch_log_file"
    echo "🎉 SUCCESS: All comparisons completed successfully!" >> "$summary_log_file"
else
    echo "❌ FAILURE: Some comparisons failed" | tee -a "$batch_log_file"
    echo "❌ FAILURE: Some comparisons failed" >> "$summary_log_file"
fi

echo "" | tee -a "$batch_log_file"
echo "📝 Log files created:" | tee -a "$batch_log_file"
echo "  Detailed log: $batch_log_file" | tee -a "$batch_log_file"
echo "  Summary log: $summary_log_file" | tee -a "$batch_log_file"
echo "==========================================" >> "$summary_log_file"