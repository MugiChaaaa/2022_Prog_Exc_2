package kadai4;

abstract class Board
{
    static char[][] board = new char[3][3];

    abstract void put();

    static void clear()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '〇';
    }

    static void print()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println();
    }
}
