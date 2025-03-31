package kadai4;

public class Queue
{
    private final static int SIZE = 10;
    int array[] = new int[SIZE];
    int r = SIZE-1; // 読み取り位置
    int w = 0; // 書き込み位置
    int count = 0; // Queueにあるデータの数

    synchronized void add(int i) {
        while(count == SIZE) {
            try {
                notifyAll();
                wait();
            }
            catch(InterruptedException ie) {
                ie.printStackTrace();
                System.exit(0);
            }
        }
        array[w++] = i;
        if (w >= SIZE)
            w = 0;
        ++count;
    }

    synchronized int remove() {
        while(count == 0) {
            try {
                notifyAll();
                wait();
            }
            catch(InterruptedException ie) {
                ie.printStackTrace();
                System.exit(0);
            }
        }
        int element = array[r--];
        if (r < 0)
            r = SIZE-1;
        --count;
        return element;
    }
}
