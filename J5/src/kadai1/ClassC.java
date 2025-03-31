package kadai1;

public class ClassC extends ClassB
{
    public void print()//override
    {
        super.print();//print() from ClassB
        System.out.println("ClassC");
    }
}
