import java.util.Scanner;
public class Practice_Set_6_Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
// Question 1
        // Creating an array
        float []arr1 = {1.1f,2.2f,3.3f,4.4f,5.5f};
        // Calculating the sum of numbers present in the array.
        float sum = 0;
        for (int i = 0; i <arr1.length;i++)
        {
            sum = sum + arr1[i];
        }
        System.out.println(sum);

// Question 2
        // Taking input from the user of the number he wants to check from the list or array.
        System.out.println("Enter the number you want to check the number in an list or array.");
        double un = sc.nextInt();
        // Creating list or array of numbers
        double []nu = {1234567890, 987654321, 999888777};

        // Loop to check whether the number entered is present in the list or array or not. Boolean is used to print a statement when it is not present in the list or array
        boolean s = true;
        for(int i = 0; i<nu.length;i++)
        {
            if (nu[i]== un)
            {
                System.out.println("Number Entered is present in the list or array.");
                s = true;
                break;
            }else
            {
                s= false;
            }
        }
        if (s == false)
        {
            System.out.println("Entered Number is not present in the list or array.");
        }

// Question 3
        // Entering Physics Marks of students present in the Standard
        int []marks = {89,65,78,88,56,45,78,98};

        // Loop for taking sum of elements present in the array.
        int sum3 = 0;
        for (int el : marks)
        {
            sum3 = sum3 + el;
        }

        // Calculating average of elements of an array.
        float len = marks.length;
        float avg = sum3/len;
        System.out.println(avg);

// Question 4
        //Taking input of 2 matrix
        int [][]matrix_1 = {{1,2,3},
                            {4,5,6}};
        int [][]matrix_2 = {{1,2,3},
                            {4,5,1}};
        //For taking sum of 2 matrix
        int [][]mre = {{0,0,0},
                       {0,0,0}};

        //loop for taking sum of 2 matrix
        for (int k = 0; k<matrix_1.length;k++)// By this matrix_1's 0th row{1,2,3} and 1st row{4,5,6} are taken into action
        {
            for (int l = 0; l<matrix_1[k].length;l++)// By this matrix_1's 0th(1 & 4), 1st(2 & 5) and 2nd(3 & 6) column are taken into action
            {
                mre[k][l] = matrix_1[k][l] + matrix_2[k][l];
                System.out.print(mre[k][l]+" ");
            }
            System.out.print("\n");
        }

// Question 5
        // Creating an  array to reverse it off.
        int []org = {1,2,3,4,5};
        // Calculating length of an original array.
        int leng = org.length;

        // Loop to reverse an array.
        for (int rv= 0; rv<leng/2;rv++)
        {
            int temp = org[rv];
            org[rv] = org[leng -rv-1];
            org[leng -rv-1] = temp;
        }
        System.out.print("{");
        for (int el : org)
        {
            System.out.print(el +" ");
        }
        System.out.println("}");

// Question 6
        // Creating an array.
        int []max = {12,13,93,45,90};
        // Creating an integer to print maximum number.
        int maxi = 0;

        // Loop to find the maximum number from the array.
        for (int mx = 0; mx<max.length-1;mx++)
        {
            if (max[mx] >maxi)
            {
                maxi = max[mx];

            }

        }
        System.out.println(maxi);

// Question 7
        // Creating an array.
        int []min = {12,13,45,93,1,2,4,90};
        // To print the minimum number declaring an integer mini.
        int mini = 0;
        // Condition to find a random number from the array.
        if(min[0]<min[1])
        {
            mini =min[0];
        }else {mini = min[1];}

        // Loop to find minimum number from an array.
        for (int mn = 0; mn<min.length-1;mn++)
        {
            if (min[mn] < mini)
            {
                mini = min[mn];
            }

        }
        System.out.println(mini);

// Question 8
        // Creating an array.
        int []sort = {1,223,23,3545,1,34};
        // Declaring boolean true if conditional present in following loop doesn't run.
        boolean sortb =true;

        // Loop for checking whether the array is sorted or not.
        for  (int st =0; st<sort.length-1;st++)
        {
            if(sort[st]>sort[st+1])
            {
                sortb=false;
                break;
            }
        }

        // To print whether array is sorted or not.
        if(sortb)
        {
            System.out.println("Your array is sorted");
        }else{
            System.out.println("Your array is not sorted.");
        }
    }
}
