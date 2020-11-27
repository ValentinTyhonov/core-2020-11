package lesson.lesson01;

import java.util.Scanner;

public class Main2
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // змінюємо роздільник з пробілу на новий рядок,
        // щоб могти зчитувати текст з пробілами як одне значення
        scanner.useDelimiter("\n");

        System.out.println("Enter number 'a'");
        int a = scanner.nextInt();
        check(a);
        if (checkIsPositive(a)) {
            System.out.println(a * 5);
        }

        System.out.println("Enter number 'b'");
        int b = scanner.nextInt();
        check(b);
        if (checkIsPositive(b)) {
            System.out.println(b * 5);
        }

        System.out.println("Enter number 'c'");
        int c = scanner.nextInt();
        check(c);
        if (checkIsPositive(c)) {
            System.out.println(c * 5);
        }

        System.out.print("Enter string: ");
        String newLine = scanner.next(); // вводимо текст в консолі і записуємо у змінну
        String newLine1 = "Hello World";

        System.out.println("1: " + newLine);
        System.out.println("2: " + newLine.equals(newLine1));
        newLine = newLine + " - " + newLine1;
        System.out.println("3: " + newLine);
        System.out.println("4: " + newLine.toLowerCase());
        System.out.println("5: " + newLine.replace("Hello", "Pryvit"));
    }

    static void check(int x) {
        if (x > 0) {
            System.out.println("Positive number");
        } else if (x < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is 0");
        }
    }

    static boolean checkIsPositive(int x) {
//        boolean a = x > 0;
        return x > 0;
    }
}
