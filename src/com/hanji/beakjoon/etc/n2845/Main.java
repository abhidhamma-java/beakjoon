package com.hanji.beakjoon.etc.n2845;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//파티가 끝나고 난 뒤
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int avgPeople = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        int areaPerPeople = avgPeople * area;

        st = new StringTokenizer(br.readLine());

        for(int i =0; i<5; i++) {
            int realPeople = Integer.parseInt(st.nextToken());
            sb.append(realPeople - areaPerPeople).append(" ");
        }

        System.out.println(sb);
    }
}

