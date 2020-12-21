package lesson.lesson08;

import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        getCountry("ewweqgew");

        System.out.println("wefew");

//        Country c1 = Country.valueOf("BLAA");
    }

    static Country getCountry(String s) {
        Country country = Country.USA;
        try
        {
            country = Country.fromString(s);
            System.out.println(country.name());
            throw new IOException("New IO Exception");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchCountryException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        }


        try
        {
            country = Country.fromString(s);
            System.out.println(country.name());
            throw new IOException("New IO Exception");
        } catch (IOException | NoSuchCountryException e) {
            System.out.println(e.getMessage());
        }

        String st = "segw";
        st.contains("ewfew");

        return country;
    }
}
