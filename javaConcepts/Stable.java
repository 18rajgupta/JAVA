package javaConcepts;//Find difference stable and unstable that accepts five 4 didit numbers and ret
//rns the difference between sum of stable numbers and sum of unstable numbers.
//A number is stable if the frequency of each digit are same otherwise unstable.
import java.util.*;
public class Stable {
    public static  int[] freqNum(int num){
        int freq[] = new int[10];
        while(num != 0){
            freq[num % 10]++;
            num /= 10;
        }
        return freq;
    }
    public static  boolean check(int[] freq){
        int t = 0, gate = 0;
        for(int j = 0; j < 10; j++){
            if(freq[j] > 0) {
                if(gate == 0) {
                    t = freq[j];
                    gate++;
                }
                if (freq[j] != t)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // how many number want
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int stable = 0, unstable = 0;
        for(int i=0; i<n; i++){
            int freq[] = freqNum(arr[i]);

            if(check(freq)) stable += arr[i];
            else unstable += arr[i];
            }
        System.out.print(Math.abs(stable - unstable));
        }

    }

