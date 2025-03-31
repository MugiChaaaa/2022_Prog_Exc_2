package kadai1;

public class ClassB extends ClassA
{
    public void print()//override
    {
        super.print();//print() from ClassA
        System.out.println("ClassB");
    }
}
