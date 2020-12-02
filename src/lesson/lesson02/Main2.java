package lesson.lesson02;

public class Main2
{
    public static void main(String[] args)
    {
        int a = 9;

        System.out.println("while-do");
        while(a > 10) {
            System.out.println(a);
            a /= 5;
        }

        int b = 9;
        System.out.println("do-while");
        do {
//            b /= 5;
            System.out.println(b);
        } while(b > 10);


        System.out.println("for");

        for (int i = 1; i <= 11; i++)
        {
            System.out.println(i);
        }

        
    }


}
