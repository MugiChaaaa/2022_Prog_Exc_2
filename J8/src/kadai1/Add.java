package kadai1;

public class Add extends Thread
{
    public void run()
    {
        int a = 0;
        try
        {
            for(int i = 0; i < 10; i++)
            {
                a += (i + 1);
                System.out.println("Add= " + a);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
