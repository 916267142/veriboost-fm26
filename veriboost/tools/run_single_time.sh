#!/bin/bash

# Check if input directory is provided
if [ $# -lt 1 ]; then
    echo "Usage: $0 input_dir"
    exit 1
fi

input_dir="$1"
output="$input_dir/all_summary.csv"
> "$output"   # Clear output file

# Write CSV header
echo "SubDir,FileName,Tolerance,TotalTimeSum" >> "$output"

# Iterate through each subdirectory in the first level
for subdir in "$input_dir"/*; do
    if [ -d "$subdir" ]; then
        # Iterate through each file in the second level directory
        for input in "$subdir"/*; do
            if [ -f "$input" ]; then
                # Check if file is valid (at least 9 columns and has TotalTime header)
                if head -1 "$input" | grep -q "TotalTime"; then
                    file_name=$(basename "$input")
                    awk -F'\t' -v subdir="$(basename "$subdir")" -v file="$file_name" '
                    NR > 1 {
                        if (NF >= 9) {
                            tolerance[$3] += $8
                        }
                    }
                    END {
                        for (t in tolerance) {
                            printf "%s,%s,%s,%.3f\n", subdir, file, t, tolerance[t]
                        }
                    }' "$input" | sort -t, -k3,3n >> "$output"
                    echo "Processed: $input"
                else
                    echo "Skipping invalid file: $input"
                fi
            fi
        done
    fi
done

echo "Final summary CSV has been output to: $output"