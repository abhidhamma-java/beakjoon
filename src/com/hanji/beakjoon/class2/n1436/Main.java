package com.hanji.beakjoon.class2.n1436;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //666 1666 1666 3666 4666 5666 6666 7666 8666 9666 16660
        //내가 알 수 없다 1씩 증가시켜서 string으로 바꾼다음에 contains로 확인한다

        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        int goal = in.nextInt();
        while(arr.size() < goal) {
            cnt += 1;
            if(String.valueOf(cnt).contains("666")) {
                arr.add(cnt);
            }
        }
        System.out.println(arr.get(goal-1));
    }
}
