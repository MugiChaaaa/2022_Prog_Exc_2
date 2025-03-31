package kadai4;

import java.util.*;

public class Prefecture
{
    String[][] str ={{"東京都","神奈川県","埼玉県","千葉県","茨城県","栃木県","群馬県"},
            {"新宿区","横浜市","さいたま市","千葉市","水戸市","宇都宮市","前橋市"}};
    String[] strkey = {"tokyo","kanagawa","saitama","chiba","ibaraki","tochigi","gunma"};
    HashMap<String, Integer> hash = new HashMap<>();

    public void makeHash()
    {
        for(int i=0; i<str[0].length; i++)
        {
            hash.put(strkey[i], i);
        }
    }

    public String toString(String key)
    {
        Integer i = hash.get(key);
        return str[0][i] + ", " + str[1][i];
    }
    void printAll()
    {
        for (String s : hash.keySet()) {
            System.out.println(s +": " + toString(s));
        }
    }

    void printPref(String key)
    {
        if (hash.containsKey(key))
        {
            System.out.println(toString(key));
        }
        else
        {
            System.out.println("見つかりません");
        }
    }
}
