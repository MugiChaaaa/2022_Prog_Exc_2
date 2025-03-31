package kadai2;

public class Strcov
{
    static String END = "Goodbye";

    public static String toULCase(String wd)
    {
        String word;
        if (Character.isUpperCase(wd.charAt(0)))
            word = wd.toUpperCase();
        else
        {
            if(Character.isLetter(wd.charAt(0)))
                word = wd.toLowerCase();
            else //not a letter
                word = wd;
        }
        return word;
    }
}
