package kadai2;

import java.io.*;

public class kadai2
{
    public static void main(String[] args){
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("src/kadai2/s10_2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/kadai2/d10_2.txt"));
            String temp;
            while((temp = br.readLine()) != null)
            {
                int i = 0;
                StringBuffer sb = new StringBuffer(temp);
                while(i != -1)
                {
                    i = sb.indexOf("た", i);
                    if(i == -1)
                        break;
                    sb.deleteCharAt(i);
                    i++;
                }
                bw.write(String.valueOf(sb));
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("File d10_2.txt created.");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
