package dsaPrograms;
import java.util.*;
public class DSA5_PairsInArray {
    public static void pairsInArray(int number[]){
        int current = 0;
        int tp = 0;
        for(int i=0; i<number.length; i++){
            current = number[i];
            for(int j=i+1; j< number.length; j++){
                System.out.print("(" + current + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: " + tp);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        System.out.println("Pairs of an array are: ");
        pairsInArray(number);
    }
}
