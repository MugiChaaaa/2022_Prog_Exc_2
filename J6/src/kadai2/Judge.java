package kadai2;

class Judge
{
    public static int judge(int hum, int com)
    {
        if ((hum == 0 && com == 1) || (hum == 1 && com == 2) || (hum == 2 && com == 0)) //player win
        {
            return 0;
        }
        else if ((hum == 0 && com == 2) || (hum == 1 && com == 0) || (hum == 2 && com == 1)) //computer win
        {
            return 1;
        }
        else //draw
        {
            return 2;
        }
    }
}
