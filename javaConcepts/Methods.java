package javaConcepts;

public class Methods {
    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    static void change(int []arr){
        arr[0] = 90;
    }
    static void foo(){                                  //METHOD OVERLOADING....
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){                             //METHOD OVERLOADING....
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a, int b){                      //METHOD OVERLOADING....
        System.out.println(a+b);
    }
    public static int sum(int x,int ...arr){        //VARARGS
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    static int factorial(int n){                  //RECURSION....
        if(n==0 || n==1){
            return 1;
        }
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        Methods obj = new Methods();       //METHOD INVOCATION USING OBJECT CREATION....
        c = obj.logic(a,b);
        System.out.println(c);

//WHEN WE TAKE ARRAY AS AN INPUT IN METHOD....
        int []marks = {52, 73, 77, 89, 98, 94};
        marks[0] = 98;
        change(marks);
        System.out.println("The value after rumming change is: " + marks[0]);

//METHOD OVERLOADING.....
        foo();
        foo(3000);

//VARIABLE ARGUMENTS(VARARGS)....
        System.out.println("Welcome to varargs tutorial!");
        System.out.println("The sum of nothing is: " + sum(2));
        System.out.println("The sum of 4,3 and 5 is: " + sum(4,3,5));
        System.out.println("The sum of 2,4,3 and 5 is: " + sum(2,4,3,5));
        System.out.println("The sum of 1,2,4,3 and 5 is: " + sum(1,2,4,3,5));

//RECURSION....
        int x = 4;
        System.out.println("The factorial of given number is: " + factorial(x));

    }
}
