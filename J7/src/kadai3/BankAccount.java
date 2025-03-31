package kadai3;

import java.util.Scanner;

public class BankAccount
{
    private int balance = 0;
    Scanner sc = new Scanner(System.in);

    public void deposit(String amount)
    {
        try
        {
            if(Integer.parseInt(amount) <= 0)
                throw new IllegalArgumentException("預入金額が０または負です");
            else
            {
                balance += Integer.parseInt(amount);
                System.out.println("残高: " + getBalance());
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("int型を入力してください");
            deposit(sc.nextLine());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void withdraw(String amount)
    {
        try
        {
            if(Integer.parseInt(amount) <= 0)
                throw new IllegalArgumentException("引出金額が０または負です");
            else if(Integer.parseInt(amount) > balance)
                throw new IllegalArgumentException("残高不足の為引出出来ません");
            else
            {
                balance -= Integer.parseInt(amount);
                System.out.println("残高: " + getBalance());
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("int型を入力してください");
            withdraw(sc.nextLine());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int getBalance()
    {
        return balance;
    }
}
