package kadai2;

import java.util.Scanner;

public class kadai2
{
    public static void main(String[] args)
    {
        int hum, com, num, res; //declaration & Pre-settings
        int[] wld = {0, 0, 0}; //{ win, lose, draw }
        Human human = new Human();
        Computer computer = new Computer();
        Judge judge = new Judge();
        Scanner scan = new Scanner(System.in);

        System.out.println("あなたは何回勝つまでプレイしますか？");
        num = scan.nextInt();

        while(wld[0] < num)
        {
            System.out.println("0:グー 1:チョキ 2:パー");

            hum = human.play();
            com = computer.play();

            System.out.println("あなたは" + Jyanken.str[hum]);
            System.out.println("コンピュータは" + Jyanken.str[com]);

            res = judge.judge(hum, com);
            wld[res]++;

            switch (res)
            {
                case 0 -> System.out.println("あなたの勝ちです");
                case 1 -> System.out.println("コンピュータの勝ちです");
                case 2 -> System.out.println("あいこです");
            }
            System.out.println("あなたは " + wld[0] + "勝 " + wld[1] + "負 " + wld[2] + "あいこ です");
            System.out.println();
        }
        System.out.println("お疲れさまでした");
    }
}
