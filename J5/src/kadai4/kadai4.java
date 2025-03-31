package kadai4;

class kadai4
{
    public static void main(String[] args)
    {
        Board one = new Computer('①');
        Board two = new Computer('②');
        Board three = new Computer('③');
        Board.clear(); //initialize
        for (int i = 0; i < 3; i++) //do it for 9 times
        {
            one.put();
            two.put();
            three.put();
        }
    }
}
