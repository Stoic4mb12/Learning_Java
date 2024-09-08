import java.util.*;

class Lablist_2_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int v=0;
		int co=0;
		System.out.println(" Meet Prajapati \n 23BCP265");
		System.out.println("Enter String to check ");
		str=sc.nextLine().toLowerCase();
	
		
		
    for (int i = 0; i<str.length();i++)
	 {
		char c = str.charAt(i);
           		 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
			  {
              		 	v++;
           		  }else {
               				co++;
          			}
         }
    


		System.out.println("In your entered word there are " +v+" Vowles and " +co+" Consonants.");
			
	}
}