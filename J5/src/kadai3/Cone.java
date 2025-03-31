package kadai3;

class Cone extends Circle
{
    double height;

    Cone(double radius, double height)
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
        return Math.PI * Math.pow(super.getRadius(), 2) * height / 3.0;
    }
}
