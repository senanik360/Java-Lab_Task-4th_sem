
import java.util.Scanner;

public class BabyCorner implements I_Products {

    Scanner input = new Scanner(System.in);
    static int bbprice = 0, k;

    @Override
    public void product_list() {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t*** WelCome to Baby Corner ***");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("  •   101.Baby lotion  650/-");
        System.out.println("  •   102.Baby oil for massage   480/-");
        System.out.println("  •   103.Baby Wipe 600/-");
        System.out.println("  •   104.Baby shampoo  460/-");
        System.out.println("  •   105.Diapers  1200/-");
    }

    @Override
    public void addProduct() {
        System.out.println("|------------------------------------------------|");
        System.out.println("Please Enter products code for select.");
        System.out.println("\tAfter selecting products press ' = ' sign.");
        System.out.println("|------------------------------------------------|");
        do {
            k = 0;
            String list = input.next();
            if (list.equals("101")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                bbprice += 650 * q;
                System.out.println("\tBaby lotion 650/-\tQ - " + q);
            } else if (list.equals("102")) {
                bbprice += 480;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby oil for massage   480/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby Wipe 600/-\tQ - " + q);
                bbprice += 600 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby shampoo  460/-\tQ - " + q);
                bbprice += 460 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tDiapers  1200/-\tQ - " + q);
                bbprice += 1200 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        System.out.println("\tTotal Price " + bbprice + " BDT");
        buymore();
    }

    @Override
    public void returnProduct() {
        System.out.println("|------------------------------------------------|");

        System.out.println("\tSelect to return products");
        System.out.println("\tAfter returing products press ' = ' sign.");
        System.out.println("|------------------------------------------------|");

        do {
            k = 0;
            String list = input.next();
            if (list.equals("101")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                bbprice += 650 * q;
                System.out.println("\tBaby lotion 650/-\tQ - " + q);
            } else if (list.equals("102")) {
                bbprice += 480;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby oil for massage   480/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby Wipe 600/-\tQ - " + q);
                bbprice += 600 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBaby shampoo  460/-\tQ - " + q);
                bbprice += 460 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tDiapers  1200/-\tQ - " + q);
                bbprice += 1200 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        if (bbprice >= 0) {
            System.out.println("\tTotal Price After Return Some Products " + bbprice + " BDT");
        } else {
            System.out.println("\tTotal Price After Return Some Products " + 0 + " BDT");
        }
    }

    @Override
    public void buymore() {
        System.out.println("|------------------------------------------------|");
        System.out.println("    Do You Want to Buy More ?\n \t\t1.Yes  -|-   2.No");
        String more = input.next();
        if (more.equals("1")) {
            addProduct();
        } else if (more.equals("2")) {
            System.out.println("   Oky Sir.! ");
        }
        System.out.println("|------------------------------------------------|");
        System.out.println("|------------------------------------------------|");
        System.out.println("    Do You Want to Return Any Product ?\n\t\t1.Yes  -|-   2.No");
        String re = input.next();
        if (re.equals("1")) {
            returnProduct();
        } else if (re.equals("2")) {
            Calculation cal = new Calculation();
            System.out.println("  Oky Sir. Your Total Price " + cal.calculation() + " BDT");
        }
        System.out.println("|------------------------------------------------|");

    }

    void bbfinal() {
        product_list();
        addProduct();
    }
}
