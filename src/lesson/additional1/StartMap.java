package lesson.additional1;

import java.util.HashMap;
import java.util.Map;

public class StartMap
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");
        map.put("key2", "val2");
        map.put("key3", "val3");
        map.put("key4", "val4");
        map.put("key5", "val5");
        map.put("key3", "val6");

        for (Map.Entry someEntry : map.entrySet()) {
            System.out.println(someEntry.getKey() + " : " + someEntry.getValue());
            if (someEntry.getKey().equals("key4")) {
                someEntry.setValue("44");
            }
        }
        System.out.println("===");
        for (Map.Entry someEntry : map.entrySet()) {
            System.out.println(someEntry.getKey() + " : " + someEntry.getValue());
        }
    }
}
