import java.util.*;
public class LabListQ2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meet Prajapati \n 23BCP265 ");
        System.out.println("Enter number A :");
        int a=sc.nextInt();
        System.out.println("Enter number B :");
        int b=sc.nextInt();
        System.out.println("Enter number C :");
        int c=sc.nextInt();


        // Using the conditional operator to find the maximum of three numbers
        int lar = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The Largest of the three numbers is: " + lar);
    }
}
