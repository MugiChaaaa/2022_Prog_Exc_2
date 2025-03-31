import java.util.*;

public class kadai5
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.print("検索する言葉を入力: ");
        String str = stdin.next();
        System.out.println(search("東京特許許可局許可局長", str) + " item(s) found");
    }

    public static int search(String a, String key)
    {
        System.out.println("東京特許許可局許可局長");
        int count = 0, num = 0;
        for (int i = 0; i < a.length(); i++)
        {
            num = a.indexOf(key, i);
            if (num > 0) // if there is a match
            {
                i = num; // move the cursor from next element
                count++;
            }
        }
        return count;
    }
}
