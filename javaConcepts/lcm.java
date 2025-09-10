package javaConcepts;

import java.util.Scanner;

public class lcm {
    public static void hcf_lcm(int n, int m) {
        if(n <1 || m < 1){
            System.out.print("Your numbers is wrong ");
            return ;
        }
        int i = 2,hcf = 1;
        while(i <= Math.min(n,m)){
            if(m%i==0 && n%i==0){
                hcf = i;
            }
            i++;
        }
        int lcm = (n*m)/hcf;
        System.out.print(hcf+" "+lcm);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        hcf_lcm(n,m);
    }
}
