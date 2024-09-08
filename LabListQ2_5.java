import java.util.*;

public class LabListQ2_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a String : ");
        String S = sc.next();
        int n = S.length();
        int count=0;

        for (int l =n-1;l>=0;l--)

        {
            for (int i = 0; i < l; i++)
            {
                System.out.print(" ");
            }
            for(int j =0;j<=count;j++)
            {

                char c =S.charAt(j);
                System.out.print(c + " ");

            }
            count++;
            System.out.println("");

        }
    }
}
