package com.hanji.beakjoon.class2.n15829;

import java.io.*;

class Main {
    static int r = 31;
    static int MOD = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            long j = s.charAt(i) - 'a' + 1;
            for (int k = 0; k < i; k++) {
                j *= r;
                j %= MOD;
            }
            ans += j;
            ans %= MOD;
        }

        System.out.print(ans);
    }
}
