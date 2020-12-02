package lesson.lesson02;

import java.util.Scanner;

public class Main6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        String[] strings = new String[size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter array[" + i + "] size: ");
            strings[i] = scanner.next();
        }

        System.out.println("Array: ");

        for (int i = 0; i < strings.length; i++)
        {
            System.out.print(strings[i] + " ");
        }

        System.out.println();

        for (int i = strings.length - 1; i >= 0; i--)
        {
            System.out.print(strings[i] + " ");
        }




    }



}
