public class Array_in_Methods
{
    // Also void is mentioned while making an array instead of any datatype, due to void we are free not to return any value.
    // In this method both array's number and an integer is changed
    static void arr(int []array, int b)
    {
        b = 20;
        array[0]=99;
    }
    public static void main(String[] args)
    {
        int c = 10;
        int []array1 = {1,2,34,4,5};
        // arr method is called
        arr(array1, c);
        System.out.println(array1[0] +" "+ c);
        // On printing, array number is changed while integer c is not changed.
        // This is because array passes the reference while integer passes variable when called. Thus only array is changed.
    }
}
