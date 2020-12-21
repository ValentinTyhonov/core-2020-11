package lesson.lesson06;

public abstract class Animal
{
    private String name;
    private String type;
    private int age;
    private String color;

    Animal() {

    }

    Animal(String name, String type, int age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
        this.color = "black";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public abstract void talk(String s);

    public abstract boolean isOld();

    public abstract String getCharacteristic();


}
