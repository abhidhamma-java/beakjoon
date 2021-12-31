package com.hanji.beakjoon.class2.n1978;

import java.util.Scanner;

//소수찾기
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            if(isPrime(in.nextInt())) {
                count += 1;
            }
        }

        System.out.println(count);

    }
    static boolean isPrime(int Number) {
        // 1 은 소수가 아니다.
        if(Number == 1){
            return false;
        }
        // 2 ~ Number의 제곱근까지 중 나누어 떨어지는 약수가 있는지 판별
        for(int i = 2; i <= Math.sqrt(Number); i++) {
            if(Number % i == 0) return false;
        }
        // 위 두 조건에 걸리지 않으면 소수다.
        return true;
    }
}
