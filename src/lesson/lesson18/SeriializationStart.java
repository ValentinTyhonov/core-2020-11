package lesson.lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class SeriializationStart
{
    public static void main(String[] args)
    {
        try (OutputStream outputStream = new FileOutputStream("/Users/valentin.tyhonov/Desktop/my.txt"))
        {
            Person person = new Person("Max", 30);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
