package javaConcepts;

import java.util.*;
public class newquestion {
    public static void main(String[] data) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i]=  sc.nextInt();
    }
    int c =1;
    for(int i = 0; i< n; i++){
        if(n % i+1 == 0){
            c+= Math.pow(arr[i],2);
        }
    }
        System.out.println(c);
    }
}
