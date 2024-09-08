import java.util.Scanner;
public class Practice_Set_5_Loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    // Question 1
        for(int i = 5; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    // Question 2
        System.out.println("Give a number to get sum of even number till that number");
        int n = sc.nextInt();

        int j =0;
        int sum= 0;
        while (j != n)
        {
           sum =sum + 2*j;
           j++;
        }
            System.out.println(sum);

    // Question 3
        System.out.println("Enter Number to get its multiplication table.");
        int mul = sc.nextInt();

        for (int i =1; i<=10; i++)
        {
            System.out.println(mul + " x " + i + " = "+mul*i );
        }
    // Question 4
        System.out.println("Enter Number to get its multiplication table in reverse order.");
        int mulr = sc.nextInt();

        for (int k = 10; k >=1; k--)
        {
            System.out.println(mulr + " x " + k + " = "+ mulr * k);
        }

    // Question 5
        System.out.println("Enter a number to get its factorial.");
        int facn = sc.nextInt();
        int ans =1;
        for (int num = 1; num <=facn; num++ )
        {
            ans = ans*num;
        }
        System.out.println(ans);
    // Question 6
        int answ =1;
        int numw =1;
        int facnw = sc.nextInt();
        while (numw <= facnw)
        {
            answ = answ*numw;
            numw++;
        }
        System.out.println(answ);

    // Question 7
    // Question 8
        //True

    // Question 9
        int muls = sc.nextInt();
        int anss;
        int sums = 0;
        for (int o = 1; o<=10; o++)
        {
            anss = muls * o ;
            sums =sums + anss ;
        }
        System.out.println(sums);



    }
}
