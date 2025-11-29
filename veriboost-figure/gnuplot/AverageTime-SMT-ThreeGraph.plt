set terminal pdfcairo font "Times New Roman,9" linewidth 1 rounded fontscale 1.2 size 30cm, 6cm

set style line 80 lt rgb "#808080"
set style line 81 lt 0 # dashed
set style line 81 lt rgb "#808080" # grey
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

set style histogram clustered gap 1 title offset 0,-1
set style data histogram
set xtics font ", 13"
set ytics font ", 13"
set boxwidth 0.9

set yrange[0:26]
bot=-1
set ytics  ("-1" -1-bot, "5" 5-bot, "10" 10-bot, "15" 15-bot, "20" 20-bot, "25" 25-bot)

set output 'results/AverageTime-SMT-ThreeGraph.pdf'
set size 1, 0.9

set boxwidth 1.0

set key width -0.30 Left vertical maxrows 2 reverse samplen 1 at screen 0.75, 1.00 font ', 11'

set multiplot layout 1,3 margins 0.07, 0.97, 0.17, 0.73 spacing 0.05

set yrange[0:5]
bot=0
set ytics  ("0" 0-bot, "1" 1-bot, "2" 2-bot, "3" 3-bot, "4" 4-bot, "5" 5-bot)
plot "data/AverageTime-SMT-BGP-Bics.dat" u ($2/1000-bot):xtic(1) ls 2 fs pattern 7 t'Minesweeper-SAT', \
     "" u ($3/1000-bot) ls 2 fs pattern 2 t'Minesweeper-UNSAT' , \
     "" u ($4/1000-bot) ls 3 fs pattern 7 t'NetSMT-SAT', \
     "" u ($5/1000-bot) ls 3 fs pattern 2 t'NetSMT-UNSAT', \
     "" u ($6/1000-bot) ls 5 fs pattern 7 t'VeriBoost-SAT', \
     "" u ($7/1000-bot) ls 5 fs pattern 2 t'VeriBoost-UNSAT', \
     
bot=0
set yrange[0:50]
set ytics  ("0" 0-bot, "10" 10-bot, "20" 20-bot, "30" 30-bot, "40" 40-bot, "50" 50-bot)
plot "data/AverageTime-SMT-BGP-Columbus.dat" u ($2/1000-bot):xtic(1) ls 2 fs pattern 7 t'Minesweeper-SAT', \
     "" u ($3/1000-bot) ls 2 fs pattern 2 t'Minesweeper-UNSAT' , \
     "" u ($4/1000-bot) ls 3 fs pattern 7 t'NetSMT-SAT', \
     "" u ($5/1000-bot) ls 3 fs pattern 2 t'NetSMT-UNSAT', \
     "" u ($6/1000-bot) ls 5 fs pattern 7 t'VeriBoost-SAT', \
     "" u ($7/1000-bot) ls 5 fs pattern 2 t'VeriBoost-UNSAT', \

bot=-10
set yrange[0:210]
set ytics  ("-10" -10-bot, "40" 40-bot, "80" 80-bot, "120" 120-bot, "160" 160-bot, "200" 200-bot)
plot "data/AverageTime-SMT-BGP-Uscarrier.dat" u ($2/1000-bot):xtic(1) ls 2 fs pattern 7 t'Minesweeper-SAT', \
     "" u ($3/1000-bot) ls 2 fs pattern 2 t'Minesweeper-UNSAT' , \
     "" u ($4/1000-bot) ls 3 fs pattern 7 t'NetSMT-SAT', \
     "" u ($5/1000-bot) ls 3 fs pattern 2 t'NetSMT-UNSAT', \
     "" u ($6/1000-bot) ls 5 fs pattern 7 t'VeriBoost-SAT', \
     "" u ($7/1000-bot) ls 5 fs pattern 2 t'VeriBoost-UNSAT', \

unset multiplot