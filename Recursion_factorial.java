import java.util.Scanner;
public class Recursion_factorial
{
    static int factorial(int x)
    {
        if (x == 0 || x == 1)
        {
           return 1;
        }else{
        return x*factorial((x-1));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to calculate its factorial.");
        int a = sc.nextInt();
        int fac =factorial(a);
        System.out.println(fac);
    }
}
