package kadai4;

import java.util.Scanner;

public class kadai4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Prefecture p = new Prefecture();
        p.makeHash();
        p.printAll();
        System.out.print("キー入力: ");
        String key = sc.nextLine();
        while(!key.equals("end"))
        {
            p.printPref(key);
            System.out.print("キー入力: ");
            key = sc.nextLine();
        }
    }
}
