package kadai1;

public class kadai1
{
    public static void main(String[] args)
    {
        ClassA a = new ClassC();
        a.print();
        a = new ClassB();
        a.print();
        a = new ClassA();
        a.print();
    }
}
