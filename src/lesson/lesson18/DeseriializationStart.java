package lesson.lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DeseriializationStart
{
    public static void main(String[] args)
    {
        try (InputStream inputStream = new FileInputStream("/Users/valentin.tyhonov/Desktop/my.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);)
        {
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.getName());

        } catch (IOException | ClassNotFoundException e) {

        }
    }



}
