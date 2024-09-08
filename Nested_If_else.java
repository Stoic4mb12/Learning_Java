import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Nested_If_else
{
    public static void main(String[] args)
    {
//This program helps us to know about nested if-else
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);

    System.out.println("Enter your name : ");
    String Name = sc1.nextLine();
    System.out.println("Enter your standard you have passed : ");
    int std = sc.nextInt();
    int b = 12-std;

    //This will help us know whether you are eligible for counselling or not
        if (std == 12)
        {
            System.out.println(Name + " are eligible for counselling for college selection.");
        }else if (std < 12){
            if (b == 1)
            {
                System.out.println("Fill the form after "+b+" year");
            }
            System.out.println("Fill the form after "+b+" years");
        }else if (std > 12)
        {
            System.out.println("Wait for further instruction on our website. ");
        }else {
            System.out.println("Enter valid standard you have completed.");
        }

    }
}
