package kadai2;

public class kadai2
{
    public static void main(String[] args)
    {
        int i = 0;
        for (i = 0; i < args.length; i++)
            System.out.print(Strcov.toULCase(args[i]) + " ");
        System.out.println();
        System.out.println(Strcov.END);
    }
}
