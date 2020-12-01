package com.company;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n: ");
        double n= scanner.nextDouble();
        System.out.println("Enter number m: ");
        double m= scanner.nextDouble();
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);

        if (b==c){
            System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Число "+m+" ближе к "+a);
        }
        if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }

    }
}
