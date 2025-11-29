set terminal pdfcairo font "Times New Roman,14" linewidth 1 rounded fontscale 1.35 size 26cm, 7cm

set style line 80 lt rgb "#808080"
set style line 81 lt 0
set style line 81 lt rgb "#808080"

set grid back linestyle 81
set border 3 back linestyle 80
set xtics nomirror
set ytics nomirror

set style line 1 lt rgb "#A00000" lw 3 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 3 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 3 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 3 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 3 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 3

set xtics font ", 11"
set ytics font ", 11"
set boxwidth 0.9
set xtics border in scale 0,0 nomirror rotate by -45 autojustify
set log y
set format y "10^{%L}"
set mytics 10
set key width -0.05 Left vertical maxrows 1 reverse samplen 1 at screen 0.88, 1.08  font ',14' spacing 2
set bmargin screen 0.33
set tmargin at screen 0.9
set rmargin screen 0.87

set output 'results/TotalTime-SMT-Much-ThreeGraph-OSPF.pdf'

set style data histogram
set style histogram clustered gap 1 title offset 0,-1

set multiplot layout 1,3 margins 0.10, 0.94, 0.22, 0.83 spacing 0.07

set size 1, 0.9
set offsets 0.5,0.5,0,0

set size 1, 0.9
set offsets 0.5,0.5,0,0
set label 'k=1' at screen 0.155,0.74 center font ',14'
plot 'data/TotalTime-SMT-OSPF-Much-K1.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Minesweeper', \
	'' u 3 w histogram fs pattern 2 ls 3 t'NetSMT', \
	'' u 4 w histogram fs pattern 7 ls 5 t'VeriBoost', \

set size 1, 0.9
set offsets 0.5,0.5,0,0
set label 'k=2' at screen 0.46,0.74 center font ',14'
plot 'data/TotalTime-SMT-OSPF-Much-K2.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Minesweeper', \
	'' u 3 w histogram fs pattern 2 ls 3 t'NetSMT', \
	'' u 4 w histogram fs pattern 7 ls 5 t'VeriBoost', \

set size 1, 0.9
set offsets 0.5,0.5,0,0
set label 'k=3' at screen 0.76,0.74 center font ',14'
plot 'data/TotalTime-SMT-OSPF-Much-K3.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Minesweeper', \
	'' u 3 w histogram fs pattern 2 ls 3 t'NetSMT', \
	'' u 4 w histogram fs pattern 7 ls 5 t'VeriBoost', \
