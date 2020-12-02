package lesson.lesson02;

import java.util.Scanner;

public class Main5
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 3, 4, 5};

        System.out.println("Lenth: " + numbers.length);

        int[] numbers2 = new int[10];
        numbers2[0] = 1;
        numbers2[1] = 3;
        numbers2[2] = 5;

        System.out.println("Lenth: " + numbers2.length);

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < numbers2.length; i++)
        {
            System.out.println(numbers2[i]);
        }

        String[] strings = new String[5];
        strings[2] = "bla-bla";

        for (int i = 0; i < strings.length; i++)
        {
            System.out.println(strings[i]);
        }


    }



}
