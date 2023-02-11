
import java.util.Scanner;

public class ShopDetails extends Details {

    Start obj;

    public void shopDetails1() {
        System.out.println("\t||||  We're glad to see your curiosity about our shop   ||||");
        System.out.println("What do you want to know about us ? ");
        System.out.println("\t• 1.Shop Rating. \n\t\t • 2.Manager Details. \n \t\t\t• 3.SalesMen Details. \n\t• 4.Product Import Details.\n\t\t• 5.Location.");
        Scanner input = new Scanner(System.in);
        int f, k;
        String Lr = "<";
        String Rr = ">";
        do {
            f = 0;
            int n = input.nextInt();
            if (n == 1) {
                System.out.println("Its a Well Rated Super Shop.Overall Rating Of This Shop Is 4 out of The Scale of 5. \n");
            } else if (n == 2) {
                super.managerDetails();
            } else if (n == 3) {
                super.salesmenDetails();
            } else if (n == 4) {
                super.importDetails();
            } else if (n == 5) {
                super.locationDetails();
            } else {
                f = 1;
                System.out.println("Invalid Input. Try again");
            }
        } while (f == 1);
        System.out.println("To Back Homepage to Press Left Arrow(<) /  Exit to Press Right Arrow(>) ");
        do {
            k = 0;
            String m = input.next();
            if (Lr.equals(m)) {

                if (obj == null) {
                    obj = new Start();
                }
                obj.start1();
            } else if (Rr.equals(m)) {
                Calculation cal = new Calculation();
                cal.discount();
                System.out.println("\t\t ---   Thank You for Visiting Our Shop !   ---");
            } else {
                k = 1;
                System.out.println("Invalid Input. Try again");
            }
        } while (k == 1);

    }
}
