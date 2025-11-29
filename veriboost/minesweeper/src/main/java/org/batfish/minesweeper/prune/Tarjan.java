package org.batfish.minesweeper.prune;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//
// Tarjan algorithm to find 'point bi-connected connect_component'
// This code is modified from ACM template and is tested by online website.
// The website of code : https://www.luogu.com.cn/problem/solution/P8435
// The website of testing : https://www.luogu.com.cn/problem/P8435
//

public class Tarjan {
    int cnt = 1, idx, n, m, top, bcc, root;

    int[] fir, nxt, to, s, low, dfn;

    HashSet<Integer> cut_points;

    HashMap<Integer, HashSet<Integer>> connect_components;


    void resize() {
        int N = n + 5;
        int M = 2 * m + 5;

        fir = new int[N];
        low = new int[N];
        dfn = new int[N];

        nxt = new int[M];
        to = new int[M];
        s = new int[M];

        top = bcc = idx = 0;
        cnt = 1;
        connect_components = new HashMap<>();
        cut_points = new HashSet<>();

        for (int i = 0; i < N; i++) {
            fir[i] = low[i] = dfn[i] = 0;
        }
        for (int i = 0; i < M; i++) {
            nxt[i] = to[i] = s[i] = 0;
        }

    }

    void tarjanCore(int u, int fa) {
        int son = 0;
        low[u] = dfn[u] = ++idx;
        s[++top] = u;
        for (int i = fir[u]; i != 0; i = nxt[i]) {
            int v = to[i];
            if (dfn[v] == 0) {
                son++;
                tarjanCore(v, u);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] >= dfn[u]) {
                    bcc++;
                    connect_components.put(bcc, new HashSet<>());
                    while (s[top + 1] != v) connect_components.get(bcc).add(s[top--]);
                    connect_components.get(bcc).add(u);
                    if (fa != 0) {
                        cut_points.add(u);
                    }
                }

            } else if (v != fa) low[u] = Math.min(low[u], dfn[v]);
        }
        if (fa == 0 && son == 0) {
            connect_components.get(++bcc).add(u);
            cut_points.add(u);
        }
    }


    public void addEdge(int u, int v) {
        to[++cnt] = v;
        nxt[cnt] = fir[u];
        fir[u] = cnt;
    }


    public void tarjanRun() {
        for (int i = 1; i <= n; i++) {
            if (dfn[i] == 0) {
                top = 0;
                root = i;
                tarjanCore(i, 0);
            }
        }
    }

    public void setNodeNum(int n) {
        this.n = n;
    }

    public void setLinkNum(int m) {
        this.m = m;
    }

    public HashSet<Integer> getCutPoints() {
        return cut_points;
    }

    public HashMap<Integer, HashSet<Integer>> getConnectComponents() {
        return this.connect_components;
    }

    public static void test() {
        Tarjan tarjan = new Tarjan();
        Scanner scanner = new Scanner(System.in);
        tarjan.n = scanner.nextInt();
        tarjan.m = scanner.nextInt();
        tarjan.resize();
        for (int i = 1; i <= tarjan.m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            tarjan.addEdge(x, y);
            tarjan.addEdge(y, x);
        }
        tarjan.tarjanRun();
        System.out.println(tarjan.bcc);
        for (int i = 1; i <= tarjan.bcc; i++) {
            System.out.print(tarjan.connect_components.get(i).size() + " ");
            for (int j : tarjan.connect_components.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
The following are the test examples.

Example1:
input:
6 5
1 3
2 4
1 2
4 6
2 3
output:
4
2 4 6
2 2 4
3 1 2 3
1 5

Example2:
input:
7 8
1 3
2 4
3 5
2 5
6 4
2 5
6 3
2 7
output:
4
2 6 4
2 4 2
3 3 2 1
1 5

Example3:
input:
5 3
1 2
2 3
1 3
output:
3
1 4
1 5
3 1 2 3
*/