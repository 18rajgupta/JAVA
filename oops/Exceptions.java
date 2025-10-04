package oops;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // INTRODUCTION TO TRY/CATCH BLOCK FOR HANDLING EXCEPTIONS...
//        int a = 6000;
//        int b = 0;
//        try{
//            int c = a/b;
//            System.out.println("The result is: " + c);
//        }
//        catch(Exception e){
//            System.out.println("We failed to divide. Reason: ");
//            System.out.println(e);
//        }
//        System.out.println("End of the program");
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();

        // FOR HANDLING SPECIFIC EXCEPTIONS...
//        int[] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array index: ");
//        int ind = sc.nextInt();
//
//        System.out.println("Enter the number you want to divide the value with: ");
//        int number = sc.nextInt();
//        try{
//            System.out.println("The value at array index entered is: " + marks[ind]);
//            System.out.println("The value of array-value/number is: " + marks[ind]/number);
//        }
//        catch(ArithmeticException e){
//            System.out.println("ArithmeticException occurred!");
//            System.out.println(e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException occurred!");
//            System.out.println(e);
//        }
//        catch(Exception e){
//            System.out.println("Some other exception occurred!");
//            System.out.println(e);
//        }

//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();

        // INTRODUCTION TO NESTED TRY/CATCH....
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to video no 82");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}
