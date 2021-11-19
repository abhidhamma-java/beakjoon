package com.hanji.beakjoon.class2.n2798;

import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nm = in.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] nums = in.nextLine().split(" ");

        //1,2,3,4,5
        //123, 124, 125, 134, 135, 145, 234, 235, 245, 345 : 10개
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = Integer.parseInt(nums[i])+Integer.parseInt(nums[j])+Integer.parseInt(nums[k]);
                    if(sum <= m) {
                        set.add(sum);
                    }
                }
            }
        }

        int fit = 100001;
        int answer = 0;
        for(int sum : set){
            if(m-sum < fit) {
                fit = m-sum;
                answer = sum;
            }
        }
        System.out.print(answer);
    }
}
