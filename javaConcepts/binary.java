package javaConcepts;

import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt() ;
        int bin = 0;
        String str = "0";
        while(dec != 0){
            str += String.valueOf(dec % 2);
            dec /= 2;
         }
        System.out.println(str);
    }
}
