package kadai2;


import java.util.Random;

class Computer implements Jyanken
{
    public int play()
    {
        Random rand = new Random();
        return rand.nextInt(3);
    }
}
