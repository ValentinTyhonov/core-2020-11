package com.company;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        String pass = "pass123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String a = scanner.nextLine();

        if (a.equals(pass)){
            System.out.println("Hello)");
        }else if (a.equals("admin")){
            System.out.println("Hello Admin");
        }
        else {
            System.out.println("The password is incorrect");
        }
    }
}
