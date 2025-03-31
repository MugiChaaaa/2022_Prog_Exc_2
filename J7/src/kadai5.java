public class kadai5
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("スーパークラスが " + howManySuperClass(args[0]) + " 個あります");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("引数がありません");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("正しいクラス名ではありません");
        }
    }

    static int howManySuperClass(String className) throws ClassNotFoundException
    {
        int count = 0;
        System.out.println("Command Line: " + className);
        Class c = Class.forName(className);
        do
        {
            c = c.getSuperclass();
            count++;
        }while(c.getSuperclass() != null);
        return count;
    }
}
