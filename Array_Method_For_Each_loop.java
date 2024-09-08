public class Array_Method_For_Each_loop
{
    public static void main(String[] args)
    {
// Using array_name.length method to find length of an array
        int[] m = new int[11];
        for (int i =1 ; i<m.length; i++)
        {
            m[i] = 3*i;
        }

// Using for each loop to print an array
        for (int el : m)
        {
            System.out.println(el);
        }
    }
}
