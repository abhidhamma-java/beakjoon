package com.hanji.beakjoon.class2.n2292;

import java.util.Scanner;

//계차수열
// 1 , 2~7=6, 8~19 = 12, 20~37 = 18, 38~61 = 24
// 개수 1, 7, 19, 37 ...
// 계차수열
// 1+ n(6+6n) / 2
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
        int count = 1; //최소루트
        int range = 2; //범위(최솟값 기준)

        //1 ~ 1(1) - 1개의 방
        //2 ~ 7(+6) - 2개의 방
        //8 ~ 19(+12) - 3개의 방
        //20 ~ 37(+18) - 4개의 방
        //38 ~ 61(+24) - 5개의 방

        if(N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
