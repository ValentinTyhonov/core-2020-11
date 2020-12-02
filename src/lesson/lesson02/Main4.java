package lesson.lesson02;

import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;

        for (; number >= 0; number--)
        {
            sum+=number;
        }

//        while (number >= 0) {
//            sum+=number;
//            number--;
//        }

        System.out.println(sum);

    }



}
