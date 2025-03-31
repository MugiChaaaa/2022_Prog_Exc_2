package kadai2;

public class ThreadX extends Thread
{
    Counter counter;
    ThreadX(Counter counter)
    {
        this.counter = counter;
    }
    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            counter.countUp();
        }
    }
}
