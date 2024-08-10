import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t NUMBER GAME");
        System.out.println("-----------------------------");
        int ch = 1;
        while (ch==1) {
            int score = 100, attempt = 0, totalAttempt = 10;
            int rand = random.nextInt(100);
            System.out.println("Guess any number between 1 and 100");
            while (attempt != totalAttempt) {
                int userInput = scanner.nextInt();
                if (userInput >= 100 || userInput < 0) {
                    System.out.println("Invalid guess");
                } else {
                    attempt++;
                    if (rand > userInput) {
                        System.out.println("Your guess is too low");
                        System.out.println("try again");
                    } else if (rand < userInput) {
                        System.out.println("Your guess is too high");
                        System.out.println("try again");
                    } else {
                        System.out.println("Congratulations Your guess is correct");
                        break;
                    }
                    score = score - 10;
                }
            }
            System.out.println("Your score is " + score + " You take " + attempt + " attemps to guess the number.");
            System.out.println("Do you want to play again? press 1 for yes and 0 for no");
            ch = scanner.nextInt();
        }
    }
}