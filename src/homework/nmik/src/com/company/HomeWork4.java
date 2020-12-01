package com.company;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int p;
        p = n % 2;
        if (p ==0){
            System.out.println("chotne");
        }else {
            System.out.println("ne chotne");
        }


    }
}
