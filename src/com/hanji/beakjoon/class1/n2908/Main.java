package com.hanji.beakjoon.class1.n2908;

import java.util.Scanner;

//숫자 뒤집기 더큰수
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] sa = in.nextLine().split(" ");

        int[] csa = new int[2];

        for(int i = 0; i<sa.length; i++) {
            char[] c = sa[i].toCharArray();
            String cs = "";
            cs+=c[2];
            cs+=c[1];
            cs+=c[0];

            csa[i] = Integer.parseInt(cs);
        }

        if(csa[0] > csa[1]) {
            System.out.print(csa[0]);
        } else {
            System.out.print(csa[1]);
        }
    }
}
