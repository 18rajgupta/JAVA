package Emersion;

public class strrev {
    public static void main(String[] args) {
        // By normal for loop
        // String str = "Hello";
        // String reversed = "";

        // for(int i=str.length()-1; i>=0; i--){
        //     reversed = reversed + str.charAt(i);
        // }

        // System.out.println("REversed String: " + reversed);


        // By StringBuilder
        // String str = "Hello";
        // StringBuilder s = new StringBuilder(str);
        // s.reverse();
        // System.out.println(s.toString());


        // By StringBuffer
        String str = "Hello";
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s.toString());
    }
}
