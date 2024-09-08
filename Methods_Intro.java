import java.util.Scanner;
public class Methods_Intro
{
    // Using methods in Java to make a program look simpler.
    // Using "sum"  method to add two number if not equal
    static int sum(int x, int y)
    // The word static is used for calling function easily. If not present then we need to enter a line Like scanner one.
    {
        int sum;
        if (x != y)
        {
           sum = x + y;
        }else
        {
            sum =(x+y)*10;
        }
        return sum;
    }

    // Here static is not used for making method.
    // This function is used to take average of marks.
    int avg(int x, int y, int z, int q)
    {
        int avg  = (x +y+z+q)/4;
        return avg;
    }
    public static void main(String[] args)
    {
        // Taking input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Print 4 numbers(after each number press enter) : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int q = sc.nextInt();
        int z = sc.nextInt();
        // Calling a method to take out sum. As this method is declared using static only thus called by Method_name(Variables).
        int sum =  sum(x,y);
        System.out.println(sum);
        // Calling a method to take out average by creating an object average. As this method is declared by not using static thus it is called by Class_name variable(similar to sc as in line 13) = new Class_name();.
        // To avoid this lengthy method we use static methods.
        Methods_Intro average = new Methods_Intro();
        int a = average.avg(x,y,z,q);
        System.out.println(a);
    }
}
