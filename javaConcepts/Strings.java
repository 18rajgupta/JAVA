package javaConcepts;

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String name = new String("Raj Gupta");
//        System.out.print("The name is:");
//        System.out.println(name);
//        int a = 6;
//        float b = 5.7454f;
//        System.out.printf("The value of a is %5d and value of b is %8.2f\n",a,b);
//        System.out.format("The value of a is %d and value of b is %f\n",a,b);
//
        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);

//STRING METHODS....
//        int value = name.length();
//        System.out.println(value);
//
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "    Raj     ";
//        System.out.println(nonTrimmedString);
//        String TrimmedString = nonTrimmedString.trim();
//        System.out.println(TrimmedString);
//
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,8));
//
//        System.out.println(name.replace('a' , 'o'));
//        System.out.println(name.replace("a" , "aa"));
//
//        System.out.println(name.startsWith("ra"));
//        System.out.println(name.startsWith("Ra"));
//        System.out.println(name.endsWith("ta"));
//        System.out.println(name.endsWith("taaa"));
//
//        System.out.println(name.charAt(2));
//
//        System.out.println(name.indexOf("aj"));
//        System.out.println(name.indexOf("a" , 4));
//
//        System.out.println(name.lastIndexOf("a"));
//        System.out.println(name.lastIndexOf("a" , 4));
//
//        System.out.println(name.equals("Raj Gupta"));
//
//        System.out.println(name.equalsIgnoreCase("raj GupTa"));

//WRITE A JAVA PROGRAM TO REPLACE SPACES WITH UNDERSCORES....
        String space = "Sajal Gupta ";
        System.out.println(space.replace(' ' , '_'));

//WRITE A JAVA PROGRAM TO FILL IN A LETTER TEMPLATE WHICH LOOKS LIKE BELOW....
        String Name = sc.next();
        System.out.printf("Dear %s, Thanks a Lot\n", Name);

//WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING.....
        String mystring = "The Double  and Triple   spaces are present in the string";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

    }
}
