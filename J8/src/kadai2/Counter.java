package kadai2;

public class Counter
{
    private int count = 0;
    public synchronized void countUp()
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }
}
