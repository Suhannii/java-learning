package com.suhani;

import java.util.Scanner;

public class stringInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
