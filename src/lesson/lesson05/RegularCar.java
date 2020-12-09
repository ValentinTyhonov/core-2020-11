package lesson.lesson05;

public class RegularCar extends Car
{
    private String fuelType;
    private double fuelCapacity;
    private Engine engine;

    RegularCar(String model, String color, String year, int doors, String fuelType, double fuelCapacity, Engine engine) {
        super(model, color, year, doors);

        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.engine = engine;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public double getFuelCapacity()
    {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    @Override
    public boolean start() {
        System.out.println(super.getColor());
        if (fuelCapacity > 0)
        {
            System.out.println("Let's go!");
            return true;
        } else {
            System.out.println("No more fuel!");
            return false;
        }
    }


}
