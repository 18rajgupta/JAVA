package dsaPrograms;

import java.util.Scanner;

public class DSA16_SecondLargest_Smallest {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return (sLargest == Integer.MIN_VALUE) ? -1 : sLargest;
    }

    public static int secondSmallest(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return (sSmallest == Integer.MAX_VALUE) ? -1 : sSmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest Element: ");
        System.out.println(secondLargest(arr));

        System.out.println("Second Smallest Element: ");
        System.out.println(secondSmallest(arr));
    }
}
