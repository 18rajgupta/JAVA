package oops;

import java.util.Scanner;

public class CustomCalculator {
    public static void main(String[] args) {
        /*
        Exercise: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input exception. ex: 8 & 9
        2. Cannot divide by 0 exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier reached Exception - Don't allow any multiplication input to be greater than 7000
         */


        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input Exception !!");
        }

    }
}
