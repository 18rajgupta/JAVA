package dsaPrograms;

import java.util.Arrays;

public class DSA1_LinearSearch {
    static int linearSearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number = {2, 5, 7, 11, 10, 12, 10, 16};
        System.out.println(linearSearch(number, 10));
        System.out.println("Hello World");
    }
}