import java.util.Scanner;
import java.util.Random;

public class guess{
    public static void main(String[] args) {
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1;
        
        System.out.println("Enter your guess(1-100): ");

        Scanner scanner =new Scanner(System.in);
        int playerguess = scanner.nextInt();

        if(playerguess==randomnumber)
        {
            System.out.println("correct you win");
        }
        else if(randomnumber > playerguess){
            System.out.println("Nope! The number is Higher.Guess again");
        }
        else{
            System.out.println("Nope! The number is lower.Guess again.");
        }

    }
}