package javaConcepts;

import java.util.*;
public class main {
    static int factorial(int n){
        int product = 1;
        for(int i=1; i<=n; i++){
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
    // WRITE YOUR CODE HERE...
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a>8);
//
//        System.out.println(factorial(2));

        int []arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        for(int i=0; i<l/2;i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        System.out.println("Reversed array after swapping: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
