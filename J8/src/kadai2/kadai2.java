package kadai2;

public class kadai2
{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ThreadX ta = new ThreadX(counter);
        ThreadX tb = new ThreadX(counter);
        ThreadX tc = new ThreadX(counter);

        ta.start();
        tb.start();
        tc.start();

        ta.join(); //wait for thread to finish
        tb.join();
        tc.join();
        System.out.println("count = " + counter.getCount());
    }
}
