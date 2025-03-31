import java.util.Scanner;

public class kadai2
{
    public static void main(String[] args)
    {
        try
        {
            int n = Integer.parseInt(args[0]);
            System.out.println(n);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("引数がありません");
            isInt();
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("int型ではありません");
            isInt();
        }
    }

    static void isInt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("int型を入力してください");
        try
        {
            System.out.println(Integer.parseInt(sc.nextLine()));
        }
        catch(NumberFormatException e)
        {
            isInt();
        }
    }
}
