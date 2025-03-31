package kadai5;

import java.io.*;
import java.util.ArrayList;

public class kadai5
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("src/kadai5/s10_5.txt"));
            ArrayList<Player> array = new ArrayList<>();
            StreamTokenizer st = new StreamTokenizer(br);
            st.whitespaceChars('/','/');
            st.whitespaceChars(' ',' ');
            st.whitespaceChars(',',',');
            int[] date = new int[3]; //year, month, day
            String[] name = new String[2]; //position, name
            while (st.nextToken() != StreamTokenizer.TT_EOF)
            {
                int i = 0, j = 0;
                for(int k = 0; k < 5; k++) {
                    switch (st.ttype) {
                        case StreamTokenizer.TT_WORD -> {
                            name[i] = st.sval;
                            i++;
                        }
                        case StreamTokenizer.TT_NUMBER -> {
                            date[j] = (int) st.nval;
                            j++;
                        }
                    }
                    if(k < 4)
                    {
                        st.nextToken();
                    }
                }
                array.add(new Player(date[0], date[1], date[2], name[0], name[1]));
            }
            br.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/kadai5/s10_5.obj"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/kadai5/s10_5.obj"));
            for (Player p : array)
                oos.writeObject(p);
            oos.close();
            Player p1 = (Player)ois.readObject();
            while (p1 != null)
            {
                System.out.println(p1);
                p1 = (Player)ois.readObject();
            }
            ois.close();
        }
        catch (EOFException eofe)
        {
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
