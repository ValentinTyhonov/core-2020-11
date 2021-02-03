package lesson.lesson16.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start
{
    public static void main(String[] args)
    {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", "Kent", 33));
        persons.add(new Person("Sem", "Pol", 23));
        persons.add(new Person("Sem", "Nan", 44));
        persons.add(new Person("Kart", "Raj", 39));

        print(persons);

        // По імені і прізвищу використовуючи внутрішній клас.
        Person.ComparatorByNameAndSurname comparator1 = persons.get(0).new ComparatorByNameAndSurname();
        Collections.sort(persons, comparator1);
        print(persons);

        // По віку використовуючи внутрішній локальний клас.
        class ComparatorByAge implements Comparator<Person>
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        ComparatorByAge comparator2 = new ComparatorByAge();
        Collections.sort(persons, comparator2);
        print(persons);

        // По імені і віку використовуючи внутрішній анонімний клас.
        Collections.sort(persons, new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                int res = o1.getName().compareTo(o2.getName());
                if (res == 0) {
                    if (o1.getAge() > o2.getAge()) {
                        return 1;
                    } else if (o1.getAge() < o2.getAge()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return res;
            }
        });
        print(persons);

        // По прізвищу i імені використовуючи вкладений статичний клас.
        Person.ComparatorBySurnameAndName comparator3 = new Person.ComparatorBySurnameAndName();
        Collections.sort(persons, comparator3);
        print(persons);

    }

    private static void print(List<Person> list) {
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
        }
        System.out.println();
    }
}
