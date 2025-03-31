package kadai5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class University
{
    String name;
    int n;
    ArrayList<University> arr = new ArrayList<>();
    public University()
    {
        try
        {
            makeArr();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    public University(String name, int n)
    {
        this.name = name;
        this.n = n;
    }
    public void makeArr() throws IOException {
        Scanner stdin = null;
        try
        {
            stdin = new Scanner(new File(".\\src\\kadai5\\J9_5.txt"), StandardCharsets.UTF_8);
            while (stdin.hasNext())
            {
                String name = stdin.next();
                int n = stdin.nextInt();
                arr.add(new University(name, n));
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void sort(int m)
    {
        Collections.sort(arr, new MyComp(m));
    }
    public String toString(University u)
    {
        return u.name + " " + u.n;
    }
    public void print()
    {
        for (University u : arr)
            System.out.println(toString(u));
    }
}
