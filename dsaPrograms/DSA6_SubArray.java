package dsaPrograms;
public class DSA6_SubArray {
    static void subArray(int number[]){     //BRUTE FORCE(TIME COMPLEXITY = O(n^3) )
        int ts = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;

        for(int i=0; i< number.length; i++){
            for(int j=i; j<number.length; j++){
                int current_sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(number[k] + " ");
                    current_sum += number[k];
                }
                System.out.println();
                System.out.println("The cuurent sum is: " + current_sum);
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
                if(current_sum < min_sum){
                    min_sum = current_sum;
                }
                ts++;
            }
            System.out.println();
        }

        System.out.println("Total subarrays are: " + ts);
        System.out.println("The maximum sum is: " + max_sum);
        System.out.println("The minimum sum is: " + min_sum);
    }
    static void prefixSum(int numbers[]){            //PREFIX_SUM(TIME COMPLEXITY = O(n^2) )
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        int prefix[] = new int[numbers.length];

        //CALCULATE PREFIX ARRAY...
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                current_sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("The maximum subarray sum is: " + max_sum);
    }
    static void kadans(int numbers[]){           // KADAN'S ALGORITHM(TIME COMPLEXITY = O(n) )
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i< numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our maximum subarray sum is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        subArray(numbers);
//        prefixSum(numbers);
//        kadans(numbers);
    }
}
