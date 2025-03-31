package kadai1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class kadai1
{
    public static void main(String[] args)
    {
        Calendar cal = new GregorianCalendar(2001, 6, 11); // 2001/7/11
        System.out.println("Your birthday is " + cal.get(Calendar.YEAR)+"/"+ (cal.get(Calendar.MONTH)+1) +"/"+cal.get(Calendar.DATE));
        Date birth = cal.getTime();
        Date now = new Date();
        long diff = now.getTime() - birth.getTime();
        System.out.println("The date difference is " + diff / 86400000 + " day(s)");
    }
}
