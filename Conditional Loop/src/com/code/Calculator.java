package com.code;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from the user till user does not press X or x

        // 2. Declare ans here so it can be used inside AND outside the while loop
        int ans = 0;

        while (true) {
            //Take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
               // input two numbers
                System.out.print("Enter two numbers: ");
               int num1 = in.nextInt();
               int num2 = in.nextInt();
                System.out.println();

               
        }
    }
}
