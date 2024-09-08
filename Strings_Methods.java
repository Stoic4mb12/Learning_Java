import java.util.Scanner;
public class Strings_Methods
{
    public static void main(String[] args)
    {


// Defining String and giving its value
            String a = "Meet";
            String s = new String("Meet osi");
            System.out.println(a);
            System.out.println(s);
//Taking input from user
//Also explains difference between sc.next and sc.nextLine
            Scanner sc = new Scanner(System.in);
            String b = sc.nextLine();
            System.out.println("b : "+ b);
            Scanner sc1 = new Scanner(System.in);
            String c = sc1.nextLine();
            System.out.println(c);
// Now describing methods of string
            // First for length of String
            int l = b.length();
            System.out.println(l);

            //Convert all char to lower case
            String L = b.toLowerCase();
            System.out.println(L);

            //Convert all char to Uppercase
            String U = b.toUpperCase();
            System.out.println(U);

            //Prints a string with mentioned index
            String S1 = b.substring(3);
            System.out.println(S1);
            String S = b.substring(3,6);
            System.out.println(S);

            //replaces e from b string with sem
            String r = b.replace("e","sem");
            System.out.println(r);

            //Removes all Spaces at end and starting only
            String T = b.trim();
            System.out.println(T);

            //Print true if b string starts with Me
            System.out.println(b.startsWith("Me"));

            //Print true if b string ends with it
            System.out.println(b.endsWith("ti"));

            //Return char at index mentioned from b string
            System.out.println(b.charAt(3));

            //Returns Index of given char mentioned
            System.out.println(b.indexOf("P"));
            System.out.println(b.indexOf("p",5));
            //starts searching from last
            System.out.println(b.lastIndexOf("i",  5));

            //basically checks == diff will be explained in the following codes
            System.out.println(b.equals("Meet Prajapati"));
            System.out.println(b.equalsIgnoreCase("meet pRaJapati"));


    }
}