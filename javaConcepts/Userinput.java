package javaConcepts;

import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1:");
////        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2:");
////        int b = sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of these numbers is:");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

// WRITE A PROGRAM TO CALCULATE PERCENTAGE OF A STUDENT IN 5 SUBJECT.
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int sum = m1 + m2 + m3 + m4 + m5;
        float percentage = sum / 5;
        System.out.println(percentage);
    }

}