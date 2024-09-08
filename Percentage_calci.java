import java.util.Scanner;
public class Percentage_calci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks According to subject");
        System.out.println("Maths");
        float a = sc.nextFloat();
        System.out.println("Chemistry");
        float b = sc.nextFloat();
        System.out.println("Physics");
        float c = sc.nextFloat();
        System.out.println("English");
        float d = sc.nextFloat();
        System.out.println("Computer");
        float e = sc.nextFloat();
        System.out.println("So percentage will be : ");
        System.out.println(((a+b+c+d+e)*100)/500);
//Above code describes us about how to take out percentage

    }

}
