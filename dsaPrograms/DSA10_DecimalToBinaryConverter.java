package dsaPrograms;

public class DSA10_DecimalToBinaryConverter {
    public static void binToDecimal(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastNum = binNum % 10;
            decNum = decNum + lastNum * (int) Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal no of " + myNum + " = " + decNum);
    }
    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary no of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        binToDecimal(111);
        decToBin(15);
    }
}
