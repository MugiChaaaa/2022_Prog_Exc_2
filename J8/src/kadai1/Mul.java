package kadai1;

public class Mul extends Thread
{
    public void run()
    {
        int m = 1;
        try
        {
            for(int i = 0; i < 10; i++)
            {
                m *= (i + 1);
                System.out.println("Mul= " + m);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
