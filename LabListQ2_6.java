import java.util.*;

public class LabListQ2_6
{
    static void Max(int arr[])
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(" Maximum number in an array is 0"+ max);
    }

    static void PrintArr(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length of an array. ");
        int n= sc.nextInt();
        int []a=new int[n];

        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        PrintArr(a);
        Max(a);
    }
}
