package kadai1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class kadai1
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr1 = new FileReader(args[0], StandardCharsets.UTF_8);
            FileReader fr2 = new FileReader(args[1], StandardCharsets.UTF_8);
            FileWriter fw = new FileWriter("src/kadai1/d10_1.txt", StandardCharsets.UTF_8);

            int i;
            while((i = fr1.read()) != -1)
            {
                fw.write((char) i);
                if((i = fr2.read()) == -1)
                {
                    break;
                }
                if(i != '\r' && i != '\n')
                {
                    fw.write((char) i);
                }
            }

            fr1.close();
            fr2.close();
            fw.close();
            System.out.println("File d10_1.txt created.");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
