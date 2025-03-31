package kadai3;

class Board
{
    final static int size = 10;
    static char[][] board = new char[size][size];
    static void clear()
    {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                board[i][j] = '〇';
    }

    static void print()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    synchronized boolean put(int i, int j, char c)
    {
        if(board[i][j] == '〇')
        {
            board[i][j] = c;
            return true;
        }
        else
            return false;
    }

}
