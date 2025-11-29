set terminal pdfcairo font "Times New Roman,13" linewidth 1 rounded fontscale 1.35 size 26cm, 11cm

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

set style histogram clustered gap 1 title offset 0,-1
set style histogram rowstacked
set style data histogram

set boxwidth 0.22

set mytics 10    # Makes logscale look good.
set ylabel "Average Time (us)"
set xlabel "The ID of datasets"
set xrange[0: 260]
set xtics 50
set xtics offset 0

set key width -0.05 Left vertical maxrows 3 reverse samplen 1 at screen 0.52, 0.95  font ',13' spacing 1.2
set bmargin screen 0.25
set tmargin at screen 0.9
set rmargin screen 0.94

set output 'results/MicroBenchMark-AverageTime-EachStep-All.pdf'
set size 1, 0.9

plot 'data/MicroBenchMark-AverageTime-EachStep-All.dat' u 2 ls 2 fs pattern 3 t'Property Trimming', \
     '' u 3 ls 3 fs pattern 2 t'Link Pruning' , \
     '' u 4 ls 5 fs pattern 7 t'Link Compression'