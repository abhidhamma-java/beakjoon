package com.hanji.beakjoon.class3.n11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//구간 합 구하기 4
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N+1];
        int sum = 0;
        for(int i=1; i<N+1; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = sum + num;
            sum += num;

        }

        //[0,1,2,3,4,5]
        //[0,1,3(1+2),6(1+2+3),10(1+2+3+4),15(1+2+3+4+5)]
        //1~2번째 누적합 구하려면 arr[2] - arr[0]
        //i~j번째 누적합 구하려면 arr[j] - arr[i-1]
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(arr[j]-arr[i-1]).append("\n");
        }
        System.out.println(sb);
    }
}

