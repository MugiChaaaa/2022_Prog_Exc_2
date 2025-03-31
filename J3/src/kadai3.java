import java.util.*;

public class kadai3
{
    public static void main(String[] args)
    {
        int i = 0;
        StringBuffer sb = new StringBuffer("横浜学部学EP");
        Scanner stdin = new Scanner(System.in);
        String Univ = stdin.next();
        String Dept = stdin.next();
        i = sb.indexOf("学", i);
        sb.insert(i, Univ);
        sb.insert(sb.indexOf("学", i + Univ.length() + 1), Dept);
        System.out.println(sb);
        System.out.println("number of characters: " + sb.length());
        System.out.println("capacity: " + sb.capacity());
    }
}
