package lesson.lesson06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
//        Animal cat = new Cat();
//        cat.setName("Bob");
//        cat.setColor("black");
//        cat.setAge(1);
//        cat.setType("fknvf");
//
//        String characteristic = cat.getCharacteristic();
//        System.out.println(characteristic);
//
//        System.out.println("Age: " + cat.getAge());
//        cat.talk("blabla");
//        System.out.println("Age: " + cat.getAge());
//        cat.talk("hello");
//        System.out.println("Age: " + cat.getAge());
//
//        System.out.println("Is old? " + cat.isOld());
//
//        cat.talk("hello");
//        cat.talk("hello");
//        cat.talk("hello");
//        cat.talk("hello");
//        cat.talk("hello");
//
//        System.out.println("Is old? " + cat.isOld());


        Person person1 = new Person("Tom", 10);
        Person person2 = new Person("Bob", 99);
        Person person3 = new Person("Sam", 50);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);

        // using Comparable
        Collections.sort(persons);

        // using Comparator
        Collections.sort(persons, new PersonComparator());

        System.out.println(persons);




    }

}
