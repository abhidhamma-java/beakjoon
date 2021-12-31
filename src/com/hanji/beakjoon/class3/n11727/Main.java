package com.hanji.beakjoon.class3.n11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2xn 타일링 2
//원래 경우의 수에서 2x2가 포함된 경우의수를 더하면 되는데
//2x2가 포함된 경우의 수는 가로두개로 2x2를만든 경우의수와 같다
//dp[1] = 1
//dp[2] = 3
//dp[3] = 5 (3+1+1)
//dp[4] = 9 (5+2+2)
//dp[i] = dp[i-1] + dp[i-2] + dp[i-2]
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+2];
        dp[1] = 1;
        dp[2] = 3;

        for(int i =3; i<N+1; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}

