package com.hanji.beakjoon.class3.n1931;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

//회의실배정
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] meetingList =  new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meetingList[i][0] = Integer.parseInt(st.nextToken());
            meetingList[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetingList, (a,b)->{
            if(a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int beforeEndTime = 0;
        int count = 0;
        for(int[] meeting : meetingList) {
            int startTime = meeting[0];
            int endTime = meeting[1];
            if(beforeEndTime <= startTime) {
                beforeEndTime = endTime;
                count += 1;
            }
        }
        System.out.println(count);
    }
}

