package com.hanji.beakjoon.class1.n8958;

import java.util.Scanner;

//OX
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


       int num = Integer.parseInt(in.nextLine());

       for(int i = 0; i<num; i++) {
           int answer = 0;
           int cnt = 0;
           String[] s = in.nextLine().split("");
           int length = s.length;

           for(int j = 0; j<length; j++) {
               if(s[j].equals("O")) {
                   cnt += 1;
               } else if(s[j].equals("X")) {
                   cnt = 0;
               }
               answer +=cnt;
           }
           System.out.println(answer);
       }
    }
}
