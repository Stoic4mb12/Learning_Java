import java.util.*;

class Employee
{
    int id ;
    String name ;
    int Salary;
    public void Print()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(Salary);
    }
}
public class First_Class
{
    public static void main(String[] args) {
        // Instantiating objects
        Employee Meet = new Employee();
        Employee Smit = new Employee();

        // Setting attributes for Meet
        Meet.id = 265;
        Meet.name = " Meet Prajapati";
        Meet.Salary = 80;

        // Setting attributes for Smit
        Smit.id =115;
        Smit.name = "Smit Patel";
        Smit.Salary = 90;

        // Printing all Attributes
        Meet.Print();
        Smit.Print();
    }
}
