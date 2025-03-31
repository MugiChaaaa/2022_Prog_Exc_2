package kadai3;

class kadai3
{
    public static void main(String[] args) throws InterruptedException {
        Board bd = new Board();
        Computer c1 = new Computer('①', bd);
        Computer c2 = new Computer('②', bd);
        Computer c3 = new Computer('③', bd);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        bd.clear(); //initialize

        t1.start(); //start thread
        t2.start();
        t3.start();

        t1.join(); //wait for thread to finish
        t2.join();
        t3.join();

        bd.print(); //print result
        System.out.println("Thread1: " + c1.getCount());
        System.out.println("Thread2: " + c2.getCount());
        System.out.println("Thread3: " + c3.getCount());
        System.out.println("Total: " + (c1.getCount() + c2.getCount() + c3.getCount()));
    }
}