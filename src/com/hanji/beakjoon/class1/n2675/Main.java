package com.hanji.beakjoon.class1.n2675;

import java.util.Scanner;

//문자열 반복
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner("2\n" +
                "3 ABC\n" +
                "5 /HTP");

        //nextInt로 입력받으면 개행문자를 입력받는다
        int cnt = Integer.parseInt(in.nextLine());


        for (int i = 0; i < cnt; i++) {
            String[] s = in.nextLine().split(" ");
            String oneResult = "";

            char[] cs = s[1].toCharArray();

            for (char c : cs) {
                for (int j = 0; j < Integer.parseInt(s[0]); j++) {
                    oneResult += c;
                }
            }
            System.out.println(oneResult);
        }
    }
}
