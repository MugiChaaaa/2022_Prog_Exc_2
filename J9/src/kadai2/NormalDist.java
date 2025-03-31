package kadai2;

import java.util.Random;

public class NormalDist
{
    int[] arr;
    double mean, stdDev;
    NormalDist(double mean, double stdDev)
    {
        this.mean = mean;
        this.stdDev = stdDev;
        arr = new int[(int)(20*stdDev+1)];
    }
    void startRand()
    {
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++)
        {
            double x = rand.nextGaussian();
            int index;
            if (x < 0)
            {
                index = ((int)((10*x)-0.5)+((arr.length-1)/2));
            }
            else
            {
                index = ((int)((10*x)+0.5)+((arr.length-1)/2));
            }
            if(index >= 0 && index < arr.length)
                arr[index]++;
        }
    }
    void printNormalDist()
    {
        for(int i = 0; i < arr.length; i ++)
        {
            System.out.printf("%4.1f: ", (((double)i / 10) + mean - stdDev));
            for(int j = 0; j < arr[i] / 1000; j++)
            {
                System.out.print("*");
            }
            System.out.println(/*arr[i]*/);
        }
    }
    void printPercent()
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println(((double)sum/10000.0) + "%");
    }
}
