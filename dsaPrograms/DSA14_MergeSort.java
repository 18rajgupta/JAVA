package dsaPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA14_MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();  //TEMPORARY ARRAY
        int left = low;   //STARTING INDEX OF LEFT HALF OF AN ARRAY
        int right = mid + 1;  //STARTING INDEX OF RIGHT HALF OF AN ARRAY

        //STORING ELEMENTS IN HE TEMPORARY ARRAY IN A SORTED MANNER
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        //IF ELEMENTS ON THE LEFT HALF ARE STILL LEFT
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //IF ELEMENTS ON THE RIGHT HALF ARE STILL LEFT
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        //TRANSFERRING ALL ELEMENTS FROM TEMPORARY TO ORIGINAL ARRAY
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n-1);
        System.out.println("After sorting array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
