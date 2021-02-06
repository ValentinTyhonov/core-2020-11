package lesson.additional1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StartComparable
{
    public static void main(String[] args)
    {
        List<Man> list = new ArrayList<>();
        list.add(new Man("Rob", "Davifs"));
        list.add(new Man("Bob", "Dart"));
        list.add(new Man("Rob", "Kart"));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        Collections.sort(list, new Comparator<Man>()
        {
            @Override
            public int compare(Man o1, Man o2)
            {
                return 0;
            }
        });
        System.out.println(list);


    }
}
