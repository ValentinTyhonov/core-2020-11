package lesson.lesson19;

import java.util.Arrays;
import java.util.List;

public class Start
{
    public static void main(String[] args) throws InterruptedException
    {
        List<String> men = Arrays.asList("Max", "Anton", "Vlad", "Oleg");
        List<String> women = Arrays.asList("Ira", "Julia", "Olia", "Olena");

        PeopleQueue menQueue = new PeopleQueue(men, 4000);
        PeopleQueue womenQueue = new PeopleQueue(women, 2000);

        menQueue.start();
        womenQueue.start();


    }
}
