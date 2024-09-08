
import java.util.Scanner;
public class Input_from_user {
    public static void main(String[] args){
//normal usage of taking inputs
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("1st number : ");
        int a = sc2.nextInt();
        System.out.println("2nd Number : ");
        float b =  sc2.nextFloat();
        System.out.println(a+b);
//boolean input
        System.out.println("Enter an integer : ");
        boolean c = sc2.hasNextInt();
        System.out.println(c);
//String input
        System.out.println("d : ");
        String d = sc.next();
        System.out.println(d);
//for multiple lines
        System.out.println("e : ");
        String e = sc3.nextLine();
        System.out.println(e);

    }
}
