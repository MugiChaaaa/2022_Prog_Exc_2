package kadai1;

import java.io.*;
import java.net.*;
import java.util.*;

public class kadai1_client
{
    public static void main(String args[])
    {
        try
        {
            String server = args[0];
            int port = Integer.parseInt(args[1]);
            Socket s = new Socket(server, port);
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 2; i++)
            {
                System.out.print("Enter a number" + (i+1) + ": ");
                dos.writeInt(sc.nextInt());
            }
            System.out.println("The sum result is: " + dis.readInt());
            s.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
