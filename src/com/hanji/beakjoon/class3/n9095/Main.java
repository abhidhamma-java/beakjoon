package com.hanji.beakjoon.class3.n9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1, 2, 3 더하기
// dp[1] - 1 (1)
// dp[2] - 1+1, 2  (2)
// dp[3] - 1+1+1, 1+2, 2+1, 3 (4)
// dp[4] - 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 (7)
// 1+2+4=7
// dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int max = 11;
        int[] dp = new int[max];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<max; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
    }
}

