package lesson.lesson05;

public class Car
{
    private String model;
    private String color;
    private String year;
    private int doors;
    private Passangers passangers;

    Car(String model, String color, String year, int doors) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.doors = doors;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public Passangers getPassangers()
    {
        return passangers;
    }

    public void setPassangers(Passangers passangers)
    {
        this.passangers = passangers;
    }

    public boolean start() {
        System.out.println("Let's go!");
        return true;
    }

    public void redesign(String color) {
        System.out.println("Change color");
        this.setColor(color);
    }

//    public void redesign(String year) {
//        System.out.println("Change color");
//        this.setColor(color);
//    }

    public void redesign(int doors) {
        System.out.println("Change color");
        this.setDoors(doors);
    }

    public void redesign(String color, int doors) {
        System.out.println("Change color");
        this.setColor(color);
        System.out.println("Change number of doors");
        this.setDoors(doors);
    }
}
