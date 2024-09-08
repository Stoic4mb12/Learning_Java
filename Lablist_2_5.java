import java.util.Scanner;

 class Lablist_2_5 {

    public static void main(String[] args) 
{
	System.out.println(" Meet Prajapati\n23BCP265");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        printPyramid(input);
    }

    public static void printPyramid(String str) 
{
        int length = str.length();
        for (int i = 1; i <= length; i++) 
	{
            for (int j = 0; j < length - i; j++)
	 {
                System.out.print(" ");
         }
            for (int j = 0; j < i; j++) 
	 {
                System.out.print(str.charAt(j) + " ");
               
}
            System.out.println();
        }
    }
}