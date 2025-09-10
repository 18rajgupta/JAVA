package javaConcepts;

import java.util.*;

public class solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), d1 = sc.nextInt(),n2 = sc.nextInt() ,d2 = sc.nextInt();
        int dsum = d1*d2,nsum = n1*d2 + n2*d1,i = 2,hcf = 1;
        while(i <= Math.min(nsum,dsum)){
            if(dsum%i==0 && nsum%i==0)
                hcf = i;
            i++;
        }
        System.out.println(nsum/hcf+"/"+dsum/hcf);
    }
}
