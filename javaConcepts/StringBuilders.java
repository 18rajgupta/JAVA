package javaConcepts;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//        // CHAR AT INDEX 0
//        System.out.println(sb.charAt(0));
//
//        // SET CHAR AT INDEX 0
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);
//
//        // INSERT CHAR AT A INDEX
//        sb.insert(2, 'n');
//        System.out.println(sb);
//
//        // DELETE THE EXTRA 'n'
//        sb.delete(2, 4);
//        System.out.println(sb);
//
//        // TO APPEND AT THE END
//        sb.append("njdjd");
//        System.out.println(sb);
//
//        System.out.println(sb.length());

        // REVERSE AN STRING USING STRINGBUILDER...
        StringBuilder s = new StringBuilder("hello");
        for(int i=0; i<s.length()/2; i++){
            int front = i;
            int back = s.length() - 1 - i;

            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }

        System.out.println(s);
    }
}
