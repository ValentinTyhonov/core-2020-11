package lesson.additional1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartMap2
{
    public static void main(String[] args)
    {
        List<String> val1 = new ArrayList<>();
        val1.add("el1");
        val1.add("el2");
        val1.add("el3");
        List<String> val2 = new ArrayList<>();
        val2.add("el10");
        val2.add("el20");
        val2.add("el30");
        List<String> val3 = new ArrayList<>();
        val3.add("el100");
        val3.add("el200");
        val3.add("el300");
        List<String> val4 = new ArrayList<>();
        val4.add("el1000");
        val4.add("el2000");
        val4.add("el3000");

        Map<String, List<String>> map = new HashMap<>();
        map.put("key1", val1);
        map.put("key2", val2);
        map.put("key3", val3);
        map.put("key4", val4);

        for (Map.Entry<String, List<String>> someEntry : map.entrySet()) {
            System.out.println("Key: " + someEntry.getKey());
            for (String f : someEntry.getValue()) {
                System.out.print(f + " ");
            }
            System.out.println();
        }

        for (Map.Entry<String, List<String>> someEntry : map.entrySet()) {
            if (someEntry.getKey().equals("key2")) {
                someEntry.getValue().add("sdweg");
            }
            if (someEntry.getKey().equals("key4")) {
                someEntry.getValue().remove(0);
            }
        }

        for (Map.Entry<String, List<String>> someEntry : map.entrySet()) {
            System.out.println("Key: " + someEntry.getKey());
            for (String f : someEntry.getValue()) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}
