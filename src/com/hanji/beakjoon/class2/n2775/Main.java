package com.hanji.beakjoon.class2.n2775;

import java.util.Scanner;

//0층 1호 1명, 2호 2명, ... , n호 n명
//1층 1호 1명, 2호 1+2명, 3호 1+2+3명,... , n호 1+2+...+n명
//2층 1호 1명, 2호 1+1+2명, ... , n호
//k층 1호 1명, 2호 1(k-1)+2명,3호 1(k-1)+2(k-1)+3명 ... , n호
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = Integer.parseInt(in.nextLine());

        int[][] APT = new int[15][15];

        for(int i=0; i<15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for(int i=1; i<15; i++) { // 1층부터 14층까지
            for(int j=2; j<15; j++) { //2호부터 14호까지
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(in.nextLine());
            int n = Integer.parseInt(in.nextLine());
            if(i == T-1) {
                System.out.print(APT[k][n]);
            } else {
                System.out.println(APT[k][n]);
            }
        }
    }
}
