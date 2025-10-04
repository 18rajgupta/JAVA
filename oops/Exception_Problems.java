package oops;

import java.util.Scanner;

class CustomException extends Exception {    // PROBLEM 4
    public String toString() {
        return "Error";
    }
}

public class Exception_Problems {
    public static void main(String[] args) throws CustomException {
        // PROBLEM 1
        // Syntax Error - int a = 7
        int age = 78;
        int year_born = 2000 - 78; // LOGICAL ERROR
        // System.out.printf(6/0);  --> RUNTIME ERROR

        // PROBLEM 2
        try {
            int a = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }

        // PROBLEM 3
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            try {
                System.out.println("Enter the value of index");
                int index = sc.nextInt();
                System.out.println("The valur of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        // PROBLEM 4
        try {
            if (i >= 5) {
                throw new CustomException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
