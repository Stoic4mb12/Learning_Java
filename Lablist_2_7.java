import java.util.Scanner;

class Lablist_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for matrix dimensions
	System.out.println(" Meet Prajapati\n 23BCP265 ");
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Initialize matrices
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        int[][] sum = new int[r][c];
        int[][] prod = new int[r][c];

        // Input for first matrix
        System.out.println("Enter elements of m1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements of m2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        // Perform addition
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Perform multiplication
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    prod[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Display sum
        System.out.println("Sum:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Display product
        System.out.println("Product:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
