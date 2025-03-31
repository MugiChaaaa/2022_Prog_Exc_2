package kadai5;

import java.io.Serializable;

public class Player implements Serializable
{
    static final long serialVersionUID = 1L;
    String position;
    String name;
    int year;
    int month;
    int day;
    Player(int year, int month, int day, String position, String name)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.position = position;
        this.name = name;
    }
    public String toString()
    {
        return String.format("%4d年%2d月%2d日 %s %s",year,month,day,position,name);
    }
}
