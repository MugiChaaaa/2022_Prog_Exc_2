package kadai4;

import java.util.Random;

class Computer extends Board
{
    char symbols;
    Computer(char kigou)
    {
        symbols = kigou;
    }

    void put()
    {
        int temp1 = ran(), temp2 = ran();
        while(board[temp1][temp2] != '〇') //assuming that there is no case that the board is full (over 9 times)
        {
            temp1 = ran();
            temp2 = ran();
        }
        board[temp1][temp2] = symbols;
        print();
    }

    static int ran() //random number generator
    {
        Random rand = new Random();
        return rand.nextInt(3);
    }
}
