package dsa;
import java.util.Arrays;

public class DSA2_PrintAllDivisors {
    static void allDivisors(int n){    //BRUTE FORCE
        int size = 0;
        for (int i=1; i<=n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
                size++;
            }
        }
        System.out.println();
        System.out.println(size);
    }
    static int[] printAllDivisors(int n, int[] size){
        int count = 0;
        int sqrt = (int)Math.sqrt(n);
        int result[] = new int[n];
        for(int i=1; i<=sqrt; i++){
            if(n%i == 0){
                result[count++] = i;
                if(i != n/i){
                    result[count++] = n/i;
                }
            }
        }
        size[0] = count;
        return result;
    }
    static void factorialNumbers(long N){
        long product = 1;
        for(long i=1; i<=N; i++){
            product *= i;
            if(product <= N){
                System.out.print(product + " ");
            }
        }

    }
    static void reverse(int[] arr, int i, int n){
        if(i < n/2) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

            reverse(arr, i+1, n);
        }
    }

    public static void main(String[] args) {
       // allDivisors(12);

//        int size[] = new int[1];
//        int divisors[] = printAllDivisors(12, size);
//        Arrays.sort(divisors);
//        for(int i=size[0]; i<divisors.length; i++){
//            System.out.print(divisors[i] + " ");
//        }

//        factorialNumbers(6);
        int[] reversed = {1, 2, 3, 4, 5};
        int s = 0; int e = reversed.length;
        reverse(reversed,s, e);
        for(int ele : reversed){
            System.out.println(ele);
        }
    }
}
