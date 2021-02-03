package lesson.lesson16;

public class Person
{
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age)
    {
        if (age < 16) {
            throw new IllegalArgumentException("Person should be older than 16");
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static class Body{
        private String leg;

        public Body(String leg)
        {
            this.leg = leg;
        }

        public String getLeg()
        {
            return leg;
        }
    }

    public class Head {
        private String eye;

        public Head(String eye)
        {
            this.eye = eye;
        }

        public String getEye()
        {
            return eye;
        }
    }
}
