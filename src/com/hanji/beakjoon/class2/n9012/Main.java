package com.hanji.beakjoon.class2.n9012;

import java.util.Scanner;
import java.util.Stack;

//Stack
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = Integer.parseInt(in.nextLine());

        for(int i=0; i<T; i++) {
            //next() : 개행문자 무시하고 입력받기
            System.out.println(solve(in.next()));
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            //'('가 들어오면 push 하고 ')'가 들어오면 pop 한다
            //비어 있을경우 잘못된 괄호쌍이므로 바로 NO를 리턴한다
            if(c == '(') {
                stack.push(c);
            } else if(stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }

        }

        //포문이 끝났을때 비어있으면 올바른 괄호쌍이므로 YES를 리턴한다
        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

