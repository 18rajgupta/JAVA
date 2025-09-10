package dsaPrograms;

import java.util.Scanner;

public class DSA17_RotateArrays {
    public static void rotateLeft(int[] arr, int n, int k) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + n - k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeftReverse(int[] arr, int n, int k){
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-1-k);
        reverse(arr, n-k, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        rotateLeft(arr, n, 2);
//        reverse(arr, 0, n-1);
        rotateLeftReverse(arr, n, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
