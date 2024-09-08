import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor_game
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("                   Rock Paper Scissors\n       \tWelcome to Rock Paper and Scissors game\n         \tIt will be a best out of 3 Game\n Enter 1 for Rock\t Enter 2 for Paper\t Enter 3 for Scissors\n");

        int count_user = 0;
        int count_Len = 0;

            for (int i = 1; i <= 3; i++)
            {
                System.out.println("\nEnter Your Number for Rock Paper AND Scissors : ");
                int user = sc.nextInt();
                Random Ran = new Random();
                int Len = Ran.nextInt(1, 4);
                // System.out.println(user);
                System.out.println(Len);

                if (user == Len) {
                    System.out.println("It was a tie.");
                    i--;
                    continue;
                }

                if (user == 1 && Len == 2) {
                    System.out.println("Computer Won this Round.T_T");
                    count_Len++;
                }
                if (user == 1 && Len == 3) {
                    System.out.println("Hurray! You Won this Round.");
                    count_user++;
                }
                if (user == 2 && Len == 1) {
                    System.out.println("Hurray! You Won this Round.");
                    count_user++;
                }
                if (user == 2 && Len == 3) {
                    System.out.println("Computer Won this Round.T_T");
                    count_Len++;
                }
                if (user == 3 && Len == 1) {
                    System.out.println("Computer won this Round.T_T");
                    count_Len++;
                }
                if (user == 3 && Len == 2) {
                    System.out.println("Hurray! You Won this Round.");
                    count_user++;
                }



                    if (count_user == 2)
                    {
                        System.out.println("\nCongratulations. You won this Game from your PC.");
                    } else if (count_Len == 2)
                    {
                        System.out.println("\nBetter luck next Time. You lost.");
                    }

                }
            }
    }

