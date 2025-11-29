set terminal pdfcairo font "Times New Roman,13" linewidth 1 rounded fontscale 1.35 size 26cm, 9cm

#### set background
set style line 80 lt rgb "#808080"
set style line 81 lt 0
set style line 81 lt rgb "#808080"
set grid back linestyle 81
set border 3 back linestyle 80
set xtics nomirror
set ytics nomirror
set log y
set format y "10^{%L}"

#### set linestype
set style line 1 lt rgb "#A00000" lw 3 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 3 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 3 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 3 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 3 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 3

#### set image properties
# set style histogram clustered gap 1 title offset 0,-1
# set style data histogram
# set boxwidth 0.3
# set xtics border in scale 0,0 nomirror rotate by -45 autojustify
set mytics 10
set ylabel "# of Scenarios"
set key width -0.05 Left vertical maxrows 3 reverse samplen 1 at screen 0.64, 0.98 font ',13' spacing 1.2
set bmargin screen 0.15
set rmargin screen 0.94
set tmargin at screen 0.9
set xtic offset 0, 0.4
set offsets 0.5,0.5,0,0

### output
set output 'results/MicroBenchMark-LinksNumber-Aggregation.pdf'
set size 1, 0.9

# 使用三列数据绘制柱状图
plot "data/MicroBenchMark-LinksNumber-Aggregation.dat" u 2:xtic(1) w lp ls 2 t'Enumeration', \
     "" u 3 w lp ls 3 t'VeriBoost (W/O Aggregating)', \
     "" u 4 w lp ls 5 t'VeriBoost (W/ Aggregating)'
