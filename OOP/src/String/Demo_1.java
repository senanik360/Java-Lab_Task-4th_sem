package String;
import java.util.Arrays;
public class Demo_1 {

    public static void main(String[] args) {
        String name = "Anik ";
        String name_1 = "Anik ";
        String title = new String("Sen");

        char[] city = {'S', 'R', 'I', 'M', 'A', 'N', 'G', 'O', 'L'};

        System.out.println("Name : " + name + "\tTitle : " + title + "\tCity : " + city);

        int len = name.length();
        System.out.println("Length of Name is : " + len);

        if (name.equals(name_1)) {
            System.out.println("name equals name_1");
        } else {
            System.out.println("Not Equals.");
        }

        String msg = "Hello";
        String msg_1 = "hello";
        if (msg.equalsIgnoreCase(msg_1)) {           //this method use for ignore upper case - lower case 
            System.out.println("msg equals msg_1");
        } else {
            System.out.println("Not Equals.");
        }

        boolean bool = name.contains("Anik");
        System.out.println(bool);

        String E = "";
        boolean c = E.isEmpty();
        System.out.println("E is empty : " + c);

        String D = "abc";
        boolean a = D.isEmpty();
        System.out.println("D is empty : " + a);
        
        
        /*if (name.contains(name_1)){               //  We can also use contains method instead of equals
            System.out.println("name equals name_1");
        }
        else{
            System.out.println("Not Equals.");
        }*/
    }

}
