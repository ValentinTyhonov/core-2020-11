package lesson.lesson07;

public class Main
{
    public static void main(String[] args)
    {
        Road road = new Road("D4", Signal.GREEN);

        Signal.GREEN.name();
//        Signal incorrectsignal = Signal.valueOf("BLUE");
        Signal correctsignal = Signal.valueOf("RED");

//        System.out.println(incorrectsignal);
        System.out.println(correctsignal);

        Signal[] signals = Signal.values();
        for (Signal signal : signals) {
            System.out.print(signal);
            System.out.print(" ");
        }
        System.out.println();

        for (Signal signal : signals) {
            System.out.print(signal.ordinal() + " - " + signal.name());
            System.out.print(" ");
        }
        System.out.println();

        System.out.println(Signal.YELLOW.ordinal() + " - " + Signal.YELLOW.name());

        for (Signal signal : signals) {
            System.out.print(signal.getTitle() + " - " + signal.getTime() + "s");
            System.out.print(" ");
        }
        System.out.println();

        System.out.println(Signal.fromString("ready"));
        System.out.println(Signal.fromString("GreeN"));
        System.out.println(Signal.fromString("Blue"));


        Signal signal1 = Signal.fromString("reD");
        signal1.tellMe();

        Signal.GREEN.tellMe();

        Signal[] signals1 = Signal.values();
        System.out.println(signals1[1]);
    }
}
