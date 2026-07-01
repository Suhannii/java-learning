package com.suhani;

import java.util.Scanner;

public class intInputs {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        int a = 243_000_000;
        System.out.println(a);
    }
}
