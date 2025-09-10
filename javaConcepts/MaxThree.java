package javaConcepts;

import java.util.*;
public class MaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i=n-1; i>=n-3; i--){
            System.out.println(arr[i]);
        }

    }
}
