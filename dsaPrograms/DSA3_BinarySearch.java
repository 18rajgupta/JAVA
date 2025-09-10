package dsaPrograms;

import java.util.*;

public class DSA3_BinarySearch {
    static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        int mid = 0;
//        while(start <= end){
//            int mid = (start+end)/2;
//            if(number[mid] == key){
//                return mid;
//            }
//            else if(number[mid] < key){
//                start = mid+1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
        for (start = 0; start <= end; ) {
            mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10, 12, 10, 14};
        System.out.println("The index of key is: " + binarySearch(number, 10));
    }
}
