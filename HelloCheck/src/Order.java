
import java.util.Scanner;

public class Order {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = in.nextInt();
        System.out.print("Enter the second number: ");
        int y = in.nextInt();
        System.out.print("Enter the third number : ");
        int z = in.nextInt();
        System.out.print("The result is : " + test(x, y, z));
        System.out.print("\n");
    }

    public static boolean test(int p, int q, int r) {
        if (q > p && r > q) {
            return true;
        } else {
            return false;
        }
    }
}
