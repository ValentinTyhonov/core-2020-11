package lesson.lesson05;

public class Engine
{
    private String model;
    private double power;

    public Engine(String model, double power)
    {
        this.model = model;
        this.power = power;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public double getPower()
    {
        return power;
    }

    public void setPower(double power)
    {
        this.power = power;
    }
}
