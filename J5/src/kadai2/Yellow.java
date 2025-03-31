package kadai2;

class Yellow extends Light
{
    Yellow(String str)
    {
        super(str);
    }
    void print() //override
    {
        System.out.println("Yellow is " + str);
    }
}
