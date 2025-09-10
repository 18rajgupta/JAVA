package javaConcepts;/* There is a frog sitting on the numberline somewhere let's say at x0. The frog is bored and decides to jump around the numberline.
In a jump of d unit from position x, he can either land on x-d for jumping left and on x+d for jumping right.

The direction he will jump in depends on where he currently is i.e.
if he is on even coordinate jump left otherwise jump right.

Now the frog decides to make n jumps of step 1 to n succeccively.
For a given value of x0 and n determine where he will land eventually.

EX: x0     n     ans
    0      1     -1
    0      2      1
    10     10     11
 */
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (x % 2 == 0) {
                x = x - i;
            }
            else {
                x = x + i;
            }
        }

        System.out.println(x);
        sc.close();

        }
}
