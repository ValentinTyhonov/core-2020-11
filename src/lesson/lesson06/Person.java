package lesson.lesson06;

public class Person implements Buyer, Comparable<Person>
{
    private String name;
    private int age;

    Person() {

    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " " + age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    @Override
    public void run()
    {

    }

    @Override
    public String say()
    {
        return null;
    }

    @Override
    public boolean buy()
    {
        return false;
    }

    @Override
    public int compareTo(Person o)
    {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
