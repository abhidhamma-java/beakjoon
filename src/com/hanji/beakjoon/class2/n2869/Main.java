package com.hanji.beakjoon.class2.n2869;

import java.util.Scanner;

//시간초과
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int up = in.nextInt();
        int down = in.nextInt();
        int length = in.nextInt();

        int day = (length - down) / (up - down);

        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}

//import java.util.Scanner;
////시간초과
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        String[] s = in.nextLine().split(" ");
//
//        int A = Integer.parseInt(s[0]);
//
//        int B = Integer.parseInt(s[1]);
//
//        int V = Integer.parseInt(s[2]);
//
//        int day = 0;
//        int length = 0;
//
//        while(length < V) {
//            day += 1;
//
//            length += A;
//
//            if(length >= V) {
//                System.out.println(day);
//                break;
//            }
//
//            if(length - B < 0) {
//                length = 0;
//            } else {
//                length -=B;
//            }
//        }
//    }
//}