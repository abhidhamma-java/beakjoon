package com.hanji.beakjoon.class1.n11654;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//string to ascii
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String s = in.nextLine();
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);

        System.out.println(bytes[0]);
    }
}
