package com.code;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {

        System.out.println(ans);
        int ans = sum2();
        int ans = sum3(20,30 );

}

// pass the value of numbers when you are calling the method in main()
    static  int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
    

 // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
        
        
//        System.out.println("This will never execute");
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

        /*
             look in furture parts:-
             access modifier (we'll look in OOP)
             Only look this now:-
             return_type name() {
                  // body
                  return statement;
              }
         */

}
