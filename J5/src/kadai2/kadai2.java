package kadai2;

class kadai2
{
    public static void main(String[] args)
    {
        Light red = new Red("Stop");
        red.print();
        Light yellow = new Yellow("Caution");
        yellow.print();
        Light green = new Green("Walk");
        green.print();
    }
}
