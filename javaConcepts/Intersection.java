package javaConcepts;

import java.util.*;
public class Intersection {
    public static void main(String[] data) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String ans = "";
        int  i = 0;
        char t = s.charAt(0);
        for( i = 1 ; i < s.length(); i++){
            if(s.charAt(i) != t){
                ans += t;
                t = s.charAt(i);
            }

        }
        ans += t;
        System.out.println(ans);
    }
}
