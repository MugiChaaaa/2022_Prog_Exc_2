package kadai2;

public class kadai2
{
    public static void main(String[] args)
    {
        NormalDist nd = new NormalDist(0, 3.0);
        // these arguments are for print.
        // NormalDistribution will be calculated as mean = 0, stdDev = 1.
        nd.startRand();
        nd.printNormalDist();
        nd.printPercent();
    }
}
