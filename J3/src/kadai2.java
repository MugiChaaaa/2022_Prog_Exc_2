public class kadai2
{
    public static void main(String[] args)
    {
        Integer num1 = Integer.valueOf(args[0]);
        Integer num2 = Integer.valueOf(args[2]);
        double dnum1 = num1.doubleValue();
        double dnum2 = num2.doubleValue();
        char operator = new String(args[1]).charAt(0);
        System.out.println("input: " + args[0] + " " + args[1] + " " + args[2]);
        System.out.print("output: ");
        switch(operator)
        {
            case '+':
                System.out.println((dnum1 + dnum2));
                break;
            case '-':
                System.out.println((dnum1 - dnum2));
                break;
            case 'x':
                System.out.println((dnum1 * dnum2));
                break;
            case '/':
                System.out.println((dnum1 / dnum2));
                break;
            default:
                System.out.println("try again");
                break;
        }
    }
}
