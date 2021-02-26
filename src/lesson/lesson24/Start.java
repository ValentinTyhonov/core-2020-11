package lesson.lesson24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Start
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("Mon", "One");
        map.put("Tue", "Two");
        map.put("Wed", "Three");
        map.put("Thu", "One");
        map.put("Fri", "Five");
        map.put("Sat", "Two");
        map.put("Sun", "Seven");

        Map<String, String> collected = map.entrySet().stream()
            .filter(entry -> entry.getKey().startsWith("S"))
            .map(entry -> entry.getValue().toUpperCase())
            .collect(Collectors.toMap(k -> k, v -> "wefewf"));

        String str = map.entrySet().stream()
            .filter(entry -> entry.getKey().startsWith("S"))
            .map(entry -> entry.getValue().toUpperCase())
            .collect(Collectors.joining(","));

        System.out.println(str);
        List<String> list = Arrays.asList(str.split(","));
        System.out.println(list);


        collected.forEach((k, v) -> System.out.println(k + " :: " + v));

    }
}
