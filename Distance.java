class distance
{	int feet,inch;

	 // Default constructor
	distance()
	{
		System.out.println("This is deafault construtor");
		this.feet=1;
		this.inch=1;
	}
	
	// Parameterized constructor
	public distance(int feet,int inch)
	{
		System.out.println("This is parameterized construtor");
		this.feet=feet;
		this.inch=inch;	
	}
	
	//Copy constructor
	public distance(distance dc)
	{
		System.out.println("This is copy construtor");
		this.feet=dc.feet;
		this.inch=dc.inch;	
	}
	
	void display()
	{
		System.out.println("The distance in feet and inch are " + feet + " and " + inch + " respectively");
	}
	
}


class lablist3_vi
{
	public static void main(String args[])
	{	
		 // Using default constructor
		distance d1=new distance();
		d1.display();
		
		 // Using parameterized constructor
		distance d2=new distance(4,5);
		d2.display();
		
		//Using copy constructor
		distance d3=new distance(d2);
		d3.display();
	}
}
