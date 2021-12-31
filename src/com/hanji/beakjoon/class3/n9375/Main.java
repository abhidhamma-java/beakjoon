package com.hanji.beakjoon.class3.n9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//패션왕신해빈(조합)
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();

                if(map.containsKey(kind)) {
                    map.put(kind, map.get(kind)+1);
                } else {
                    map.put(kind, 1);
                }
            }
            int result = 1;

            for(int count: map.values()) {
                result *= (count+1);
            }
            sb.append(result -1).append('\n');
        }
        System.out.println(sb);
    }
}

