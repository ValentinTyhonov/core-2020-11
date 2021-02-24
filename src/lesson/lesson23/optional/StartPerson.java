package lesson.lesson23.optional;

import java.util.ArrayList;
import java.util.Optional;

public class StartPerson
{
    public static void main(String[] args)
    {
        Person object = new Person("Mark", 16);
        Optional<Person> optionalPerson = Optional.ofNullable(null);

        Person person = optionalPerson.filter(p -> p.getAge() >= 18)
            .orElse(new Person("Default", 18));

        System.out.println(person);


        new ArrayList<>().stream().forEach(elem -> {

        });

    }
}
