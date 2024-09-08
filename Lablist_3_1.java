import java.util.*;

class Lablist_3_1
{
	void dis()
	{
		int feet,inch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in feet");
		feet=sc.nextInt();
		System.out.println("Enter the distance in inch");
		inch=sc.nextInt();
		
		System.out.println("The distance in feet is "+feet);
		System.out.println("The distance in inch is "+inch);
		
	}
}



class lablist3_i
{
	public static void main(String args[])
	{
		distance d=new distance();
		d.dis();
	}
}
