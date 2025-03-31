package kadai3;

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

}
