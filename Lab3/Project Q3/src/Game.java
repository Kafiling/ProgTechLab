import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Game {
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;
    private int userScore=0;
    private int comScore=0;
    Scanner scanner = new Scanner(System.in);
    public void play(){
        while(Math.abs(userScore - comScore) < 2){
            this.Round();
        }
        System.out.println("----------------------------------------");
        if(userScore > comScore){
            System.out.println("Congrats! You win.");
        }
        else {
            System.out.println("Too bad! You lose.");
        }
        System.out.println("User Score: "+userScore);
        System.out.println("Computer score: "+comScore);
    }
    public void Round(){
        Random random = new Random();
        boolean result = false;
        String input = "3";
        int user = 0;
        boolean valid = false;
        while(!valid) {
            System.out.print("Enter 0 for ROCK, 1 for PAPER, 2 for SCISSORS: ");
            input = scanner.nextLine();  // Read user input
            switch (input) {
                case "0":
                    System.out.println("You enter: ROCK");
                    user = ROCK;
                    valid = true;
                    break;
                case "1":
                    System.out.println("You enter: PAPER");
                    user = PAPER;
                    valid = true;
                    break;
                case "2":
                    System.out.println("You enter: SCISSORS");
                    user = SCISSORS;
                    valid = true;
                    break;
                default:
                    break;
            }
        }
            int comp = random.nextInt(3);
            switch (comp) {
                case 0:
                    System.out.println("Computer: ROCK");
                    break;
                case 1:
                    System.out.println("Computer: PAPER");
                    break;
                case 2:
                    System.out.println("Computer: SCISSORS");
                default:
                    break;
            }
            if (user == comp) {
                System.out.println("It's a tie.");
            } else if (checkWin(user, comp)) {
                userScore += 1;
                System.out.println("You win!");
            } else {
                comScore += 1;
                System.out.println("You lose!");
            }


    }
    public boolean checkWin(int userInput,int compInput){
        boolean result = false;
        switch (userInput){
            case 0:
                if(compInput == 2){
                    result = true;
                }
                break;
            case 1:
                if(compInput == 0){
                    result = true;
                }
                break;
            case 2:
                if(compInput == 1){
                    result = true;
                }
                break;
        }
        return result;
    }
}
