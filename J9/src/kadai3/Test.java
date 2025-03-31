package kadai3;

import java.util.*;

public class Test
{
    ArrayList arr = new ArrayList();
    Test() //インスタンス生成と同時に初期化(random ArrayList生成)
    {
        random();
    }
    void random()
    {
        Random rand = new Random();
        for(int i = 0; i < 100; i++)
        {
            int n = rand.nextInt(10);
            if(!arr.contains(n))
            {
                arr.add(n);
            }
        }
    }

    void print1()
    {
        arr.forEach(System.out::println);
        System.out.println(arr);
    }
    void print2()
    {
        for (Object o : arr)
            System.out.println(o);
        System.out.println(arr);
    }

    void sort()
    {
        Collections.sort(arr);
    }
    void sortr()
    {
        Collections.reverse(arr);
    }
}
