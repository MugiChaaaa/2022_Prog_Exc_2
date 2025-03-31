package kadai3;

class Aquarium extends Facility
{
    Aquarium(String name)
    {
        super(name);
    }
    void print()
    {
        System.out.println("水族館: " + name);
    }
}