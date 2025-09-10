package javaConcepts;

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age;
//        System.out.println("Enter your age: ");
//        age = sc.nextInt();
//
//        switch(age){
//            case 18:
//                System.out.println("You are going to become an adult!");
//                break;
//            case 23:
//                System.out.println("You are going to join a job!");
//                break;
//            case 60:
//                System.out.println("You are going to get retired!");
//                break;
//            default:
//                System.out.println("Enjoy your life!");
//        }
//        System.out.println("Thanks for using my Java Code!");


//PROBLEM 2....
//        System.out.println("Enter marks of physics: ");
//        int m1 = sc.nextInt();
//        System.out.println("Enter marks of chemistry: ");
//        int m2 = sc.nextInt();
//        System.out.println("Enter marks of mathematics: ");
//        int m3 = sc.nextInt();
//        float avg = (m1+m2+m3)/3.0f;
//
//        if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
//            System.out.println("Student is pass!");
//        }
//        else{
//            System.out.println("Student is fail");
//        }

//PROBLEM 3....
//        System.out.println("Enter income of an Enployee in Lakhs:");
//        float income = sc.nextFloat();
//        float tax = 0.0f;
//        if(income<2.5f){
//            System.out.println("There is no tax...");
//        }
//        else if(income>=2.5f && income<5.0f){
//            tax = tax + 0.05f*income;
//            System.out.println(tax);
//        }
//        else if(income>=5.0f && income<10.0f) {
//            tax = tax + 0.20f * income;
//            System.out.println(tax);
//        }
//        else if(income>=10.0f) {
//            tax = tax + 0.30f * income;
//            System.out.println(tax);
//        }

//PROBLEM 4....
//        System.out.println("Enter the number:");
//        int number = sc.nextInt();
//        switch(number){
//            case 1:
//                System.out.println("MONDAY");
//                break;
//            case 2:
//                System.out.println("TUESDAY");
//                break;
//            case 3:
//                System.out.println("WEDNESDAY");
//                break;
//            case 4:
//                System.out.println("THURSDAY");
//                break;
//            case 5:
//                System.out.println("FRIDAY");
//                break;
//            case 6:
//                System.out.println("SATURDAY");
//                break;
//            case 7:
//                System.out.println("SUNDAY");
//                break;
//            default:
//                System.out.println("NOTHING IS HERE...");
//        }

//PROGRAM 5....LEAP YEAR OR NOT....
//        System.out.println("Enter the year:");
//        int year = sc.nextInt();
//        if(year%4==0){
//            if(year%100!=0 || (year%100==0 && year%400==0)){
//                System.out.println("This is a Leap year...");
//            }
//            else{
//                System.out.println("This is not a Leap year...");
//            }
//        }
//        else{
//            System.out.println("This is not a Leap year...");
//        }

//PROBLEM 6....
        System.out.println("Enter your website name:");
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Organisation Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }

    }
}
