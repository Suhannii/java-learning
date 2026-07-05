package com.code;

import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch =in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else  {
            System.out.println("Uppercase");
        }
//        String word = "hello";
//        System.out.println(word.charAt(2));
        System.out.println(ch);


    }
}
