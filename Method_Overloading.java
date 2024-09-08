public class Method_Overloading
{
    // 3 methods made to understand method overloading.
    static void load()
    {
        System.out.println("load 1 Printed");
    }
    static void load(int x)
    {
        x=2;
        System.out.println("load " +x +" Printed");
    }
    static void load(int x, int y)
    {
        x = 3;
        y = 4;
        System.out.println("load" +x+y+ " Printed");
    }
    public static void main(String[] args)
    {
        int a=1;
        int b=3;
        int c=2;
        // Calling three methods of same name with different parameters.
        load();
        load(a);
        load(a,b);
        // Thus we don't get an error, due to method overloading.
    }
}
