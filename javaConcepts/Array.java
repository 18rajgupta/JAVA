package javaConcepts;

import java.util.*;
public class Array {
    public static void main(String[] args) {
//        int []marks = {35,45,55,66,77};
//        marks[4] = 80;
//        System.out.println(marks[4]);
//        System.out.println(marks.length);
//        //DISPLAYING THE ARRAY USING FOR LOOP....
//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
//        //DISPLAYING THE ARRAY USING FOR LOOP IN REVERSE ORDER....
//        for(int i=marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
//l
//        //DISPLAYING THE ARRAY USING FOR-EACH LOOP....
//        System.out.println("Displaying array using for-each loop:");
//        for(int element: marks){
//            System.out.println(element);
//        }

// MULTIDIMENTINAL ARRAYS....
//        int []marks = new int[5];   //1-D ARRAY....
//        int [][]flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//        System.out.println("Printing a 2-d array using for loop:");
//        for(int i=0; i<flats.length; i++){
//            for(int j=0; j<flats[i].length; j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//CREATE AN ARRAY OF 5 FLOATS AND CALCULATE THEIR SUM....
//        float []arr = new float[5];
//        arr[0] = 2.0f;
//        arr[1] = 2.1f;
//        arr[2] = 2.2f;
//        arr[3] = 2.3f;
//        arr[4] = 4.4f;
//        float sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println("The sum of five float values is: " + sum);

//WRITE A PROGRAM TP FIND OUT WHETHER A GIVE INTEGER IS PRESENT IN AN ARRAY OR NOT....
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        float num = sc.nextFloat();
//        boolean b = false;
//        float []arr = new float[5];
//        arr[0] = 2.0f;
//        arr[1] = 2.1f;
//        arr[2] = 2.2f;
//        arr[3] = 2.3f;
//        arr[4] = 4.4f;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==num){
//                b = true;
//                break;
//            }
//        }
//        if(b)
//            System.out.println("The number is present in an array....");
//        else
//            System.out.println("The number is not present in an array....");

//CALCULATE THE AVERAGE MARKS FROM AN ARRAY CONTAINING MARKS OF ALL STUDENTS IN PHYSICS USING FOR-EACH LOOP....
//        float sum = 0.0f;
//        int []marks = {50,50,50,50,50};
//        for(int element:marks){
//            sum += element;
//        }
//        float avg = sum/marks.length;
//        System.out.println("The average marks of all the students in physics: " + avg);

//CREATE A JAVA PROGRAM TO ADD TWO MATRICES OF SIZE 2 X 3....
//        int [][]mat1 = {{1,2,3},
//                        {4,5,6}};
//        int [][]mat2 = {{7,8,9},
//                        {10,11,12}};
//        int [][]result = new int[2][3];
//        System.out.print("After adding two matrices:\n");
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.printf(result[i][j] + " ");
//            }
//            System.out.println();
//        }

//WRITE A JAVA PROGRAM TO REVERSE AN ARRAY.....
        int []arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int temp;
//        for(int i=0; i<l/2;i++) {
//            temp = arr[i];
//            arr[i] = arr[l - 1 - i];
//            arr[l - 1 - i] = temp;
//        }
//        System.out.println("Reversed array after swapping: ");
//        for(int i=0; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//WRITE A JAVA PROGRAM TO FIND THE MAXIMUM ELEMENT IN AN ARRAY....
//        int []arr = {23,43,54,2,365,98};
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("The maximum element in an array: " + max);
        //WRITE A JAVA PROGRAM TO FIND THE MINIMUM ELEMENT IN AN JAVA ARRAY....
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("The minimum element in an array is: " + min);

//WRITE A JAVA PROGRAM TO FIND WHETHER AN ARRAY IS SORTED OR NOT....
//        int []arr = {1,2,3,87,5,6};
//        boolean isSorted = true;
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted)
//            System.out.println("The array is sorted....");
//        else
//            System.out.println("The array is not sorted....");
        //      c
        //          i
        // 1 3 5 4 2 6  =  arr                       temp 3;
//        int arr[] = {1, 2, 89, 9, 5, 6, 7, 8};
//        int c = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                int temp = arr[i];
//                arr[i] = arr[c];
//                arr[c] = temp;
//                c++;
//            }
//            System.out.print(arr[i] + " ");
//        }
    }
}





