package dsaPrograms;

import java.util.Scanner;

public class DSA13_Sorting {
    static void selectionSort(int[] arr, int n) {  // SELECT MINIMUMS AND SWAP(SELECTION SORT)
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void bubbleSort(int[] arr, int n) {  // PUSH THE MAXIMUMS TO THE LAST OF THE ADJACENT SWAPS(BUBBLE SORT)
        for (int i = 0; i < n; i++) {
            int didSwap = 0;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) return;
//            System.out.println("pass");
        }
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        selectionSort(arr, n);
        bubbleSort(arr, n);
//        insertionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
