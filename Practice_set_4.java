import java.util.Scanner;
public class Practice_set_4
{
    public static void main(String[] args)
    {
//All Qustions are available in previous folder
        //Question1
        // Will throw an error as assignment operator is used in if condition

        //Question 2
        //Taking inputs from user of their marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths marks : ");
        int Math = sc.nextInt();

        System.out.println("Enter your Chemistry marks : ");
        int Chemistry = sc.nextInt();

        System.out.println("Enter your Physics marks : ");
        int Physics = sc.nextInt();

        //Calculating total percentage
        float total_per = (Math+Chemistry+Physics)/3.0f;
        System.out.println("Your overall percentage is " + total_per);

        // we can also use AND(&&) logical operator instead of and(&) operator
        if (total_per>=40 & Physics>=33 & Chemistry>=33 & Math>=33)
        {
            System.out.println("You have successfully passed this year.");
        }else
        {
            System.out.println("Try again next year.");
        }

        //Question

        //Question 3
        //Taking input from user of his salary
        System.out.println("Enter your monthly Salary(Enter is numbers only) : ");
        double salary = sc.nextDouble();
        //Taking tax = 0 for simple calculations
        double tax =0.0;

        //for diff patches use if to calculate the tax of an employee
        if (salary<=250000.0)
        {
            System.out.println("Tax = 0");
        }else if (salary>250000.0 & salary<=500000.0)
        {
            tax = tax + (salary-250000.0)*.05;
            System.out.println("Tax = "+tax);
        }else if (salary>500000.0 & salary<=1000000.0)
        {
            tax = tax + (salary-250000.0)*.05;
            tax = tax + (salary-500000.0)*.2;
            System.out.println("Tax = "+tax);
        }else if (salary>1000000.0 )
        {
            tax = tax + (salary-250000.0)*.05;
            tax = tax + (salary-500000.0)*.2;
            tax = tax + (salary-1000000.0)*.3;
            System.out.println("Tax = " +tax);
        }else {
            //if someone uses 2.5L or 10k then we need to give this error
            System.out.println("PLease enter your salary in number don't use L for lakh");
        }

        //Question 4
        //Taking input from user
        System.out.println("Enter any number from 1 to 7 for printing days : ");
        int day = sc.nextInt();
        //using switch case
        switch(day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            //this is error which will be displayed for someone who enters Number greater than 7 or less than 1
            default -> System.out.println("Enter number bet 1 to 7");
        }



    }
}
