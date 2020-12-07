package lesson.lesson04;

public class Animal
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

    public void talk() {
        if (type != null && type.equalsIgnoreCase("monkey")) {
            System.out.println("I'm screaming");
        } else {
            System.out.println("I don't want to talk");
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

}
