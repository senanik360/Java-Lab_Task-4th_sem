
import java.util.Scanner;

public class Choice extends Calculation {

    Scanner input = new Scanner(System.in);
    Start obj;
    int k, m;
    FoodCorner f;
    ClothsCorner ct;
    CosmeticsCorner cm;
    BabyCorner bb;

    public void choice1() {
        System.out.println("-------------");
        System.out.println(" 1.Food Corner");
        System.out.println("-------------");
        System.out.println("\t 2.Cloths Corner");
        System.out.println(" \t-----------------");
        System.out.println("\t\t 3.Cosmetics Corner Corner");
        System.out.println(" \t\t ------------------------");
        System.out.println("\t\t\t 4.Baby Corner");
        System.out.println(" \t\t\t ------------------------");
        System.out.println("\t\t\t\t\t\t[ Press Left Arrow(<) to Back Homepage.]");
        do {
            k = 0;

            String n = input.nextLine();
            if (n.equals("1")) {
                if (f == null) {
                    f = new FoodCorner();
                }
                f.foodfinal();
                super.calculation();
            } else if (n.equals("2")) {
                if (ct == null) {
                    ct = new ClothsCorner();
                }
                ct.ctfinal();
                super.calculation();
            } else if (n.equals("3")) {
                if (cm == null) {
                    cm = new CosmeticsCorner();
                }
                cm.cosmeticfinal();
                super.calculation();
            } else if (n.equals("4")) {
                if (bb == null) {
                    bb = new BabyCorner();
                }
                bb.bbfinal();
                super.calculation();
            } else if (n.equals("<")) {
                if (obj == null) {
                    obj = new Start();
                }
                obj.start1();
            } else {
                System.out.println(" :- Invalid Input. Try again");
                k = 1;
            }
        } while (k == 1);

        System.out.println("To Back Homepage to Press Left Arrow(<) /  Exit to Press Right Arrow(>) ");
        do {
            k = 0;
            String m = input.next();
            if ("<".equals(m)) {
                if (obj == null) {
                    obj = new Start();
                }
                obj.start1();
            } else if (">".equals(m)) {
                super.discount();
                System.out.println("\t\t ---   Thank You for Visiting Our Shop !   ---");
            } else {
                k = 1;
                System.out.println(" :- Invalid Input. Try again");
            }
        } while (k == 1);

    }

}
