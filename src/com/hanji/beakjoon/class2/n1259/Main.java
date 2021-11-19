package com.hanji.beakjoon.class2.n1259;

import java.util.Scanner;

//문자뒤집기
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = "";
        while(!(line = in.nextLine()).equals("0")) {
            StringBuilder sb = new StringBuilder(line);
            String reversedLine = sb.reverse().toString();

            //char로 만들어서 뒤집기
//            char[] arr = line.toCharArray();
//            char[] reversedArr = new char[arr.length];
//            for(int i=0; i<arr.length; i++) {
//                reversedArr[arr.length-1-i] = arr[i];
//            }

            if(line.equals(reversedLine)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
