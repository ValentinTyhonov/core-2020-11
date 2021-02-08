package lesson.lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Start
{
    public static void main(String[] args)
    {
        try (InputStream inputStream = new FileInputStream("/Users/valentin.tyhonov/Desktop/my.txt");
             OutputStream outputStream = new FileOutputStream("/Users/valentin.tyhonov/Desktop/my.txt");
        )
        {
            String str = "";
            while (inputStream.available() > 0) {
                str += (char) inputStream.read();
            }

            System.out.println(str);
            String[] words = str.split(" ");
            Person person = new Person(words[0], Integer.valueOf(words[1]));

            byte[] bytesArr = person.toString().getBytes(StandardCharsets.UTF_8);

            for (byte byteElem : bytesArr) {
                outputStream.write(byteElem);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }



}
