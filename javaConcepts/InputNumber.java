package javaConcepts;

import java.util.Scanner;
public class InputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number: ");
        // PROBLEM 1...
        try {
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("The number is negative.");
            } else if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
        catch (Exception e) {
            System.out.println("Error: Invalid number.");
        }

        //PROBLEM 2
        System.out.println("Enter the password: ");
        String p = sc.next();
        for(int i=0; i<p.length(); i++){

        }

    }
}
