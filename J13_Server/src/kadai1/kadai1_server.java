package kadai1;

import java.io.*;
import java.net.*;

public class kadai1_server
{
    public static void main(String[] args)
    {
        try
        {
            int port = Integer.parseInt(args[0]);

            ServerSocket ss = new ServerSocket(port);
            int i = 1;
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                OutputStream os = s.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);

                int num1 = dis.readInt();
                int num2 = dis.readInt();
                System.out.println("("+i+")Server_num1: "+ num1);
                System.out.println("("+i+")Server_num2: "+ num2);
                dos.writeInt(num1 + num2);
                s.close();
                i++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
