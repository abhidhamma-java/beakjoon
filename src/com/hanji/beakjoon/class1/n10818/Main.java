package com.hanji.beakjoon.class1.n10818;

import java.util.Scanner;

//string to ascii
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        String[] s = in.nextLine().split(" ");

        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i<num; i++) {
            int value = Integer.parseInt(s[i]);
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }
        System.out.println(min + " " + max);
    }
}
