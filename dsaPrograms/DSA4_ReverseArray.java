package dsaPrograms;
import java.util.Scanner;
public class DSA4_ReverseArray {
    static void reverseArray(int number[]){
        int start = 0, end = number.length-1;
        while(start < end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Size of an array: ");
        int n = sc.nextInt();
        int number[] = new int[n];
        for(int i=0; i<number.length; i++){    // PROBLEM 1...
            number[i] = sc.nextInt();
        }

        for(int i=0; i<number.length; i++){    //PROBLEM 2...
            System.out.println(number[i]);
            sum += number[i];
        }
        System.out.println("The sum of elements: " + sum);   //PROBLEM 3...

        double avg = sum/n;
        System.out.println("The avg is: " + avg);   //PROBLEM 4...

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i] > max){
                max = number[i];
            }
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Maximum value: " + max);   //PROBLEM 5...
        System.out.println("Minimum value: " + min);

        int start = 0, end = number.length-1;    //PROBLEM 6...(BINARY SEARCH)
        int key = sc.nextInt(), mid = 0;
        while(start <= end){
             mid = (start+end)/2;
            if(number[mid] == key){
                System.out.println("The binary search index of key is: " + mid);
                break;
            }
            else if(number[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(number[mid] != key){
            System.out.println("The binary search index of key is: -1");
        }

        int f = 0;
        for(int i=0; i<number.length; i++){   // LINEAR SEARCH...


            if(number[i] == key){
                System.out.println("The linear search index of key is: " + i);
                f = 1;
            }
        }
        if(f==0){
            System.out.println("The linear search index of key is: -1");
        }

        reverseArray(number);             // PROBLEM 7...
        System.out.println("The reversed array is: ");
        for(int element : number){
            System.out.print(element + " ");
        }

    }
}
