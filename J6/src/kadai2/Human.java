package kadai2;

import java.util.Scanner;

class Human implements Jyanken
{
    public int play()
    {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }
}
