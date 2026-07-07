package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter fruit name: ");
        String fruit = in.next();

        if (fruit.equals("mango")) {
            System.out.println("King of fruit");
        }

        if (fruit.equals("apple")) {
            System.out.println("a sweet red fruit");
        }

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }



        
        
    }
}
