package lesson.lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Start
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new LinkedList<>();
        List<Integer> numbers1 = new LinkedList<>();

        System.out.println("Empty? " + numbers.isEmpty());

        numbers.add(1);
        numbers.add(10);
        numbers.add(4);
        numbers.add(4);
        numbers.add(10);
        numbers.add(65);

        System.out.println(numbers.get(1));

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(0);
        numbers2.add(99);

        numbers.addAll(numbers2);

        printList(numbers);

        numbers.set(2, 88);

        printList(numbers);

        System.out.println("Empty? " + numbers.isEmpty());
        System.out.println("Size: " + numbers.size());

        numbers.remove(3);

        printList(numbers);

        numbers.removeAll(numbers2);

        printList(numbers);

        boolean contains10 = numbers.contains(10);
        boolean contains5 = numbers.contains(5);
        System.out.println(contains10);
        System.out.println(contains5);

        numbers.add(0, 100);

        printList(numbers);

        Integer element = numbers.get(3);
        System.out.println("Elem with index 3: " + element);

        printList(numbers);

        System.out.println("-==========-");
        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
//            Integer number = iterator.next();
            System.out.println(iterator.next());
            System.out.println(iterator.next()+5);

        }

        System.out.println(iterator.next());
        iterator.remove();


//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            int i = iterator.next();
//            System.out.println(i);
//        }
//        System.out.println("-==========-");
//        System.out.println();
//
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }

        listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.set());
//        }

//        Arrays.sort();
//
//        HashMap<String, String> dd = new HashMap<>();
//        dd.put("a", "aa");
//
//        System.out.println(dd.get("b"));






        List<String> stringList1 = Arrays.asList("elem1", "Toronto", "NewYork", "2", "bla");
        String[] arr = {"elem1", "Toronto", "New York", "2", "bla"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<String> stringList2 = Arrays.asList(arr);
        printList(stringList2);

        System.out.println(numbers.toString());






    }

    private static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
