import java.util.Scanner;

public class kadai1
{
    public static void main(String[] args)
    {
        a();
        System.out.println("main:終了");
    }

    static void a()
    {
        b();
    }

    static void b()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("please input number1: ");
            int num1 = sc.nextInt();
            System.out.print("please input number2: ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);//divide
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e);
            //System.out.println(e.getMessage());
            //System.out.println("0で割っています");
        }
        finally
        {
            System.out.println("b:finally");
        }
    }
}
