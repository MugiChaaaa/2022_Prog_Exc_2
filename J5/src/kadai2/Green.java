package kadai2;

class Green extends Light
{
    Green(String str)
    {
        super(str);
    }
    void print() //override
    {
        System.out.println("Green is " + str);
    }
}
