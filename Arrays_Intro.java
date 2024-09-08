import java.util.Scanner;
public class Arrays_Intro
{
    public static void main(String[] args)
    {
    // Helps us how an array can help to print even numbers through loops
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int []even = new int[n];
        for (int i =0;i<n;i++)
        {
            even[i] = 2*i;
            System.out.println(even[i]);
        }
    // Different way of declaring or making array

        // Declaration
        int []marks;

        //Declare + Initialize+ memory allocation
        int []marks2 = {11,12,34,56,42,23};

        //Memory allocation
        int []marks3 = new int[5];

    }
}
