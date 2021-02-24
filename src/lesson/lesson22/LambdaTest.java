package lesson.lesson22;

public class LambdaTest
{
    @FunctionalInterface
    public interface ITest {
        public int test(int a, int b, int c);
    }

    public static void main(String[] args)
    {
        ITest maxVal = (a, b, c) -> a;

        ITest minVal = (a, b, c) -> {
            return a;
        };

        ITest midVal = (a, b, c) -> {
            return a;
        };

        System.out.println(maxVal.test(4, 5, 2));
        System.out.println(minVal.test(4, 5, 2));
        System.out.println(midVal.test(4, 5, 2));
    }
}


