
import java.util.Scanner;

public class Calculation {

    double finalPrice = 0;
    final int card = 360360;
    int k;

    double calculation() {
        FoodCorner f = new FoodCorner();
        ClothsCorner ct = new ClothsCorner();
        BabyCorner bb = new BabyCorner();
        CosmeticsCorner cm = new CosmeticsCorner();
        finalPrice = f.fprice + ct.ctprice + cm.cmprice + bb.bbprice;
        return finalPrice;
    }

    public void discount() {
        if (calculation() > 0) {
            membership();
            parcel();
        }
        if (finalPrice >= 1000) {
            finalPrice *= .90;
            System.out.println("• You got 10% Discount on Your Total Price ");
            System.out.println("• You should pay " + finalPrice + " BDT.");
        }
        if (finalPrice >= 1500 && finalPrice <= 1499) {
            finalPrice *= .85;
            System.out.println("• You got 15% Discount on Your Total Price ");
            System.out.println("• You should pay " + finalPrice + " BDT.");
        }
        if (finalPrice >= 2000 && finalPrice <= 1500) {
            finalPrice *= .80;
            System.out.println("• You got 20% Discount on Your Total Price ");
            System.out.println("• You should pay " + finalPrice + " BDT.");
        } else if (finalPrice >= 3000 && finalPrice <= 2000) {
            finalPrice *= .70;
            System.out.println("• You got 30% Discount on Your Total Price ");
            System.out.println("• You should pay " + finalPrice + " BDT.");
        }
    }

    public void parcel() {
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.print(" --> Please Enter Your Location for Parcel Your Product : ");
        Scanner input = new Scanner(System.in);
        String location = input.nextLine();
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.println("\t• • We will send your products  to " + location + " • •");
        System.out.println(" Your Total price " + (calculation() + 50) + " BDT ( + service charge 50/- )");

    }

    public void membership() {
        System.out.println("|------------------------------------------------|");
        System.out.println(" Do You Have Any Membership Card ? \n\t\t 1.Yes  -|-  2.No ");
        do {
            Scanner input = new Scanner(System.in);
            String c = input.next();
            int k = 0;
            if (c.equals("1")) {
                System.out.print("Please Enter your Card No. : ");
                String no = input.next();
                if (no.equals("360360")) {
                    System.out.println("• • Two Extra Star Point Added to Your Account. • • ");
                } else {
                    System.out.println("Sorry Sir. Your Card No. is not Valid.");
                }

            } else if (c.equals("2")) {
            } else {
                k = 1;
                System.out.println("Invalid Input. Try Again Please.");
            }
        } while (k == 1);
        System.out.println("|------------------------------------------------|");

    }
}
