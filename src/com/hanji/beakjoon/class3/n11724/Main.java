package com.hanji.beakjoon.class3.n11724;

import java.io.*;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//연결요소(그래프한덩어리)
class Main {
    static int N, M;   //정점, 간선
    static boolean[][] am; //인접행렬
    static boolean[] visited;//방문체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        am = new boolean[N][N];
        visited = new boolean[N];
        for(int i=0; i<M; i++) {
            st= new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            am[x][y] = am[y][x] = true;
        }

        int count = 0;
        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int node) {
        if(visited[node]) {
            return;
        }
        visited[node] = true;
        for(int i=0; i<N; i++) {
            if(am[node][i]) {
                dfs(i);
            }
        }
    }
}

