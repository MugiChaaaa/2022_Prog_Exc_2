package kadai4;

public class Producer extends Thread
{
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        for(int i = 0; i < 100; ++i) {
            queue.add(i);
        }
    }
}
