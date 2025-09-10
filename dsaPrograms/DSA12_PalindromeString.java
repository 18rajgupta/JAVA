package dsaPrograms;
public class DSA12_PalindromeString {
    static boolean palindrome(String s, int i){
        int n = s.length();
        if(i >= n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;

        return palindrome(s, i+1);
    }

    public static void main(String[] args) {
        String s = "madaam";
        int n = s.length(); int i = 0;
        if(palindrome(s, i)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("IS Not Palindrome");
        }
    }
}
