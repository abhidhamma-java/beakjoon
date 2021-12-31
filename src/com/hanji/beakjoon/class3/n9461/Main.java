package com.hanji.beakjoon.class3.n9461;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//파도반수열
//dp[0] = 1
//dp[1] = 1
//dp[2] = 1
//dp[3] = 2 (dp[0]+dp[1])
//dp[4] = 2 (dp[1]+dp[2])
//dp[5] = 3 (dp[2]+dp[3])
//dp[6] = 4 (dp[3]+dp[4])
//dp[7] = 5 (dp[4]+dp[5])
//dp[8] = 7 (dp[5]+dp[6])
//dp[9] = 9 (dp[6]+dp[7])
//dp[n] = dp[n-2] + dp[n-3]
public class Main {
    static long[] seq = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        padovan();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(seq[Integer.parseInt(br.readLine())]).append('\n');
        }

        System.out.println(sb);
    }
    public static void padovan() {
        seq[1] = 1;
        seq[2] = 1;
        seq[3] = 1;

        for (int i = 4; i < 101; i++) {
            seq[i] = seq[i - 2] + seq[i - 3];
        }
    }
}

