package com.hanji.programmers.level1.신규아이디추천;

public class Main {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        String newId = new_id.toLowerCase();

        newId = newId.replace("!", "");
        newId = newId.replace("@", "");
        newId = newId.replace("#", "");

        newId = newId.replace("...", ".");
        newId = newId.replace("..", ".");

        if (newId.toCharArray()[0] == '.') {
            newId = newId.substring(1);
        }

        newId = newId.replace(" ", "");

        if(newId.length()>15) {
            newId = newId.substring(0,15);
        }


        //7단계못함

        System.out.println(newId);


    }
}
