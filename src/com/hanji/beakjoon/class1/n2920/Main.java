package com.hanji.beakjoon.class1.n2920;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        sc.close();

        String output = "";
        for (int i = 0; i < inputs.length - 1; i++) {

            // 1 2 3 4 5 6 7 8 ...
            if (inputs[i] == inputs[i + 1] - 1) {
                output = "ascending";

            // 8 7 6 5 4 3 2 1 ...
            } else if (inputs[i] == inputs[i + 1] + 1) {
                output = "descending";

            //한번이라도 어긋나면 break
            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}