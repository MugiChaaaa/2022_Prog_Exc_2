package kadai3;

import java.util.Scanner;

public class kadai3
{
    public static void main(String[] args)
    {
        String choice;
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true)
        {
            System.out.println("| 預入:d | 引出:w | 残高照会:g | 終了:e |");
            choice = sc.nextLine();
            if ("d".equals(choice))
            {
                System.out.println("預入金額を入力");
                account.deposit(sc.nextLine());
            }
            else if ("w".equals(choice))
            {
                System.out.println("引出金額を入力");
                account.withdraw(sc.nextLine());
            }
            else if ("g".equals(choice))
            {
                System.out.println("残高: " + account.getBalance());
            }
            else if ("e".equals(choice))
            {
                System.out.println("取引終了");
                break;
            }
            else
            {
                System.out.println("入力が間違っています");
            }
        }
    }
}
