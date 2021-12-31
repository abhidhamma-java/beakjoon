package com.hanji.beakjoon.class2.n1874;

import java.io.*;
import java.util.Stack;

//Stack - 오름차순 push
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int start = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > start) {
                for (int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
