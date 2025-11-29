#!/bin/bash

# Check input parameters
if [ $# -ne 2 ]; then
    echo "❌ Usage: $0 <directory1> <directory2>"
    exit 1
fi

dir1="$1"
dir2="$2"
log_file="comparison.log"

# Clear or create log file
> "$log_file"

echo "🔍 Starting comparison of properties_summary.txt in $dir1 and $dir2..."
echo "🔍 Starting comparison of properties_summary.txt in $dir1 and $dir2..." >> "$log_file"

# Check if files exist
file1="$dir1/properties_summary.txt"
file2="$dir2/properties_summary.txt"

if [ ! -f "$file1" ]; then
    echo "❌ ERROR: $file1 does not exist"
    echo "❌ ERROR: $file1 does not exist" >> "$log_file"
    exit 1
fi

if [ ! -f "$file2" ]; then
    echo "❌ ERROR: $file2 does not exist"
    echo "❌ ERROR: $file2 does not exist" >> "$log_file"
    exit 1
fi

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

echo "📊 Extracting verified numbers from Running section..." | tee -a "$log_file"

numbers1=($(extract_verified_numbers "$file1"))
numbers2=($(extract_verified_numbers "$file2"))

# Debug output
echo "Extracted from $file1: ${numbers1[@]}" | tee -a "$log_file"
echo "Extracted from $file2: ${numbers2[@]}" | tee -a "$log_file"

# Check if we extracted exactly 3 numbers from each file
if [ ${#numbers1[@]} -ne 3 ]; then
    echo "❌ ERROR: Expected 3 verified numbers in $file1, but found ${#numbers1[@]}" | tee -a "$log_file"
    exit 1
fi

if [ ${#numbers2[@]} -ne 3 ]; then
    echo "❌ ERROR: Expected 3 verified numbers in $file2, but found ${#numbers2[@]}" | tee -a "$log_file"
    exit 1
fi

# Compare values
all_match=true
echo "" | tee -a "$log_file"
echo "📊 Comparison Results:" | tee -a "$log_file"
echo "======================" | tee -a "$log_file"

for i in {0..2}; do
    k=$((i + 1))
    
    if [ "${numbers1[$i]}" = "${numbers2[$i]}" ]; then
        result="✅ MATCH"
    else
        result="❌ MISMATCH"
        all_match=false
    fi
    
    output_line="k=$k (verified): $dir1=${numbers1[$i]}, $dir2=${numbers2[$i]} - $result"
    echo "$output_line" | tee -a "$log_file"
done

# Final summary
echo "" | tee -a "$log_file"
echo "🎯 FINAL SUMMARY" | tee -a "$log_file"
echo "================" | tee -a "$log_file"
if $all_match; then
    final_result="🎉 SUCCESS: All verified 'Numb of k' values in Running section match perfectly!"
else
    final_result="⚠️ WARNING: Some verified 'Numb of k' values in Running section do not match"
fi

echo "$final_result" | tee -a "$log_file"
echo "📝 Detailed log saved to: $log_file"