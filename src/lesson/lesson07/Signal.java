package lesson.lesson07;

public enum Signal
{
    RED("red", "stop", 60),
    YELLOW("yellow", "ready", 10),
    GREEN("green", "go", 30);

    private String title;
    private String action;
    private int time;

    Signal(String title, String action, int time)
    {
        this.title = title;
        this.action = action;
        this.time = time;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAction()
    {
        return action;
    }

    public int getTime()
    {
        return time;
    }

    public void tellMe() {
        switch (this) {
            case GREEN: {
                System.out.println(this.title + ". You can go!");
                break;
            }
            case YELLOW: {
                System.out.println("Be ready!");
                break;
            }
            case RED: {
                System.out.println("Stop and be careful!");
                break;
            }
        }
    }

    public static Signal fromString(String signalString) {
        for (Signal signal : values()) {
            if (signal.name().equalsIgnoreCase(signalString)
                || signal.getTitle().equalsIgnoreCase(signalString)
                || signal.getAction().equalsIgnoreCase(signalString)) {
                return signal;
            }
        }
        return Signal.YELLOW;
    }
}
