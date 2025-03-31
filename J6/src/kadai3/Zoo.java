package kadai3;

class Zoo extends Facility
{
    Zoo(String name)
    {
        super(name);
    }
    void print()
    {
        System.out.println("動物園: " + name);
    }
}