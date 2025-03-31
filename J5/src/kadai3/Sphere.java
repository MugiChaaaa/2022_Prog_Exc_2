package kadai3;

class Sphere extends Circle
{
    Sphere(double radius)
    {
        super(radius);
    }

    double getVol()
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(super.getRadius(), 3);
    }
}
