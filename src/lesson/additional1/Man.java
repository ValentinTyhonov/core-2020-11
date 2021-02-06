package lesson.additional1;

public class Man implements Comparable<Man>
{
    private String name;
    private String surname;
    private int age;

    Man(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString()
    {
        return "Man{" + name + " " + surname + "}";
    }

    @Override
    public int compareTo(Man o)
    {
        if (this.getName().compareTo(o.getName()) > 0) {
            return 1;
        } else if (this.getName().compareTo(o.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }


//        if (this.age > o.age) {
//            return 1;
//        } else if (this.age < o.age) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
