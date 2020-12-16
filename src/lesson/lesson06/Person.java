package lesson.lesson06;

public class Person implements Buyer
{
    private String name;
    private int age;

    Person() {

    }
    Person(String name) {
        this.name = name;
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
}
