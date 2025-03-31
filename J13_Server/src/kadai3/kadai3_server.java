package kadai3;

import java.io.*;
import java.net.*;
import java.util.*;

public class kadai3_server
{
    public static void main(String[] args)
    {
        try
        {
            int port = Integer.parseInt(args[0]);

            ServerSocket ss = new ServerSocket(port);

            String[] pref = { "東京都", "神奈川県", "大阪府", "愛知県", "埼玉県", "千葉県", "兵庫" };
            int[] population = { 13161751, 9049500, 8862896, 7408499, 7194957,
                    6217119, 5589177 };
            String[] key = { "tokyo", "kanagawa", "osaka", "aichi", "saitama",
                    "chiba", "hyogo" };
            Prefecture[] p = new Prefecture[pref.length+1];

            HashMap<String, Prefecture> hash = new HashMap<String, Prefecture>();
            for (int i = 0; i < pref.length; i++)
            {
                p[i] = new Prefecture(pref[i], population[i]);
                hash.put(key[i], p[i]);
            }
            p[pref.length] = new Prefecture("Not Found", 0);

            String skey;
            int count = 1;
            while(true)
            {
                Socket s = ss.accept();

                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                OutputStream os = s.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                skey = dis.readUTF();
                System.out.println("("+ count +")Server: "+ skey);
                if (hash.containsKey(skey))
                    oos.writeObject(hash.get(skey));
                else
                    oos.writeObject(p[pref.length]);
                count++;
                s.close();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

