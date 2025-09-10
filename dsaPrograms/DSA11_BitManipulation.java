package dsaPrograms;

public class DSA11_BitManipulation {   // ( & , | , ^ , ~ , << , >> )
    //CHECK IF NUMBER IS ODD OR EVEN
    static void oddEven(int number) {
        if ((number & 1) == 1) {
            System.out.println("odd number");
        } else {
            System.out.println("even number");
        }
    }

    static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        n = n | bitMask;
        return n;
    }

    static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        n = n & bitMask;
        return n;
    }

    static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        n = n & bitMask;
        return n;
    }

    static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    static boolean isPowerOfTwo(int n) {   // CHECK THE NUMBER IS POWER OF TWO OR NOT.
        return (n & (n - 1)) == 0;
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    static int fastExpo(int a, int n) {   // O(logn)
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        oddEven(26);
//        System.out.println(getIthBit(5, 0));
//        System.out.println(setIthBit(10, 2));
//        System.out.println(clearIthBit(10, 1));
//        System.out.println(updateIthBit(10, 1, 1));
//        System.out.println(clearIBits(15, 2));
//        System.out.println(clearRangeOfBits(10, 2, 4));
//        System.out.println(isPowerOfTwo(8));
//        System.out.println(countSetBits(16));
        System.out.println(fastExpo(3, 5));
    }
}
