package kadai3;

import java.util.Random;

class Computer implements Runnable
{
    char symbols;
    int count = 0;
    Board bd;
    Computer(char kigou, Board bd)
    {
        symbols = kigou;
        this.bd = bd;
    }

    public void run()
    {
        int tries = 0;
        while(true)
        {
            if (bd.put(ran(), ran(), symbols))
            {
                count++;
                tries = 0;
            }
            else
            {
                tries++;
                if (tries >= 100)
                {
                    break;
                }
            }
        }
    }

    int getCount()
    {
        return count;
    }

    static int ran() //random number generator
    {
        Random rand = new Random();
        return rand.nextInt(Board.size);
    }
}
