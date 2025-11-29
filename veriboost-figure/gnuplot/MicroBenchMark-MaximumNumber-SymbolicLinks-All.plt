set terminal pdfcairo font "Times New Roman,13" linewidth 1 rounded fontscale 1.35 size 26cm, 11cm

set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey
set border 3 back linestyle 80
set grid back linestyle 81
set xtics nomirror
set ytics nomirror

# 自定义颜色和线条
set style line 1 lt rgb "#A00000" lw 2 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 2 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 2 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 2 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 2 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 2

set mytics 10
set ylabel "# of Link Status"
set xlabel "The ID of datasets"

set xrange [0:260]
set xtics 50
set xtics offset 0

set key width -0.05 Left vertical maxrows 3 reverse samplen 1 at screen 0.40, 0.88 font ',13' spacing 1.2
set bmargin screen 0.25
set tmargin at screen 0.9
set rmargin screen 0.96

set output 'results/MicroBenchMark-MaximumNumber-SymbolicLinks-All.pdf'
set size 1, 0.9

# 堆叠面积图
plot 'data/MicroBenchMark-MaximumNumber-SymbolicLinks-All.dat' u 1:($2+$3+$4) ls 5 with filledcurves x1 title 'Down', \
     '' u 1:($2+$3) ls 3 with filledcurves x1 title 'Up', \
     '' u 1:($2) ls 2 with filledcurves x1 title 'Symbolic'
