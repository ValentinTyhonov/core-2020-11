package lesson.lesson08;

public class NoSuchCountryException extends Exception
{
    NoSuchCountryException() {
        super();
    }

    NoSuchCountryException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    private int statusCode;

}
