package kadai4;

public class Test
{
    int gakuseki, kokugo, eigo, suugaku, goukei;

    Test(int gakuseki, int kokugo, int eigo, int suugaku)
    {
        this.gakuseki = gakuseki; //practice of using `this`
        this.kokugo = kokugo;
        this.eigo = eigo;
        this.suugaku = suugaku;
    }

    public int sum()
    {
        return kokugo + eigo + suugaku;
    }

    public int getSum()
    {
        return goukei;
    }

    public void print()
    {
        System.out.printf("%6d%5d%4d%4d%4d", gakuseki, kokugo, eigo, suugaku, goukei);
    }

    public double heikinn()
    {
        return (double)goukei / 3;
    }
}
