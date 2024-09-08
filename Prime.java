import java.util.*;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        boolean s = true;
        System.out.println("Enter a number n to find prime number upto n :");
        n = sc.nextInt();
        int count =0;

        for(int m =2; m<=n;m++)
        {
            for (int i = 1; i <=m ; i++)
            {
                if (m % i == 0)
                {
                    count++;
                }
            }

            if (count == 2)
            {
                System.out.println(m + " is prime number.");
            }
            count =0;
        }
    }
}
