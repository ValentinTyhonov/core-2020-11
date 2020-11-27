package lesson.lesson01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ініціалізуємо змінну scanner один раз..
        // кожен виклик методів nextInt(), nextDouble(), next()
        // дозволяє нам вводити наступне значення з клавіатури.
        // Приклад нижче.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 'a'");
        int a = scanner.nextInt();

        System.out.println("Enter number 'b'");
        int b = scanner.nextInt();

        System.out.println("Enter number 'x'");
        int x = scanner.nextInt();

        if (x >= a && x <= b) {
            System.out.println("x is in [a; b]");
        } else {
            System.out.println("x is not in [a; b]");
        }



    }
}
