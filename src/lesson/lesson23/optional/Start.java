package lesson.lesson23.optional;

import java.util.Locale;
import java.util.Optional;

public class Start
{
    public static void main(String[] args)
    {
        Optional<String> data = Optional.of("sddsvv");
        Optional<String> dataN = Optional.ofNullable(null);
        Optional<String> dataEmpty = Optional.empty();

        String s = dataN.get();
        boolean b = data.isPresent();
        dataN.ifPresent(ff -> System.out.println(ff));
        data.orElse("232");
        data.orElseGet(() -> "vdvdssdv");
//        data.orElseThrow(() -> new Exception("32r"));
        data.map(fff -> fff.toLowerCase()).filter(lll -> lll.startsWith("A"));
    }
}
