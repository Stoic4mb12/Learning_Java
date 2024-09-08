class Lablist_2_6
{
	public static void main(String args[])
	{
		int arr[]={76,35,63,38,14,105};
		int max=arr[0];
		System.out.println(" Meet Prajapati\n 23BCP265 ");
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Largest number in array is " +max);
	}
}