package lesson.lesson22;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "aaa"));
        Set<String> newSet = new HashSet<>();
        Set<String> stringSet = new HashSet<>(strings);
        Map<String, List<String>> stringMap = new HashMap<>();
        stringMap.put("111", strings);
        stringMap.put("222", strings);
        stringMap.put("333", strings);
        stringMap.put("444", strings);

        strings.forEach(newSet::add);

        strings.forEach(s -> {
            System.out.println(s);
            stringSet.add(Integer.valueOf(s.hashCode()).toString());
        });

        int number = 5;

        stringSet.forEach(x -> {
            System.out.println(x);
            System.out.println(number);
            int res = number + x.hashCode();
            System.out.println(res);
        });

        stringMap.forEach((key, value) -> {
            System.out.println("Key: " + key);
            value.forEach(System.out::println);
        });

    }
}
