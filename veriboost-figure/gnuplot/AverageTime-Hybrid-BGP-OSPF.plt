set terminal pdfcairo font "Times New Roman,13" linewidth 1 rounded fontscale 1.35 size 26cm, 8cm

#### set background
set style line 80 lt rgb "#808080"
set style line 81 lt 0
set style line 81 lt rgb "#808080"
set grid back linestyle 81
set border 3 back linestyle 80
set xtics nomirror
set ytics nomirror
# set log y
# set format y "10^{%L}"

#### set linestype
set style line 1 lt rgb "#A00000" lw 2 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 2 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 2 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 2 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 2 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 2

set label center at screen 0.20,0.69 "BGP"
set label center at screen 0.22,0.065 "Bic"
set label center at screen 0.315,0.065 "Col"
set label center at screen 0.415,0.065 "Usc"

set label center at screen 0.67,0.69 "OSPF"
set label center at screen 0.65,0.065 "Bic"
set label center at screen 0.76,0.065 "Col"
set label center at screen 0.86,0.065 "Usc"

# set label center at screen 0.43,0.065 "BGP"
# set label center at screen 0.81,0.065 "OSPF"

#### set image properties
set style histogram clustered gap 1 title offset 0,-1
set style data histogram
# set boxwidth 0.3
set xtics border in scale 0,0 nomirror rotate by -45 autojustify
set mytics 10

set key width -0.05 Left vertical maxrows 1 reverse samplen 1 at screen 0.73, 0.99 font ',13' spacing 1.2
set bmargin screen 0.35
set rmargin screen 0.94
set tmargin at screen 0.9
# set xtic offset 0, 0.4
set offsets 0.5,0.5,0,0

### output
set output 'results/AverageTime-Hybrid-BGP-OSPF.pdf'
set size 1, 0.9

set multiplot layout 1,2 margins 0.13, 0.94, 0.32, 0.80 spacing 0.07
set ylabel "Time(s)"
set yrange [0.2:1.0]
set ytics 0.2
plot "data/AverageTime-Hybrid-BGP.dat" u 2:xtic(1) ls 2 fs pattern 3 t'SRE', \
     "" u 3 ls 3 fs pattern 2 t'VeriBoost'

unset ylabel
set yrange [0:16]
set ytics 3
plot "data/AverageTime-Hybrid-OSPF.dat" u 2:xtic(1) ls 2 fs pattern 3 t'SRE', \
     "" u 3 ls 3 fs pattern 2 t'VeriBoost'