public class kadai2
{
    public static void main(String[] args)
    {
        double[] vector3d = new double[3];
        vector3d[0] = 3;
        vector3d[1] = 4;
        vector3d[2] = 5;
        System.out.println("Length of the vector: " + Magnitude(vector3d));
    }
    public static double Magnitude(double[] vector3d)
    {
        double sum = 0;
        for(int i = 0; i < vector3d.length; i++)
            sum += Math.pow(vector3d[i], 2);
        return Math.sqrt(sum);
    }
}
