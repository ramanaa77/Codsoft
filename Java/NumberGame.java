import java.util.*;

public class NumberGame {
    private static Scanner sc;

    static int gameProcess(){
        sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100)+1;

        System.out.println("Number guessing Game:");
        int attempt = 0;
        int maxattempt = 10;

        while(attempt < maxattempt){
            System.out.println("Enter the guess:");
            try {
                int guess = sc.nextInt();
                sc.nextLine();
                if (1 <= guess && guess <= 100) {
                    if (guess > number) {
                        System.out.println("Too high");
                        System.out.println("Remaining attempts you have is: " + (maxattempt - (attempt + 1)));
                    } else if (guess < number) {
                        System.out.println("Too low");
                        System.out.println("Remaining attempts you have is: " + (maxattempt - (attempt + 1)));
                    } else {
                        System.out.println("You found the correct number! ");
                        System.out.println("It is " + number);
                        return 1;
                    }
                    attempt++;
                } else {
                    System.out.println("Invalid input. Enter number between 1 to 100.");
                }
            } catch (Exception E) {
                System.out.println("Invalid input. Please enter valid input.");
                sc.nextLine();
            }
        }
        System.out.println("Out of attempts! The correct number was: " + number);
        return 0;
    }

    public static void main(String[] args) {
        int score = 0;
        score += gameProcess();
        while(true){
            System.out.println("Your score is: " + score);
            try {
                System.out.println("Do you want to play again(yes/no)");
                String decision = sc.nextLine().toLowerCase();
                if (decision.equals("no")) {
                    break;
                } else if (decision.equals("yes")) {
                    score += gameProcess();
                } else {
                    System.out.println("Something went wrong!");
                }
            } catch (Exception E){
                System.out.println("Invalid input. Please enter valid input.");
                sc.nextLine();
            }
        }
        System.out.println("Your final score is: " + score);
    }
}
