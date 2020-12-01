package com.company;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 'a': ");
        int a = scanner.nextInt();
        System.out.println("Enter number 'b': ");
        int b = scanner.nextInt();
        System.out.println("Enter number 'x': ");
        int x = scanner.nextInt();

        if (x >= a && x <= b){
            System.out.println("x is in [a;b]");
        }else {
            System.out.println("x not in [a;b]");
        }

    }
}
