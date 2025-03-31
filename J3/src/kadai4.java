public class kadai4
{
    public static void main(String[] args)
    {
        int[][] matrix2b2 = {{11,12},{21,22}};
        int[][] matrix4b6 = new int[4][6];
        matrix_copy(matrix2b2, matrix4b6);
        System.out.println("a[][]: ");
        matrix_print(matrix2b2);
        System.out.println("b[][]: ");
        matrix_print(matrix4b6);
    }

    public static void matrix_copy(int[][] a, int[][] b)
    {
        for(int i = 0; i < a.length; i++)
            System.arraycopy(a[i], 0, b[1+i], 2, a[i].length);
    }

    public static void matrix_print(int[][] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
