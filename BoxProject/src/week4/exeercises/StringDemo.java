package week4.exeercises;

public class StringDemo {

    void stringDemo() {
        String s1 = "Hello";
        String s2 = "      hello    ";
        char ch = s1.charAt(0);//returns the char value at the 4th index  
        System.out.println("character at index 0 is :" + ch);
        System.out.println("Result of two string comparision " + s1.compareTo(s2));
        String s1upper = s1.toUpperCase();
        System.out.println("upper case value of s1  : " + s1upper);
        System.out.println("length of s1 :" + s1.length());
        System.out.println("s1 equals to s2 :" + s1.equals(s2));
        System.out.println("Result of two string comparision ignoring case :" + s1.compareToIgnoreCase(s2));
        System.out.println("code point of index 4 is :" + s1.codePointAt(4));
    }

}
