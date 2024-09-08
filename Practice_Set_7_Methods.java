import java.util.Scanner;
public class Practice_Set_7_Methods
{
// Question 1
    static void multi(int x)
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println( x+ " x "+ i + " = "+ x*i);
        }
    }

// Question 2
    static void pattern(int x)
    {
        for (int i = 1; i<=x; i++)
        {
            for(int j = 1; j <=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

// Question 3
    static int sum(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + sum(x - 1);
        }
    }
// Question 4
    static void pattern2(int x)
    {
        for (int i=1; i<=x; i++)
        {
            for(int j=x;j>=i; j--)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

// Question 5
    static void fibo(int x)
    {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if(x == 1) {
            System.out.println(n1);
        }else if (x ==2)
        {
            System.out.println(n2);
        }else
        {
            for (int i = 1; i <= (x - 2); i++) {
                sum = n1 + n2;
                int temp = n1;
                n1 = n2;
                n2 = sum;
            }
            System.out.println(sum);
        }
    }

// Question 6
    static void sumofa(int []sumf)
    {
        int sum = 0;
        for( int i = 0; i<sumf.length;i++)
        {
            sum = sum + sumf[i];
        }
        System.out.println(sum);
    }

// Question 7
    static int rp(int x)
    {
        if (x == 1)
        {
            System.out.println(" *");
            return 1;
        }else {
            for (int i =1; i<=x;i++ )
            {
                System.out.print(" *");
            }
            System.out.println("");
            return rp(x-1);
        }
    }

// Question 8
    static int sp(int x, int y)
    {
        int sum = 0;
        if(y != x )
        {
            for ( int i = 1; i<= y;i++)
            {
                System.out.print(" *");
            }
            System.out.println("");
            return sp(x, y+1);
        }else
        {
            for (int i = 1; i<=y; i++)
            {
                System.out.print(" *");
            }
            System.out.println("");
            return 1;
        }
    }

// Question 9
    static int Far(int x)
    {
        int F = x * 9/5 + 32;
        return F;
    }
    public static void main(String[] args)
    {
        // Calling all methods Question wise.
        Scanner sc = new Scanner(System.in);

        System.out.println(" Answer 1 : ");
        System.out.println(" Enter the number for its multiplication table.");
        int n = sc.nextInt();
        multi(n);

        System.out.println("Answer 2 : ");
        System.out.println(" Enter number of rows you want to print in star pattern, in which star print printed in a row is equal to their row number : ");
        n = sc.nextInt();
        pattern(n);

        System.out.println(" Answer 3 : ");
        System.out.println(" Enter a natural number to know its sum of all natural number up to it.");
        n = sc.nextInt();
        int s = sum(n);
        System.out.println(s);

        System.out.println(" Answer 4 : ");
        System.out.println(" Enter number of rows you want to print in star pattern, in which star print printed in a row is equal to their row number : ");
        n = sc.nextInt();
        pattern2(n);

        System.out.println(" Answer 5 : ");
        System.out.println(" Enter a number n to print nth number of fibonacci series.");
        n = sc.nextInt();
        fibo(n);

        System.out.println(" Answer 6 : ");
        System.out.println("Enter size of an array.");
        n = sc.nextInt();
        System.out.println(" Give input of " + n +" number in an array.");
        int []sumf2 = new int[n];
        for ( int el = 0; el<sumf2.length;el++)
        {
            sumf2[el] = sc.nextInt();
        }
        sumofa(sumf2);

        System.out.println(" Answer 7 : ");
        System.out.println("Enter a number of rows you want in a star triangle(Perpendicular at top or starting.).");
        n = sc.nextInt();
        int rp = rp(n);

        System.out.println("Answer 8 : ");
        int y =1;
        System.out.println("Enter a number of rows you want in a star pyramid.");
        n =sc.nextInt();
        int sp = sp(n, y);

        System.out.println("Answer 9 : ");
        System.out.println(" Enter temp in Celcius to get its Farenheit Value.");
        n = sc.nextInt();
        int far = Far(n);
        System.out.println(far);

        System.out.println("Answer 10 : ");
        
    }
}
