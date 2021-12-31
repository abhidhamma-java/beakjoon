package com.hanji.beakjoon.class3.n1012;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

//유기농배추
public class Main {
    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[][] move = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int mx = x + move[i][0];
            int my = y + move[i][1];

            if (mx >= 0 && my >= 0 && mx < M && my < N) {
                if (!visit[mx][my] && cabbage[mx][my] == 1) {
                    dfs(mx, my);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];
            visit = new boolean[M][N];

            K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbage[x][y] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (cabbage[x][y] == 1 && !visit[x][y]) {
                        //배추가 있는곳이면서 방문안한곳에 있는 배추를 찾은 다음에
                        //dfs로 한바퀴 싹 돌면서 방문을 찍는다
                        //그럼 한묶음이 된거고 묶여지면 count를 센다
                        dfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

