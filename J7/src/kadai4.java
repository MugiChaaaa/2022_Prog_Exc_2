public class kadai4
{
    public static void main(String[] args)
    {
        try
        {
            int count = 0;
            System.out.println("Command Line: " + args[0]);
            Class className = Class.forName(args[0]);
            do
            {
                className = className.getSuperclass();
                //System.out.println(className);
                count++;
            }while(className.getSuperclass() != null);
            System.out.println("スーパークラスが " + count + " 個あります");
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
}
