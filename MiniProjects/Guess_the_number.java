package MiniProjects;
import java.util.*;
public class Guess_the_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();  //selects a number randomly between 0+1 and 99+1
        int numberToGuess = random.nextInt(100)+1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guess The Number game.");
        System.out.println("The system will randomly select a number between 0-100. You have to guess it correctly.");
        System.out.println("Let's begin.");

        while(true){
            System.out.println("Enter your guess : ");
            guess = sc.nextInt();
            attempts++;

            if(guess<1 || guess>100) {
                System.out.println("Please enter a number form 1-100.");
                continue;
            }
            if(guess == numberToGuess){
                System.out.println("Correct! You guessed the number correctly in " + attempts + " attempts.");
                break;
            }
            else if(guess < numberToGuess) System.out.println("Too low. Try again.");
            else System.out.println("Too high. Try again");
        }
        sc.close();
    }
}
