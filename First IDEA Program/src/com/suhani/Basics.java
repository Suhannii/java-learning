package com.suhani;

import java.util.Scanner;

public class Basics {
    static void main(String[] args) {
        // while loop - don't know exactly hoe many times the loop is going on!
        // if condition

        int a = 10;
        if (a == 10){
            System.out.println("Hello World");
        }

        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        // for loop - when we know how many times the loop in going on!
        for(int count1 = 1; count1 !=5; count1++) {
            System.out.println(count1);
        }
    }
}
