package lesson.lesson03;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
//        Integer number = 4;
//        Integer number1 = new Integer(5);
//
//        long l = number.longValue();
//
//        System.out.println(number);
//        System.out.println(number.toString());


        // (-10; 10)
        double a = new Random()
            .ints(-2, 10)
            .findAny()
            .getAsInt();

        // [-10; 10]
        double b = (Math.random()* (10 - (-10)));

        System.out.println(a);

        int c = (int) Math.random();

    }

}
