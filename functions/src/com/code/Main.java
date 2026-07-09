package com.code;

import java.util.Scanner;

public class Main {
    static void main(StringExample[] args) {
        // Q: take input of two no. and print the sum
        // but do it 10 times!!

        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
