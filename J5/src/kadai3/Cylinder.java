package kadai3;

class Cylinder extends Circle
{
    double height;

    Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    double getHeight()
    {
        return height;
    }

    double getVol()
    {
        return getArea() * height;
    }
}
