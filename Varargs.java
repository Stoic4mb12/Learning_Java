public class Varargs
{
    // This code helps us to understand variable arguments
    // Here a method is made in which instead of parameters an array 'a' taken as parameter.
    // So value given in method is directly entered into element of 'a' array.
    // This is called variable arguments which helps us to enter various parameters into method.
    static int sum(int ...a)
    {
        // loop for making sum of all parameters entered in method sum().
        int r=0;
        for(int i =0; i<a.length;i++)
        {
            r +=a[i];
        }
        return r;
    }
    public static void main(String[] args)
    {
        // Calling out method to print sum of given parameters.
        System.out.println(" Sum of 1 is " + sum(1));
        System.out.println(" Sum of 1 & 2 is " + sum(1,2));
        System.out.println(" Sum of 1, 2 & 3 is " + sum(1,2,3));
        System.out.println(" Sum of 1, 2, 3 & 4 is " + sum(1,2,3,4));
    }
}
