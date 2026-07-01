package com.suhani;

import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Converting integer to float is known as type casting

//        float num = input.nextFloat();
//        int num = input.nestInt();
//        System.out.println(num);

        // Type Casting
        int num = (int)(45.15f);
        System.out.println(num);

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1

        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e;

        System.out.println(f);

        int number = 'a';
        System.out.println(number);

        int number1 = 'A';
        System.out.println(number1);



    }
}
