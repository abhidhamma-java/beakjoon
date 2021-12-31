package com.hanji.beakjoon.class3.n1003;


import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;

//피보나치 함수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] testCase = new int[T];

        for (int i = 0; i < T; i++) {
            testCase[i] = Integer.parseInt(br.readLine());
        }
        int max = Arrays.stream(testCase).max().getAsInt();


        int[][] dp = new int[max+1][2];

        //dp[0]
        dp[0][0] = 1;
        dp[0][1] = 0;

        //dp[1]
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= max; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i : testCase) {
            sb.append(dp[i][0] + " " + dp[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}

