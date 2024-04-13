import java.util.Random;
import java.util.Scanner;
public class AppQ2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(9)+1;
        int userGuess;
        System.out.print("Guess a number between 1 and 9:\n");
        do 
        {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if(userGuess == numberToGuess)
            {
                System.out.print("Well guessed!! The number was "+ numberToGuess + ".");
                break;
            }
            else
            {
                System.out.print("Incorrect guess.");
            }
        } 
        while (true);
        scanner.close();
    }
}
