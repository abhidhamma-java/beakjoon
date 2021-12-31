package com.hanji.beakjoon.class3.n18870;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//좌표압축
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i] = origin[i];
        }
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int i : sorted) {
            if(!map.containsKey(i)) {
                map.put(i, rank);
                rank += 1;
            }
        }
        for(int i: origin) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}

