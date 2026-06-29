package com.suhani;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum1 = num1 + num2;

        System.out.println("Sum = " + sum1);

        float num3 = input.nextFloat();
        float num4 = input.nextFloat();

        float sum2 = num3 + num4;

        System.out.println("Sum = " + sum2);
    }
}
