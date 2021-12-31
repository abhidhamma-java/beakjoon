package com.hanji.beakjoon.class3.n11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//ATM
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine() , " ");

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int temp = 0;
        int sum = 0;
        for(int i : Arrays.stream(arr).sorted().toArray()) {
            sum += temp + i;
            temp+=i;
        }
        System.out.println(sum);
    }
}

