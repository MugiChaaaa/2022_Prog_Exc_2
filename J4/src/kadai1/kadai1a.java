package kadai1;

public class kadai1a
{
    int n;

    kadai1a(int num) {
        n = num;
    }

    public int getN() {
        return n;
    }

    public int add(int a) {
        int res = n + a;
        return res;
    }

    public static int add(int a, int b) //overload static method
    {
        int res = a + b;
        return res;
    }

    public static void main(String[] args)
    {
        kadai1a test = new kadai1a(10);
        System.out.println("getN: " + test.getN());
        System.out.println("add(5): " + test.add(5));
        System.out.println("add(5 + 100): " + test.add(5, 100));
    }
}
