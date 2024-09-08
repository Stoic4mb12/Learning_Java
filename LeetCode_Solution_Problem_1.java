// In this code we need to achieve target by adding any two variables present in an array.
import java.util.Scanner;
public class LeetCode_Solution_Problem_1
{
        static void twoSum(int[] num, int target)
        {

           for(int o =0; o<num.length;o++)
            {
                int number1 = target - num[o];
                for (int c = 0; c < num.length; c++) {
                    if (number1 == num[c])
                    {
                        int number2= num[o];
                            System.out.println("Your target is acheived by " + number1 + " and " + number2);
                            int sumf = number1 + number2 ;
                            System.out.println(number1);
                            System.out.println(number2);
                            System.out.println(sumf);
                            break;
                    }
                }

            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int []maina = new int[10];
            for( int el = 0; el< maina.length; el++)
            {
                System.out.println(" Enter number to take input of an array. " + (el+1)+ " Number = ");
                maina[el] = sc.nextInt();

            }
            System.out.println("Enter the target you want to achieve by adding 2 numbers present in array.");
            int targetf =sc.nextInt();
            twoSum(maina, targetf);
        }
    }

