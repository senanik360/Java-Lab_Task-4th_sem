
import java.util.Scanner;

public class ClothsCorner implements I_Products {

    Scanner input = new Scanner(System.in);
    Start obj;
    static int ctprice = 0, k;

    @Override
    public void product_list() {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t*** WelCome to Cloths Corner ***");
        System.out.println("\tPlease Select Type :- ");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println(" \t 1.Local.\n\t \t 2.Importate.");

        System.out.println("\t\t\t\t\t\t[ Press Left Arrow(<) to Back Homepage.]");
        do {
            k = 0;
            String a = input.next();
            if (a.equals("1")) {
                System.out.println("  •   101.T-Shirt.  800/-");
                System.out.println("  •   102.Pants.    650/-");
                System.out.println("  •   103.Panjabi. 1200/-");
                System.out.println("  •   104.Payjama.  450/-");
                System.out.println("  •   105.Jacket.  1600/-");
            } else if (a.equals("2")) {
                System.out.println("  •   201.T-Shirt.  1400/-");
                System.out.println("  •   202.Pants.    1100/-");
                System.out.println("  •   203.Panjabi.  1800/-");
                System.out.println("  •   204.Payjama.   850/-");
                System.out.println("  •   205.Jacket.   2450/-");
            } else if (a.equals("<")) {
                if (obj == null) {
                    obj = new Start();
                }
                obj.start1();
            } else {
                k = 1;
                System.out.println("Invalid ! Try Again Please.");
            }
        } while (k == 1);

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
                ctprice += 800 * q;
                System.out.println("\tT-Shirt.  800/-\tQ - " + q);
            } else if (list.equals("102")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 650 * q;
                System.out.println("\tPants.    650/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 1200 * q;
                System.out.println("\tPanjabi. 1200/-\tQ - " + q);
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 450 * q;
                System.out.println("\tPayjama.  450/-\tQ - " + q);
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 1600 * q;
                System.out.println("\tJacket.  1600/-\tQ - " + q);
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 1400 * q;
                System.out.println("\tT-Shirt.  1400/-\tQ - " + q);
            } else if (list.equals("202")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 1100 * q;
                System.out.println("\tPants.    1100/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 1800 * q;
                System.out.println("\tPanjabi. 1800/-\tQ - " + q);
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 850 * q;
                System.out.println("\tPayjama.  850/-\tQ - " + q);
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice += 2450 * q;
                System.out.println("\tJacket.  2450/-\tQ - " + q);
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        System.out.println("\tTotal Price " + ctprice + " BDT");
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
                System.out.println("\tT-Shirt.  800/-\tQ - " + q);
                ctprice -= 800 * q;
            }
            if (list.equals("101")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 800 * q;
                System.out.println("\tT-Shirt.  800/-\tQ - " + q);
            } else if (list.equals("102")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 650 * q;
                System.out.println("\tPants.    650/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 1200 * q;
                System.out.println("\tPanjabi. 1200/-\tQ - " + q);
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 450 * q;
                System.out.println("\tPayjama.  450/-\tQ - " + q);
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 1600 * q;
                System.out.println("\tJacket.  1600/-\tQ - " + q);
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 1400 * q;
                System.out.println("\tT-Shirt.  1400/-\tQ - " + q);
            } else if (list.equals("202")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 1100 * q;
                System.out.println("\tPants.    1100/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 1800 * q;
                System.out.println("\tPanjabi. 1800/-\tQ - " + q);
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 850 * q;
                System.out.println("\tPayjama.  850/-\tQ - " + q);
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                ctprice -= 2450 * q;
                System.out.println("\tJacket.  2450/-\tQ - " + q);
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        if (ctprice >= 0) {
            System.out.println("\tTotal Price After Return Some Products " + ctprice + " BDT");
        } else {
            System.out.println("\tTotal Price After Return Some Products " + 0 + " BDT");
        }
    }

    @Override
    public void buymore() {
        System.out.println("|------------------------------------------------|");

        System.out.println("   Do You Want to Buy More ?\n \t\t1.Yes  -|-   2.No");
        String more = input.next();
        if (more.equals("1")) {
            addProduct();
        } else if (more.equals("2")) {
            System.out.println("   Oky Sir.! ");
        }
        System.out.println("|------------------------------------------------|");
        System.out.println("|------------------------------------------------|");

        System.out.println("   Do You Want to Return Any Product ?\n\t\t1.Yes  -|-   2.No");
        String re = input.next();
        if (re.equals("1")) {
            returnProduct();
        } else if (re.equals("2")) {
            Calculation cal = new Calculation();
            System.out.println("  Oky Sir. Your Total Price " + cal.calculation() + " BDT");
        }
        System.out.println("|------------------------------------------------|");

    }

    public void ctfinal() {
        product_list();
        addProduct();
    }
}
