package com.hanji.beakjoon.class2.n7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        String[] wh = new String[num];

        for(int i=0; i<num; i++) {
            String s = in.nextLine();
            wh[i] = s;
        }

        for(int i=0; i<num; i++) {
            int rank = 0;
            for(String s: wh) {
                //t1:원래값 t2:비교대상
                String[] t1 = wh[i].split(" ");
                String[] t2 = s.split(" ");

                int t1w = Integer.parseInt(t1[0]);
                int t2w = Integer.parseInt(t2[0]);
                int t1h = Integer.parseInt(t1[1]);
                int t2h = Integer.parseInt(t2[1]);

                //몸무게,키 비교
                if(t1w < t2w && t1h < t2h) {
                    rank += 1;
                }
            }
            System.out.print(rank+1+" ");
        }

    }
}
