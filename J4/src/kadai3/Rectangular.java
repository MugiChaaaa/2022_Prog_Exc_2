package kadai3;

public class Rectangular
{
    double height;
    double width;

    Rectangular(double h, double w)
    {
        height = h;
        width = w;
    }

    Rectangular(double h)
    {
        height = h;
        width = 10;
    }

    public void print_rec()
    {
        System.out.println("height: " + height);
        System.out.println("width: " + width);
    }

    public double getArea()
    {
        return height * width;
    }
}
