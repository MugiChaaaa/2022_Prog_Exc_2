package kadai4;

import java.util.Random;

public class kadai4
{
    public static void main(String[] args)
    {
        Test[] test = new Test[5];
        for (int i = 0; i < test.length; i++)
        {
            test[i] = new Test(i+1, ran(), ran(), ran());
            test[i].goukei = test[i].sum();
        }

        System.out.printf("学籍番号 国語 英語 数学 合計 平均\n");
        for (int i = 0; i < test.length; i++)
        {
            test[i].print();
            System.out.printf(" %f\n", test[i].heikinn());
        }
        System.out.println("総合計: " + Total.total(test));
    }

    static int ran()
    {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
