public class kadai3
{
    public static void main(String[] args)
    {
        System.out.println("The area of the circle(r=1, n=1000): " + Montecarlo(1000));
    }
    public static double Montecarlo(int num)
    {
        int hit = 0;
        for (int i = 0; i < num; i++)
        {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) //from the equation of a circle (x^2 + y^2 = r^2)
                hit++;
        }
        return ((double)hit / num) * 4; //from the equation of the area of a circle (S = πr^2)
    }
}
