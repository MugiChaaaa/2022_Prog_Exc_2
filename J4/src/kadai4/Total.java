package kadai4;

public class Total
{
    public static int total(Test[] tot)
    {
        int sou = 0;
        for (int i = 0; i < tot.length; i++)
        {
            sou += tot[i].getSum();
        }
        return sou;
    }
}
