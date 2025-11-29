set terminal pdfcairo font "Times New Roman,14" linewidth 1 rounded fontscale 1.0 size 26cm, 22cm

#### set background
set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey
set grid back linestyle 81
set border 3 back linestyle 80
set xtics nomirror
set ytics nomirror

#### set linestype
set style line 1 lt rgb "#2b8cbe" lw 3 pt 8 ps 1.5
set style line 2 lt rgb "#74c476" lw 3 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 3 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 3 pt 9 ps 1.5
set style line 5 lt rgb "#74c476" lw 3 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 3

#### set image properties
set xtics font ",14"
set ytics font ",14"
set boxwidth 0.9
set log y
set format y "10^{%L}"

# y轴label
set label 'Time(s)' at screen 0.018,0.5 center rotate by 90 font ',14'
# x轴label
set label 'Tolerance Value' at screen 0.53,0.033 center font ',14'

set key width -0.05 Left vertical maxrows 2 reverse samplen 1 at screen 0.80, 1.00 font ',14' spacing 1.2
set bmargin screen 0.33
set tmargin at screen 0.9
set rmargin screen 0.87

### output
set output 'results/TotalTime-Simulation-Much-NightGraph-BGP.pdf'
set xtics offset 0, 0.5
set multiplot layout 3,3 margins 0.08, 0.98, 0.08, 0.91 spacing 0.07

set size 1, 0.9
set offsets 0.5,0.5,0,0

# 子图绘制函数
plot_subgraph(file, labelname) = \
"set label '" . labelname . "' at graph 0.5,0.92 center font ',14'; \
plot '" . file . "' u 2:xtic(1) w lp ls 1 title 'Batfish', \
     '' u 4 w lp ls 3 title 'Batfish(VeriBoost)', \
     '' u 3 w lp ls 2 title 'DNA', \
     '' u 5 w lp ls 5 title 'DNA(VeriBoost)'; unset label"

# 依次绘制每个子图
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Renater.dat', 'Renater'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Arnes.dat', 'Arnes'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Bics.dat', 'Bics'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Esnet.dat', 'Esnet'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Latnet.dat', 'Latnet'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Columbus.dat', 'Columbus'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Colt.dat', 'Colt'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Uscarrier.dat', 'Uscarrier'))
eval(plot_subgraph('data/TotalTime-Simulation-BGP-Cogentco.dat', 'Cogentco'))

unset multiplot
