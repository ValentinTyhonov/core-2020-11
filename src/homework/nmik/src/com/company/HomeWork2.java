package com.company;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number day: ");
        String a = scanner.nextLine();

        switch (a){
            case "1":{
                System.out.println("Register at GitHub");
                break;
            }
            case "2":{
                System.out.println("Create new project in intellij IDEA");
                break;
            }
            case "3":{
                System.out.println("Add new project in GitHub");
                break;
            }
            case "4":{
                System.out.println("Go to the gym!");
                break;
            }
            case "5":{
                System.out.println("Learn SQL");
            }
            case "6" , "7":{
                System.out.println("WEEKEND!!");
            }
            default:{
                System.out.println("Entered invalid value ");
            }
        }
    }
}
