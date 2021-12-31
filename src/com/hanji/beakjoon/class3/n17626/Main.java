package com.hanji.beakjoon.class3.n17626;


import java.io.*;
import java.util.StringTokenizer;

//Four Squares
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        dp[0] = 0;
        dp[1] = 1;

        int min = 0;

        //이전의 다이나믹테이블을 채운다
        for (int i = 2; i <= N; i++) {
            min = Integer.MAX_VALUE;

            //최소 가짓수를 고르기 위해
            //i에서 i보다 작은 제곱수에서 뺀값중 최소값을 선택한다
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }

        System.out.println(dp[N]);
    }
}

