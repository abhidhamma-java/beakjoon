package com.hanji.beakjoon.class1.n1152;

import java.util.Scanner;

//검증수
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");


        if(s.length == 0) {
            System.out.println(0);
        } else if(s[0].equals("")) {
            System.out.println(s.length-1);
        } else if(s[s.length-1].equals("")) {
            System.out.println(s.length-1);
        } else {
            System.out.println(s.length);
        }

    }
}
