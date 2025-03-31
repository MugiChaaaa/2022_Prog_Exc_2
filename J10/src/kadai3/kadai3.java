package kadai3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class kadai3
{
    public static void main(String[] args)
    {
        String text = "src/kadai3/d10_3.txt";
        String binary = "src/kadai3/d10_3.bin";
        try
        {
            FileWriter fwt = new FileWriter(text, StandardCharsets.UTF_8);
            FileOutputStream fos = new FileOutputStream(binary);
            DataOutputStream dos = new DataOutputStream(fos);
            for(int i = 0; i < 10; i++)
            {
                double r = rand();
                fwt.write(r + "\r\n");
                dos.writeDouble(r);
            }
            fwt.close();
            dos.close();

            File ft = new File(text);
            File fb = new File(binary);
            BufferedReader frt = new BufferedReader(new FileReader(text));
            FileInputStream fis = new FileInputStream(binary);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("Text File Size = " + ft.length() + " bytes");
            System.out.println("Binary File Size = " + fb.length() + " bytes");
            System.out.println("-----d9_3.txt-----");
            for(int i = 0; i < 10; i++)
            {
                System.out.println(frt.readLine());
            }
            System.out.println("-----d9_3.bin-----");
            for(int i = 0; i < 10; i++)
            {
                System.out.println(dis.readDouble());
            }
        }
        catch (EOFException eofe)
        {
        }
        catch (IOException ioe)
        {
            System.out.println("IOException");
        }
    }

    static double rand()
    {
        Random ran = new Random();
        double r = ran.nextDouble();
        return r;
    }
}
