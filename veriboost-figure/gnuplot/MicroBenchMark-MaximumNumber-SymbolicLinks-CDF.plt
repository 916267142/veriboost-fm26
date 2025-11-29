set terminal pdfcairo font "Times New Roman,13" linewidth 1 rounded fontscale 1.35 size 26cm, 9cm

# 样式
set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey
set border 3 back linestyle 80
set grid back linestyle 81
set xtics nomirror
set ytics nomirror

set style line 1 lt rgb "#A00000" lw 2 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 2 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 2 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 2 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 2 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 2

set mytics 10
set ylabel "CCDF (%)"
set xlabel "Reduction Ratio in Symbolic Links" offset 0, 0.75
set yrange [0:100]
set ytics 20
set format y "%g%%"
set format x "%g%%"
set xrange [-10:110]
set xtic offset 0, 0.45
set offsets 5,5,0,0
set key width -0.05 Left vertical maxrows 1 reverse samplen 1 at screen 1.02, 0.94  font ',13' spacing 0.1
set bmargin screen 0.25
set tmargin at screen 0.85
set rmargin screen 0.94

set output 'results/MicroBenchMark-MaximumNumber-SymbolicLinks-CDF.pdf'
set size 1, 0.9

# ==============================
# 核心：生成多列 CCDF
# ==============================
# 用 stats 得到行数
stats 'data/MicroBenchMark-MaximumNumber-SymbolicLinks-CDF.dat' using 1 nooutput
N = STATS_records

plot \
  '< sort -n -k1,1 data/MicroBenchMark-MaximumNumber-SymbolicLinks-CDF.dat' using ($1*100):(100.*(N-($0+1)+1)/N) with lines ls 3 lw 7 title 'Link Compression', \
  '< sort -n -k2,2 data/MicroBenchMark-MaximumNumber-SymbolicLinks-CDF.dat' using ($2*100):(100.*(N-($0+1)+1)/N) with lines ls 2 lw 7 title 'Link Pruning', \
  '< sort -n -k3,3 data/MicroBenchMark-MaximumNumber-SymbolicLinks-CDF.dat' using ($3*100):(100.*(N-($0+1)+1)/N) with lines ls 5 lw 7 title 'Both Methods'