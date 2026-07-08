package com.code;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();


        switch (empID) {
            case 1:
                System.out.println("Suhani Sinha");
                break;
            case  2:
                System.out.println("Sneha Yadav");
                break;
            case  3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Departmentt");
                        break;
                    default:
                        System.out.println("No department Invalid");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }

        // Better way to write :-

        switch (empID) {
            case 1 -> System.out.println("Suhani Sinha");
            case 2 -> System.out.println("Sneha Yadav");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Departmentt");
                    default -> System.out.println("No department Invalid");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
