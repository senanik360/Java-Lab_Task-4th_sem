import java.util.*;

public class StringLab{

 

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st String: ");
        String s1= sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String s2= sc.nextLine();
        String s3= s1.concat(s2);
        System.out.println(s3);
        
        String s4=s3.substring(6,11);
        System.out.println(s4);
        
        System.out.println("S1 = s2 is true or false : "+s1.equals(s2));
        System.out.println(s3.toUpperCase());
        System.out.println("Character at index No.5 : "+s3.charAt(5));
        System.out.println("index no. of 'l' in s2 :");
        int pos= s2.indexOf('l');
        System.out.println(pos);
    }
}