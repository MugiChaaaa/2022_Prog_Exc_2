public class kadai1
{
    public static void main(String[] args)
    {
        Integer num = Integer.valueOf(args[0]);
        int decimal = num.intValue();
        System.out.println("decimal number: " + args[0]);
        System.out.println("binary: " + Integer.toBinaryString(decimal));
        System.out.println("hexadecimal: " + Integer.toHexString(decimal));
    }
}
