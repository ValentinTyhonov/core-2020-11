package lesson.additional1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Start
{
    public static void main(String[] args)
    {
//        List, Set, Map
//            List -- ArrayList, LinkedList;
//            Set -- HashSet, TreeSet, LinkedHashSet;
//            Map -- HashMap, LinkedHashMap, TreeMap;

        System.out.println("List");
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while(list.size() < 10) {
            list.add(scanner.next());
        }

        list.add("aasss");
        System.out.println(list.size());

        for (String elem : list) {
            if (elem.startsWith("a") && elem.length() > 3) {
                System.out.println(elem);
            }
        }

        System.out.println("Set");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(scanner.next());
        }

        set.add("aasss");
        set.add("aasss");
        System.out.println(set.size());

        for (String elem : set) {
            System.out.println(elem);
        }



    }
}
