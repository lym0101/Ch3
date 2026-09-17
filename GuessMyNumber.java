import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1; 
        int guess = scanner.nextInt();
        
        System.out.println("Welcome to the Guess My Number game!");
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        
        System.out.println("Type a Number: ");
        
        System.out.println("Your guess is: " + guess);
        System.out.println("The Number was: " + number);

        int amtOff = Math.abs(number-guess);
        System.out.println("You were off by: " + amtOff);
}
