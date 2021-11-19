package com.hanji.beakjoon.class2.n2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}

////설탕배달
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner("101");
//
//        int goal = Integer.parseInt(in.nextLine());
//
//        if(goal == 4 || goal == 7) {
//            System.out.print(-1);
//        } else if (goal % 5 == 0) {
//            System.out.print(goal/5);
//        } else if ((goal % 5) % 3 == 0) {
//            System.out.print(goal/5 + goal%5/3);
//        } else if (goal % 3 == 0) {
//            System.out.print(goal/3);
//        } else {
//            int count = 0;
//            while(goal-count * 5 > 0) {
//                int testCase = goal%5 + count*5;
//                if(testCase % 3 == 0) {
//                    System.out.print(goal/3 + goal/3/5);
//                    break;
//                }
//                count += 1;
//            }
//        }
//
//    }
//}
