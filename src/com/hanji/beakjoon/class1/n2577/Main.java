package com.hanji.beakjoon.class1.n2577;

import java.util.Scanner;

//숫자의 개수
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int input = in.nextInt() * in.nextInt() * in.nextInt();

        char[] chars = String.valueOf(input).toCharArray();
        int[] nums = new int[10];


        for(int i = 0; i<chars.length; i++) {
            for(int j=0; j< nums.length; j++) {
                char jtoc = String.valueOf(j).charAt(0);
                if(chars[i] == jtoc) {
                    nums[j]+=1;
                }
            }
        }

        for(int k = 0; k< nums.length; k++) {
            if(k == nums.length-1) {
                System.out.print(nums[k]);
            } else {
                System.out.println(nums[k]);
            }

        }
    }
}
