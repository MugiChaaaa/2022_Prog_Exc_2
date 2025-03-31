package kadai1;

public class kadai1
{
    public static void main(String[] args)
    {
        AddInt test = new AddInt(10);
        System.out.println("getN: " + test.getN());
        System.out.println("add(5): " + test.add(5));
        System.out.println("add(5 + 100): " + test.add(5, 100));
    }
}
