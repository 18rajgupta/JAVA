package oops;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class ExceptionClass {
    public static double area(int r) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of the function");
        }
        System.out.println("Cleaning up resources...This is the end of the function");

        return -1;
    }
    public static void main(String[] args) {
        // USING EXCEPTION CLASS...
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a<9){
//            try{
////                throw new MyException();
//                throw new ArithmeticException("This is an exception");
//            }
//            catch(Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//                System.out.println("Finished");
//            }
//            System.out.println("Yes Finished");
//        }


        // USE OF THROW AND THROWS....
//        try{
////            int c = divide(6, 0);
////            System.out.println(c);
//            double ar = area(-6);
//            System.out.println(ar);
//        }
//        catch(Exception e){
//            System.out.println("Exception");
//        }


        // USE OF FINALLY KEYWORD....
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while(true) {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
            System.out.println(5/0);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}