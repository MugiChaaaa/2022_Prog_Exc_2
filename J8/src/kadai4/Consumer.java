package kadai4;

public class Consumer extends Thread
{
    String str;
    Queue queue;

    Consumer(String str, Queue queue) {
        this.str = str;
        this.queue = queue;
    }

    public void run() {
        for(int i = 0; i < 100; ++i) {
            System.out.println(str + ": " + queue.remove());
        }
    }
}
