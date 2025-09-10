package javaConcepts;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input : 0 or rock, 1 for paper, 2 for scissor...");
        int userInput = sc.nextInt();
        Random rand = new Random();
        int computerInput = rand.nextInt(0, 3);

        if(userInput == computerInput) System.out.println("Draw...!!");
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You Win...!!");
        }
        else{
            System.out.println("Computer Win...!!");
        }

        System.out.println("Computer Input : " + computerInput);
    }
}
