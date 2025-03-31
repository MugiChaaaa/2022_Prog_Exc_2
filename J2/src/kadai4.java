public class kadai4
{
    public static void main(String[] args)
    {
        int sum = 0, sqsum = 0;
        for(int i = 1; i <= 10; i++)
        {
            sum += i;
            sqsum += Math.pow(i, 2);
        }
        System.out.println("sum: " + sum);
        System.out.println("sqsum: " + sqsum);
    }
}
