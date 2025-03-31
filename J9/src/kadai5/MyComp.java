package kadai5;
import java.util.*;

public class MyComp implements Comparator<University>
{
    int m;

    MyComp(int m) {
        this.m = m;
    }

    public int compare(University o1, University o2) {
        int n1 = o1.n;  // String n1 = o1.name;  コメントはnameでソートする場合
        int n2 = o2.n;  // String n2 = o2.name;
        if (m >= 0)
            return n1 - n2;  // return n1.compareTo(n2);
        else
            return n2 - n1;  // return n2.compareTo(n1);
    }
}
