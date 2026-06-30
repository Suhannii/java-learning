package com.suhani;

import java.util.Scanner;

public class Temprature {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please entre temp in C : ");

        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
