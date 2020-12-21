package lesson.lesson08;

import lesson.lesson07.Signal;

import java.io.IOException;

public enum Country
{
    UKRAINE("Ukraine", "ukrainian", 4800000),
    USA("USA", "english", 1232332);

    private String name;
    private String language;
    private long population;

    Country(String name, String language, long population)
    {
        this.name = name;
        this.language = language;
        this.population = population;
    }

    public static Country fromString(String signalString) throws NoSuchCountryException, IOException
    {
        for (Country country : values()) {
            if (country.name().equalsIgnoreCase(signalString)) {
                return country;
            }
        }
        throw new NoSuchCountryException("No such country with name " + signalString, 404);
    }
}
