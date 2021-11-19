package com.hanji.beakjoon.class2.n2231;

import java.util.Scanner;

//분해합 <=> 생성자
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int answer = 0;
        int n = Integer.parseInt(in.nextLine());
        int min = 1000001;

        //덧셈이니까 생성자는 항상 n 자신보다 작다
        //999라고 하면 27인데 생성자는 아무리 작아도 n-27 보다크다
        //n-27<answer<n

        for(int i = 0; i<n; i++) {
            int compare = i;
            char[] arr =  String.valueOf(i).toCharArray();

            for(char c : arr) {
                compare += Integer.parseInt(String.valueOf(c));
            }

            if(compare == n) {
                if(i < min) {
                    min = i;
                }
            }
        }

        if(min == 1000001) {
            System.out.print(0);
        } else {
            System.out.print(min);
        }


    }
}
