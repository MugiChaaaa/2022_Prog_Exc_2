package kadai3;

abstract class Facility
{
    String name;
    Facility(String name)
    {
        this.name = name;
    }
    abstract void print();
}
