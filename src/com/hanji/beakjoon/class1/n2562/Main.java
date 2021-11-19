package com.hanji.beakjoon.class1.n2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최대값, 인덱스 구하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        int[] arr = new int[9];
        int count = 0;
        int max = 0;
        int index = 0;

        for(int i=0; (line = br.readLine()) != null; i++) {
            arr[i] = Integer.parseInt(line);
        }

        for(int value : arr) {
            count++;

            //모든값 중에서 더 큰 값 찾기
            if(value > max) {
                max = value;
                index = count;
            }

        }

        System.out.print(max + "\n" + index);
    }
}
