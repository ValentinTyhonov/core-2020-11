package lesson.lesson05;

public class ElectroCar extends Car
{
    private String batteryModel;
    private double batteryCapacity;

    ElectroCar(String model, String color, String year, int doors, String batteryModel, double batteryCapacity)
    {
        super(model, color, year, doors);

        this.batteryModel = batteryModel;
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryModel()
    {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel)
    {
        this.batteryModel = batteryModel;
    }

    public double getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean start() {
        if (batteryCapacity > 0)
        {
            System.out.println("Go go go!");
            return true;
        } else {
            System.out.println("Out of energy! Please charge me.");
            return false;
        }
    }
}
