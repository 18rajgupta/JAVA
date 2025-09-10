package javaConcepts;

import java.util.*;
public class BubbleSort {
    public static void bubblesort(int arr[]){
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {3,34,6,7,5};
        bubblesort(arr);

    }
}
