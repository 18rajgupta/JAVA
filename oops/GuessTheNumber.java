package oops;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int random;
    public int inputuser;
    public int noOfGuesses = 0;
    public Game(){
        Random rand = new Random();
        random = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputuser = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputuser == random){
            System.out.printf("Hurray! You guess the number which is %d \n You guessed the no. in %d attempts", random, noOfGuesses);
            return true;
        }
        else if(inputuser < random){
            System.out.println("Too Low...");
        }
        else if(inputuser > random){
            System.out.println("Too High...");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
