public class Multidimensional_array
{
    public static void main(String[] args) {
// Learning 2_dimensional Arrays through code
        int[][] matrix;
        matrix = new int[3][3];
        matrix[0][0] = 10;
        matrix[0][1] = 11;
        matrix[0][2] = 12;
        matrix[1][0] = 100;
        matrix[1][1] = 101;
        matrix[1][2] = 102;
        matrix[2][0] = 1001;
        matrix[2][1] = 1002;
        matrix[2][2] = 1003;

        //Printing 2-Dimensional Array
        for (int i = 0;i<matrix.length;i++)
        {
            for (int j = 0; j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
