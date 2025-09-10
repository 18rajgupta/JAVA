package dsaPrograms;

public class DSA2_LargestNumber {
    static void largest(int marks[]){
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i] > l){
                l = marks[i];
            }
            if(marks[i] < s){
                s = marks[i];
            }
        }
        System.out.println("The largest number is: " + l);
        System.out.println("The smallest number is: " + s);
    }
    public static void main(String[] args) {
        int marks[] = {11, 56, 67, 55, 11, 33, 22};
        largest(marks);
    }
}
