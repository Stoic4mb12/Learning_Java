import java.util.Scanner;
public class Conditionals_If_else
{
    public static void main(String[] args)
    {
//Program for knowing conditionals in Java
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age : ");
     //Taking input of age
     int a = sc.nextInt();
     int b = 18-a;
     //checking the condition whether the user has proper age for entry in group
     if (a>18)
     {
         System.out.println("You are mature, you can enter.");
     }else  {
         System.out.println("You are under age.Try after "+b+" year.");
     }
// In this way we can make sure that proper age group is entering our group

    }
}
