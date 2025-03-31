public class ExtoString
{
    int x, y;
    public ExtoString(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "オーバーライド " + Thread.currentThread().getStackTrace()[1].getMethodName() + " x = " + x + ", y = " + y;
    }
}
