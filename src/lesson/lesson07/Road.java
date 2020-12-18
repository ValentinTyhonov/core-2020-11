package lesson.lesson07;

public class Road
{
    private String name;
    private Signal signal;

    public Road(String name, Signal signal)
    {
        this.name = name;
        this.signal = signal;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Signal getSignal()
    {
        return signal;
    }

    public void setSignal(Signal signal)
    {
        this.signal = signal;
    }
}
