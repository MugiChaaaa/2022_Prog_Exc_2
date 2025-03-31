package kadai2;

abstract class Light
{
    String str;
    Light(String str)
    {
        this.str = str;
    }

    abstract void print(); //only declaration
}
