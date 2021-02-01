package lesson.lesson14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start
{
    public static void main(String[] args)
    {

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5, 15, 18, 17, 25, 22, 30, 27, 20));

        for (Integer i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : set.tailSet(17)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(set.first());

        System.out.println(set.higher(1));

        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 15, 18, 17, 25, 22, 30, 27, 20));
        for (Integer i : set1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(5, 15, 18, 17, 25, 22, 30, 27, 20));
        System.out.println(set2);

    }
}
