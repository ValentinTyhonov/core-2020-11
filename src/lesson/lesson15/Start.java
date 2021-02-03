package lesson.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {
//        Map<Integer, String> myMap = new HashMap<>();
//        myMap.put(1, "One");
//        myMap.put(2, "Two");
//        myMap.put(3, "Three");
//        myMap.put(4, "Four");
//        myMap.put(1, "First");
//
//        for (Map.Entry<Integer, String> myEntry : myMap.entrySet())
//        {
//            System.out.println(myEntry.getKey() + " - " + myEntry.getValue());
//            if (myEntry.getValue().equals("Three")) {
//                break;
//            }
//        }
//
//        for (Integer key : myMap.keySet()) {
//            System.out.println(key);
//        }
//
//        for (String value : myMap.values()) {
//            System.out.println(value);
//        }
//
//        System.out.println(myMap.size());
//        System.out.println(myMap.containsKey(6));
//        System.out.println(myMap.containsValue("Two"));
//        System.out.println(myMap.get(5));
//        System.out.println(myMap.getOrDefault(5, "FIVE"));
//        System.out.println(myMap.getOrDefault(5, "FIVE"));


//        Map<String, Person> persons = new HashMap<>();
//        persons.put("KB3214124", new Person("Mark", "New", 33));
//        persons.put("IO9273498", new Person("Ostap", "Man", 17));
//        persons.put("JU8923534", new Person("Oleg", "iuwehu", 23));
//        persons.put("PL9238332", new Person("Oksana", "Ikk", 45));
//
//        Scanner scanner = new Scanner(System.in);
//        while (true)
//        {
//            System.out.println();
//            System.out.println("1. Create new person");
//            System.out.println("2. Check person exists by passport ID");
//            System.out.println("3. Remove person by passport ID");
//            System.out.println("4. Get person by passport ID");
//            System.out.println("5. Get all persons");
//            System.out.println();
//
//            int select = scanner.nextInt();
//
//            switch (select)
//            {
//                case 1:
//                {
//                    System.out.print("Enter name: ");
//                    String name = scanner.next();
//                    System.out.print("Enter surname: ");
//                    String surname = scanner.next();
//                    System.out.print("Enter age: ");
//                    int age = scanner.nextInt();
//                    System.out.print("Enter passport ID: ");
//                    String passport = scanner.next();
//                    persons.put(passport, new Person(name, surname, age));
//                    break;
//                }
//                case 5:
//                {
//                    for (Map.Entry<String, Person> myEntry : persons.entrySet())
//                    {
//                        System.out.println(myEntry.getKey() + " - " + myEntry.getValue().getName());
//                    }
//                    break;
//                }
//                default:
//                {
//                    System.exit(0);
//                }
//            }
//
//
//        }

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("One", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        map.put("Two", new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6)));
        map.put("Three", new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7)));
        map.put("Four", new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8)));


        System.out.println(map);

        map.get("Two").remove(1);

        System.out.println(map);

    }

}
