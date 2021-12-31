package com.hanji.beakjoon.class3.n11726;

import java.io.*;
import java.util.StringTokenizer;

//2xn 타일링
//dp[1] = 1
//dp[2] = 2
//dp[3] = 3 : (1+2)
//dp[4] = 5 : (2+3)
//dp[n] = dp[n-1] + dp[n-2]
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+2];
        dp[1] = 1;
        dp[2] = 2;

        for(int i =3; i<N+1; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}

