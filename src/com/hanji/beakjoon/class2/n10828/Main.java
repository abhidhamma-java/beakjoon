package com.hanji.beakjoon.class2.n10828;

import java.util.Scanner;
import java.util.Stack;

//Stack
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack stack = new Stack();
        for(int i = 0; i <number; i++) {
            String command = scanner.next();
            switch(command) {
                case "push":
                    int x = scanner.nextInt();
                    stack.push(x);
                    break;
                case "pop":
                    if (stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.pop());
                    break;
                case "empty":
                    if (stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "top":
                    if (stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
            }
        }
    }
}

