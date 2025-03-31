package kadai3;

public class kadai3
{
    public static void main(String[] args)
    {
        Rectangular rec1 = new Rectangular(21.64, 9.01);
        Rectangular rec2 = new Rectangular(21.64);
        System.out.println("rec1: ");
        rec1.print_rec();
        System.out.println("area: " + rec1.getArea());
        System.out.println("rec2: ");
        rec2.print_rec();
        System.out.println("area: " + rec2.getArea());
    }
}
