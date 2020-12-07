package lesson.lesson04;

public class Main
{
    public static void main(String[] args)
    {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("jack", "monkey");
        Animal animal3 = new Animal("jack", "monkey", 3, "brown");
        Animal animal4;

        System.out.println("Animal 1");
        animal1.print();
        animal1.talk();
        animal1.setName("Bob");
        animal1.setType("Cat");
        System.out.println("Animal 1 updated");
        animal1.print();
        animal1.talk();




    }
}
