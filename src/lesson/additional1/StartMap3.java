package lesson.additional1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lesson.lesson17.task.DebitAccount;

public class StartMap3
{
    public static void main(String[] args)
    {
        List<DebitAccount> val1 = new ArrayList<>();
        val1.add(new DebitAccount("efd", "dfd", 3232));

        Map<String, List<DebitAccount>> map = new HashMap<>();
        map.put("key1", val1);

        for (Map.Entry<String, List<DebitAccount>> someEntry : map.entrySet()) {
            System.out.println("Key: " + someEntry.getKey());
            for (DebitAccount f : someEntry.getValue()) {
                System.out.print(f.getId() + " ");
            }
            System.out.println();
        }

        for (Map.Entry<String, List<DebitAccount>> someEntry : map.entrySet()) {
            if (someEntry.getKey().equals("key2")) {
                someEntry.getValue().add(new DebitAccount("wc", "ewe", 33));
            }
            if (someEntry.getKey().equals("key4")) {
                someEntry.getValue().remove(0);
            }
        }

        for (Map.Entry<String, List<DebitAccount>> someEntry : map.entrySet()) {
            System.out.println("Key: " + someEntry.getKey());
            for (DebitAccount f : someEntry.getValue()) {
                System.out.print(f.getId() + " ");
            }
            System.out.println();
        }
    }
}
