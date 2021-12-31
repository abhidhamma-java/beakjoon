package com.hanji.beakjoon.class2.n18111;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//나무자르기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st;

        String condition = br.readLine();
        st = new StringTokenizer(condition);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String list = br.readLine();
        st = new StringTokenizer(list);

        int[] treeList = new int[N];
        int longestTree = 0;

        for (int i = 0; i < N; i++) {
            int treeLength = Integer.parseInt(st.nextToken());
            if (treeLength > longestTree) {
                longestTree = treeLength;
            }
            treeList[i] = treeLength;
        }

        int min = 0;
        int max = longestTree;
        int mid = 0;

        //min = shortestTree, max = longestTree
        while (min < max) {
            mid = (max + min) / 2;

            long cutLengthSum = 0;

            for (int tree : treeList) {
                int cutLength = tree - mid;
                if (cutLength > 0) {
                    cutLengthSum += cutLength;
                }
            }

            //upperbound
            if (cutLengthSum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);
    }
}

