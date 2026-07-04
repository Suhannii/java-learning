package com.code;

public class Conditionals {
    static void main(String[] args) {
        /*
        Syntax of if statements:
        if(boolean expression T orF){
             // body
             }else{
                // do this
                }
         */

        int salary = 25400;
//        if(salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        // multiple if-else statement

        if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
//
//        int a = 10;
//        int b = 40;
//    because one is true !!
//        if ( a == 10 ||b == 20) {
//            System.out.println("Hello World" );
//        }


        int a = 10;
        int b = 40;
        if ( a != 35) {
            System.out.println("Hello World" );
        }
    }
}