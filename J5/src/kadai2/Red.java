package kadai2;

class Red extends Light
{
    Red(String str)
    {
        super(str);
    }
    void print() //override
    {
        System.out.println("Red is " + str);
    }
}
