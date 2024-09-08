import java.util.Scanner;
public class Switch_case
{
    public static void main(String[] args)
    {
//This codes helps to understand the switch case
        Scanner sc = new Scanner(System.in);
        //To ask her what's her fav glower
        System.out.println("Which flower you like the most?");
        String flower = sc.next();

        //This helps you pick pickup lines according to the flower selected by your girl
        switch(flower)
        {
            case "Sunflower":
                System.out.println("Are you a sunflower? Because you brighten up my day.");
                break;
            case "Tulips":
                System.out.println("Do you have a map? Because I just got lost in your tulips.");
                break;
            case "Daisy":
                System.out.println("You like Daisy! I also have a daisy daydream about you.");
                break;
            case "Dandelion":
                System.out.println("If you were a flower, you'd be a damndelion.");
                break;
            default:
                System.out.println("I must be a bee who likes "+flower+" a lot, because I'm always buzzing around you.");
        }
    }
}
