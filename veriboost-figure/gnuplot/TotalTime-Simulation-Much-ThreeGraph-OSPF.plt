set terminal pdfcairo font "Times New Roman,11" linewidth 1 rounded fontscale 1.35 size 26cm, 7cm

#### set background
# Line style for axes
set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey

# Remove border on top and right.  These
# borders are useless and make it harder
# to see plotted lines near the border.
# Also, put it in grey; no need for so much emphasis on a border.
set grid back linestyle 81
set border 3 back linestyle 80
set xtics nomirror
set ytics nomirror


#### set linestype
# Line styles: try to pick pleasing colors, rather
# than strictly primary colors or hard-to-see colors
# like gnuplot's default yellow.  Make the lines thick
# so they're easy to see in small plots in papers.

set style line 1 lt rgb "#A00000" lw 2 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 2 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 2 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 2 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 2 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 2

#### set image properties
#set style histogram clustered gap 1 title offset 0,-1
#set style data histogram
set xtics font ", 11"
set ytics font ", 11"
set boxwidth 0.9
#set xtics border in scale 0,0 nomirror rotate by -45 autojustify
set log y
set format y "10^{%L}"
set mytics 10    # Makes logscale look good.
#set ylabel "# of Symbolic Links"
#set yrange[0: 250]
#set ytics (0, 50, 100, 150, 200, 250)
#set xrange[-1:4]
#set offsets 2,2,1,1
#set xtics ("bics" 1, "columbus" 2, "uscarrier" 3)
#set format y "10^{%L}"
#set key reverse Left samplen 3 at screen 0.52, 0.95 font ',9'
set key width -3 Left vertical maxrows 1 reverse samplen 1 at screen 1.05, 1.02 font ',11' spacing 1.3
set bmargin screen 0.33
set tmargin at screen 0.9
set rmargin screen 0.87

#set label center at screen 0.30,0.065 "Bics" 
#set label center at screen 0.56,0.065 "Columbus" 
#set label center at screen 0.82,0.065 "Uscarrier"  

### output
set output 'results/TotalTime-Simulation-Much-ThreeGraph-OSPF.pdf'

#set size 1, 0.9
#set offsets 0.5,0.5,0,0

set multiplot layout 1,3 margins 0.10, 0.94, 0.22, 0.80 spacing 0.07

set size 1, 0.9
set offsets 0.5,0.5,0,0
plot 'data/TotalTime-Simulation-OSPF-Much-K1.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Batfish', \
	'' u 4 w histogram fs pattern 2 ls 3 t'Batfish(VeriBoost)', \
	'' u 3 w histogram fs pattern 3 ls 3 t'DNA', \
	'' u 5 w histogram fs pattern 7 ls 5 t'DNA(VeriBoost)', \


set size 1, 0.9
set offsets 0.5,0.5,0,0
plot 'data/TotalTime-Simulation-OSPF-Much-K2.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Batfish', \
	'' u 4 w histogram fs pattern 2 ls 3 t'Batfish(VeriBoost)', \
	'' u 3 w histogram fs pattern 3 ls 3 t'DNA', \
	'' u 5 w histogram fs pattern 7 ls 5 t'DNA(VeriBoost)', \


set size 1, 0.9
set offsets 0.5,0.5,0,0
plot 'data/TotalTime-Simulation-OSPF-Much-K3.dat' u 2:xtic(1) w histogram fs pattern 3 ls 2 t'Batfish', \
	'' u 4 w histogram fs pattern 2 ls 3 t'Batfish(VeriBoost)', \
	'' u 3 w histogram fs pattern 3 ls 3 t'DNA', \
	'' u 5 w histogram fs pattern 7 ls 5 t'DNA(VeriBoost)', \