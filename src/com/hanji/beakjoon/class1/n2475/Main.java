package com.hanji.beakjoon.class1.n2475;

import java.util.Scanner;

//검증수
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");

        int answer = 0;

        for (String value : s) {
            answer += Integer.parseInt(value) * Integer.parseInt(value);
        }

        System.out.println(answer%10);
    }
}
