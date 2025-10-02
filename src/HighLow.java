import java.util.Random;
import java.util.Scanner;

public class HighLow
{
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int targetNum = 0;
        int guessNum = 0;

        targetNum = rand.nextInt(10) + 1; // Random number between 1 and 10

        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter a guess between 1 and 10: ");
            if (in.hasNextInt()) {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum < 1 || guessNum > 10) {
                    System.out.println("Your guess is out of range. Please try again.");
                } else if (guessNum < targetNum) {
                    System.out.println("Too low. Target is " + targetNum);
                    done = true;
                } else if (guessNum > targetNum) {
                    System.out.println("Too high. Target is " + targetNum);
                    done = true;
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        }while(!done);
    }
}
