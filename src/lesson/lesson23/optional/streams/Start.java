package lesson.lesson23.optional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Start
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "One"));
        System.out.println("Вхідні дані: " + list);
        System.out.println();

        // Повернути кількість входжень об'єкта «One»
        long countOne = list.stream()
            .filter(s -> s.equals("One"))
            .count();
        System.out.println("Повернути кількість входжень об'єкта «One»: " + countOne);

        // Повернути перший елемент колекції або 0, якщо колекція порожня
        String firstElement = list.stream()
            .findFirst()
            .orElse("0");
        System.out.println("Повернути перший елемент колекції або 0, якщо колекція порожня: " + firstElement);

        // Повернути останній елемент колекції або «empty», якщо колекція порожня
        String lastElement = list.stream()
            .skip(list.size() - 1)
            .findFirst()
            .orElse("empty");
        System.out.println("Повернути останній елемент колекції або «empty», якщо колекція порожня: " + lastElement);

        // Знайти елемент в колекції рівний «Three» або кинути помилку
        String three = list.stream()
            .filter(s -> s.equals("Three"))
            .findAny()
            .orElseThrow(() -> new Exception("No such element"));
        System.out.println("Знайти елемент в колекції рівний «Three» або кинути помилку: " + three);

        // Повернути третій елемент колекції по порядку
        String third = list.stream()
            .skip(2)
            .limit(1)
            .findFirst()
            .orElse("3");
        System.out.println("Повернути третій елемент колекції по порядку: " + third);

        // Повернути два елементи починаючи з другого
        List<String> subList1 = list.stream()
            .skip(1)
            .limit(2)
            .collect(Collectors.toList());
        System.out.println("Повернути два елементи починаючи з другого: " + subList1);

        // Вибрати всі елементи в яких є більше ніж 3 букви у слові
        List<String> subList2 = list.stream()
            .filter(elem -> elem.length() > 3)
            .collect(Collectors.toList());
        System.out.println("Вибрати всі елементи в яких є більше ніж 3 букви у слові: " + subList2);

        // Повернути колекції без дублікатів
        List<String> noDuplicates = list.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Повернути колекції без дублікатів: " + noDuplicates);

        // Знайти чи існують хоч один «One» елемент в колекції
        boolean anyOneExists = list.stream()
            .anyMatch(elem -> elem.equals("One"));
        System.out.println("Знайти чи існують хоч один «One» елемент в колекції: " + anyOneExists);

        // Знайти чи є символ «o» у всіх елементів колекції
        boolean allContainsO = list.stream()
            .allMatch(elem -> elem.contains("o"));
        System.out.println("Знайти чи є символ «o» у всіх елементів колекції: " + allContainsO);

        // Додати "_1" до кожного елементу колекції
        System.out.println("Додати \"_1\" до кожного елементу колекції:");
        list.stream()
            .map(elem -> elem + "_1")
            .forEach(elem -> System.out.println(elem));

        // Відсортувати колекцію рядків за алфавітом і прибрати дублікати
        System.out.println("Відсортувати колекцію рядків за алфавітом і прибрати дублікати:");
        list.stream()
            .sorted()
            .distinct()
            .forEach(System.out::println);
    }
}
