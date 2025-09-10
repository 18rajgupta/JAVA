package dsaPrograms;
import java.util.Scanner;

public class Pattern {
    public static void pattern(int n){
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for(int j=2*n-2*i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(4767674);
        pattern(n);
    }
}
