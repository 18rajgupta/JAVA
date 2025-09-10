package javaConcepts;

import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 5};
        Arrays.sort(array);
        int uniqueCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }
        uniqueCount++;
        int[] resultArray = new int[uniqueCount];
        resultArray[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                resultArray[index++] = array[i];
            }
        }

        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));
    }
}

