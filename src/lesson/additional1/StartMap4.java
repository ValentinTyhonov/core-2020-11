package lesson.additional1;

import java.util.HashMap;
import java.util.Map;

import lesson.lesson17.task.DebitAccount;
import lesson.lesson17.task.User;

public class StartMap4
{
    public static void main(String[] args)
    {
        Map<User, DebitAccount> map = new HashMap<>();
        map.put(
            new User("dsffe", "dgg", 44),
            new DebitAccount("dsds", "efef", 32323)
        );

        for (Map.Entry<User, DebitAccount> entry : map.entrySet()) {
            User user = entry.getKey();
            if (user.getName().equals("dsffe") && user.getSurname().equals("dgg")) {
                entry.setValue(null);
            }
        }

        for (User user : map.keySet()) {
            System.out.println(user.getName());
        }
        for (DebitAccount account : map.values()) {
            if (account != null) {
                System.out.println(account.getId());
            }
        }
        for (Map.Entry<User, DebitAccount> entry : map.entrySet()) {
            System.out.println("User : " + entry.getKey().getName());
            if (entry.getValue() != null) {
                System.out.println("Account : " + entry.getValue().getId());
            } else {
                System.out.println("No account");
            }
        }


    }
}
