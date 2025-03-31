package kadai3;

public class kadai3
{
    public static void main(String[] args)
    {
        Circle a = new Circle(1.0);
        Sphere b = new Sphere(2.0);
        Cylinder c = new Cylinder(3.0, 4.0);
        Cone d = new Cone(4.0, 4.0);
        System.out.println("Circle: ");
        System.out.println("r: " + a.getRadius());
        System.out.println("S: " + a.getArea());
        System.out.println("Sphere: ");
        System.out.println("r: " + b.getRadius());
        System.out.println("V: " + b.getVol());
        System.out.println("Cylinder: ");
        System.out.println("r: " + c.getRadius());
        System.out.println("h: " + c.getHeight());
        System.out.println("V: " + c.getVol());
        System.out.println("Cone: ");
        System.out.println("r: " + d.getRadius());
        System.out.println("h: " + d.getHeight());
        System.out.println("V: " + d.getVol());
    }
}
