package com.hanji.beakjoon.class2.n2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Queue
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int N = in.nextInt();

        //1~N까지
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        //N-1번
        for (int i = 1; i < N; i++) {
            queue.remove();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());


    }
}
