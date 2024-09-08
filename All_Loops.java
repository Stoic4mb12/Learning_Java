import java.util.Scanner;
public class All_Loops
{
    public static void main(String[] args)
    {
// While loop
        // while (Condition to be checked. Boolean Expression)
        //           {Statements}
        int i = 1;
        while (i<5)
        {
            System.out.println(i);
            i++;
        }

// Do While loop
        // do
        //   {statements}  while (Condition to be checked. Boolean Expression)
        do
        {
            System.out.println(i);
            i++;
        }while (i<5);

// For Loop
        // for ( initialization ; Boolean Expression ; Update)
        // {Statements}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any to prints odd number in reverse order from the number mentioned.");
        int k = sc.nextInt();
        for (int j = k/2-1; j!=0; j-- )
        {
            System.out.println(j*2+1);
        }
        // Above for loop program prints odd number in reverse order from number entered by user

    }
}
