package lesson.lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Start
{
    public static void main(String[] args)
    {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate date = LocalDate.parse("2020/04/09", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(date);

        System.out.println(date.isBefore(currentDate));

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(currentDateTime.format(formatter));

        currentDateTime.minus(1, ChronoUnit.HOURS);
        currentDateTime.minusHours(1);

        LocalTime localTime = LocalTime.now();

        System.out.println(currentDateTime.getDayOfMonth());
        System.out.println(localTime.truncatedTo(ChronoUnit.MINUTES));
    }
}
