package kadai1;

public class AddInt {
    int n;

    AddInt(int num) {
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
}