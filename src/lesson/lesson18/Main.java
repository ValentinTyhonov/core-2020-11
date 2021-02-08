package lesson.lesson18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main
{
    public static void main(String[] args)
    {
        File file = new File("/Users/valentin.tyhonov/Desktop/reader.txt");
        String str = "Hello World";

        try (Writer writer = new FileWriter(file);
             Reader reader = new FileReader(file);
        )
        {
            file.createNewFile();

            writer.write(str);
            String str2 = "";
            while (reader.ready()) {
                str2 += (char) reader.read();
            }

            System.out.println(str2);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
