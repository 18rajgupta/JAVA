package javaConcepts;

import java.util.*;
public class SelectionSort {
    public static void selectionsort(int []arr){
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            int smallest = i;
            for(int j=i+1; j<size; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {5,45,34,66,8,9};
        selectionsort(arr);
    }

}
