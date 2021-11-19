package com.hanji.beakjoon.class1.n3052;

import java.util.HashSet;
import java.util.Scanner;

//hashset
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(in.nextInt() % 42);
            //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }

        in.close();
        System.out.print(h.size());
    }
}
