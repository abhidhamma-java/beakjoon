package com.hanji.beakjoon.class2.n2609;

import java.util.Scanner;

//최대공약수, 최소공배수
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int d = gcd(a, b);	// 최대공약수

        System.out.println(d);
        System.out.println(a * b / d);

    }

    // 최대공약수 재귀 방식
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }
}
/*import java.util.Scanner;

//최대공약수, 최소공배수
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int max = Math.min(a, b);

        // Greatest Common Divisor(최대공약수)
        int gcd = 1;

        //Least Common Multiple(최소공배수)
        int lcm = 1;

        //common factor(약수)
        int cf = 2;
        while(max != cf) {

            //약수인경우 나누고 공약수 배열에 넣는다
            if(a % cf == 0 && b % cf == 0) {
                lcm *= cf;
                gcd *= cf;
                a /= cf;
                b /= cf;
                cf = 2;
            }
            //모든 약수를 곱한것이 최대공약수고
            //모든 약수와 마지막 남은 두 수를 곱한 값이 최소공배수다
            if(max-1 == cf) {
                lcm = lcm * a * b;
            }
            cf+=1;
        }

        System.out.println(gcd);
        System.out.println(lcm);

    }
}*/
