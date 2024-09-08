import java.util.Scanner;
public class Fibonacci_Series
{
    public static void main(String[] args)
    {
        //  This code helps us to print fibonacci series.
        Scanner sc = new Scanner(System.in);
        // Declaring first two variables of fibonacci series.
        int x = 0;
        int y = 1;
        // Taking input from user that how many numbers user want to print in fibonacci series.
        System.out.println(" Enter a number until you want to print fibonacci series. ");
        int len = sc.nextInt();
        // Printing first two numbers in fibonacci series.
        System.out.print(x + " ");
        System.out.print(y+" ");
        // Loop for printing rest of fibonacci series.
        for (int i = 1; i<=len-2; i++)
        {
            int temp =y;
            y = x+y;
            System.out.print(y+" ");
            x = temp;
        }
    }
}
