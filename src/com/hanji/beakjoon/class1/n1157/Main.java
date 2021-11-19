package com.hanji.beakjoon.class1.n1157;

import java.util.Arrays;
import java.util.Scanner;

//단어공부
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner("Mississipi");

        char[] cs = in.nextLine().toLowerCase().toCharArray();

        int[] alphabetBox = new int[26];
        Arrays.fill(alphabetBox, 0);

        for (char c : cs) {
            alphabetBox[c - 'a'] += 1;
            //alphabetBox[c-'a'] : char인 'a'는 ascii가 int로 97이다
            // c-'a'했을때 c가 알파벳소문자면 a가 0 b가 1 ... z가 25에 들어간다
        }

        int max = 0;
        int index = 0;
        int count = 0;
        for(int i = 0; i<alphabetBox.length; i++) {
            if(alphabetBox[i] > max) {
                max = alphabetBox[i];
                index = i;
                count+=1;
            }
        }

        if(count == 2) {
            System.out.println("?");
        } else {
            System.out.println(cs['a'-index]);
        }






        System.out.println();
    }
}
