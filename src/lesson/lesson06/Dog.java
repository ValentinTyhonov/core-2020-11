package lesson.lesson06;

public class Dog extends Animal implements Alive
{

    @Override
    public void talk(String s)
    {
        if (s.equalsIgnoreCase("hello"))
        {
            System.out.println("Meow");
            int age = this.getAge();
            this.setAge(age + 1);
        }
    }

    @Override
    public boolean isOld()
    {
        if (this.getAge() >= 10) {
            return true;
        }
        return false;
    }

    @Override
    public String getCharacteristic()
    {
        return this.getColor() + " dog " + this.getName();
    }


    @Override
    public void run()
    {

    }
    public void run(String w)
    {

    }


    @Override
    public String say()
    {
        return null;
    }


}
