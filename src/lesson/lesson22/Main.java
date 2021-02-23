package lesson.lesson22;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Mark", 18);
        Person person2 = new Person("Tom", 12);
        Person person3 = new Person("Jerry", 29);
        Person person4 = new Person("Jack", 17);
        Person person5 = new Person("Kart", 33);

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));
        List<Person> adults = new ArrayList<>();

        people.forEach(person -> {
            if (person.getAge() >= 18) {
                adults.add(person);
            }
        });

        adults.forEach(System.out::println);

        people.forEach(person -> person.setTimestamp(Instant.now()));

        List<Integer> stringSizes = new ArrayList<>();
        people.forEach(person -> stringSizes.add(person.getName().length()));

        stringSizes.forEach(System.out::println);
    }
}
