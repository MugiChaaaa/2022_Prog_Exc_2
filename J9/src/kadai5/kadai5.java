package kadai5;

import java.io.IOException;

public class kadai5
{
    public static void main(String[] args)
    {
        University u = new University();
        u.sort(1);
        u.print();
        System.out.println("----------------------------------------");
        u.sort(-1);
        u.print();
    }
}
