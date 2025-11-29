set terminal pdfcairo font "Times New Roman,9" linewidth 1 rounded fontscale 1.2 size 45cm, 6.5cm

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

set style line 1 lt rgb "#A00000" lw 3 pt 1 ps 1.5
set style line 2 lt rgb "#74c476" lw 3 pt 6 ps 1.5
set style line 3 lt rgb "#2b8cbe" lw 3 pt 2 ps 1.5
set style line 4 lt rgb "#00A000" lw 3 pt 9 ps 1.5
set style line 5 lt rgb "#253494" lw 3 pt 12 ps 1.5
set style line 6 lt rgb "#4F4F4F" lw 3

#### set image properties
set style histogram clustered gap 1 title offset 0,-1
set style data histogram
set xtics font ", 13"
set ytics font ", 13"
set boxwidth 0.9
# set xtics border in scale 0,0 nomirror rotate by -45 autojustify
set log y
set mytics 10    # Makes logscale look good.
#set ylabel "Time (s)"

# set ytics (1e0, 1e2, 1e4, 1e6, 1e8)
# set ytics (-400, 1e0, 1e2, 1e4, 1e6, 1e8)
set format y "10^{%L}"
#set key reverse Left samplen 1 at screen 0.32, 0.95 font ',9'

#set bmargin screen 0.10
#set rmargin screen 0.10
# set label center at screen 0.21,0.065 "bics" font ',9'
#set rmargin 0.01


#set label center at screen 0.32,0.065 "columbus" font ',9' 


# set yrange[0:26]
bot=-1
# set ytics  ("-1" -1-bot, "5" 5-bot, "10" 10-bot, "15" 15-bot, "20" 20-bot, "25" 25-bot)

### output
set output 'results/AverageTime-Simulation-ThreeGraph.pdf'
set size 1, 0.9

set boxwidth 1.0

set key width -0.30 Left vertical maxrows 1 reverse samplen 1 at screen 0.82, 0.97 font ', 11'

set multiplot layout 1,3 margins 0.06, 0.97, 0.15, 0.79 spacing 0.07

# set yrange[0:200]
# bot=0
# set ytics  ("0" 0-bot, "50" 50-bot, "100" 100-bot, "150" 150-bot, "200" 200-bot)
plot "data/AverageTime-Simulation-BGP-K1.dat" u ($2-bot):xtic(1) ls 2 fs pattern 7 t'Batfish-Violation', \
     "" u ($3-bot) ls 2 fs pattern 2 t'Batfish-Hold' , \
     "" u ($4-bot) ls 3 fs pattern 7 t'VeriBoost-Violation', \
     "" u ($5-bot) ls 3 fs pattern 2 t'VeriBoost-Hold', \


# bot=-20
# set yrange[0:20000]
# set ytics  ("-2x10^1" -20-bot, "5x10^3" 5000-bot, "10x10^3" 10000-bot, "15x10^3" 15000-bot, "20x10^3" 20000-bot)
plot "data/AverageTime-Simulation-BGP-K2.dat" u ($2-bot):xtic(1) ls 2 fs pattern 7 t'Batfish-Violation', \
     "" u ($3-bot) ls 2 fs pattern 2 t'Batfish-Hold' , \
     "" u ($4-bot) ls 3 fs pattern 7 t'VeriBoost-Violation', \
     "" u ($5-bot) ls 3 fs pattern 2 t'VeriBoost-Hold', \


# bot=-2000
# set yrange[0:1220000]
# set ytics  ("-2x10^3" -2000-bot, "3x10^5" 300000-bot, "6x10^5" 600000-bot, "9x10^5" 900000-bot, "12x10^5" 1200000-bot)
plot "data/AverageTime-Simulation-BGP-K3.dat" u ($2-bot):xtic(1) ls 2 fs pattern 7 t'Batfish-Violation', \
     "" u ($3-bot) ls 2 fs pattern 2 t'Batfish-Hold' , \
     "" u ($4-bot) ls 3 fs pattern 7 t'VeriBoost-Violation', \
     "" u ($5-bot) ls 3 fs pattern 2 t'VeriBoost-Hold', \

unset multiplot