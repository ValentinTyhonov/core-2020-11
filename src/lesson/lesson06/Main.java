package lesson.lesson06;

public class Main
{
    public static void main(String[] args)
    {
        Animal cat = new Cat();
        cat.setName("Bob");
        cat.setColor("black");
        cat.setAge(1);
        cat.setType("fknvf");

        String characteristic = cat.getCharacteristic();
        System.out.println(characteristic);

        System.out.println("Age: " + cat.getAge());
        cat.talk("blabla");
        System.out.println("Age: " + cat.getAge());
        cat.talk("hello");
        System.out.println("Age: " + cat.getAge());

        System.out.println("Is old? " + cat.isOld());

        cat.talk("hello");
        cat.talk("hello");
        cat.talk("hello");
        cat.talk("hello");
        cat.talk("hello");

        System.out.println("Is old? " + cat.isOld());
    }

}
