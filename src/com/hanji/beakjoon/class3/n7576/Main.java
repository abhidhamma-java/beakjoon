package com.hanji.beakjoon.class3.n7576;

import java.io.*;
import java.util.StringTokenizer;


public class Main {

    static int M, N;
    static int[][] storage;
    static int count;
    static int[][] coordinate = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        String input = "6 4\n" +
                "0 0 0 0 0 0\n" +
                "0 0 0 0 0 0\n" +
                "0 0 0 0 0 0\n" +
                "0 0 0 0 0 1";
        InputStream is = new ByteArrayInputStream(input.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        storage = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                storage[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (isRipeAll()) {
            System.out.println(0);
        } else {
            dfs();
            if (isRipeAll()) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }

    static void dfs() {
        if (isRipeAll()) {
            return;
        }
        count += 1;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int tomato = storage[i][j];
                if (tomato == 1) {
                    for(int k=0; k<4; k++) {
                        int x = i+coordinate[k][0];
                        int y = j+coordinate[k][1];
                        if(x>0 && x<M && y>0 && y<N && storage[x][y] == 0) {
                            storage[x][y] = 1;
                        }

                    }
                }
            }
        }
    }

    //토마토가 다 익었는지 확인
    static boolean isRipeAll() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int tomato = storage[i][j];
                if (tomato == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

