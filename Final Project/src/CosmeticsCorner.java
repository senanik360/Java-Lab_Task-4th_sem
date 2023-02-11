
import java.util.Scanner;

public class CosmeticsCorner implements I_Products {

    Scanner input = new Scanner(System.in);
    static int cmprice = 0, k;
    Start obj;

    @Override
    public void product_list() {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t*** WelCome to Cosmetics Corner ***");
        System.out.println("\tPlease Select Type :-");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\n\t\t 1.Men.\n\t\t\t 2.Women.");
        System.out.println("\t\t\t\t\t\t[ Press Left Arrow(<) to Back Homepage.]");
        do {
            k = 0;
            String a = input.next();
            if (a.equals("1")) {
                System.out.println("  •   101.Shaving cream    320/-");
                System.out.println("  •   102.Shampoo          650/-");
                System.out.println("  •   103.Hair oil         290/-");
                System.out.println("  •   104.Facewash         700/-");
                System.out.println("  •   105.Moisturizer     1250/-");
                System.out.println("  •   106.Body spray       850/-");
                System.out.println("  •   107.Gel              550/-");
            } else if (a.equals("2")) {
                System.out.println("  •   201.Facewash         1250/-");
                System.out.println("  •   202.Face scrub        850/-");
                System.out.println("  •   203.Toner            1150/-");
                System.out.println("  •   204.Serum            1650/-");
                System.out.println("  •   205.Moisturizer      1450/-");
                System.out.println("  •   206.BB Cream          950/-");
                System.out.println("  •   207.Sun Defense       780/-");
                System.out.println("  •   208.Shampoo          1350/-");
                System.out.println("  •   209.Conditioner      1200/-");
                System.out.println("  •   210.Hair oil          290/-");
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
                cmprice += 320 * q;
                System.out.println("\tShaving cream    320/-\tQ - " + q);
            } else if (list.equals("102")) {
                int q = input.nextInt();
                cmprice += 650 * q;
                System.out.print("Quantity ---- ? ");
                System.out.println("\tShampoo          650/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tHair oil         290/-\tQ - " + q);
                cmprice += 290 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tFacewash         700/-\tQ - " + q);
                cmprice += 700 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMoisturizer     1250/-\tQ - " + q);
                cmprice += 1250 * q;
            } else if (list.equals("106")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBody spray       850/-\tQ - " + q);
                cmprice += 850 * q;
            } else if (list.equals("107")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tGel              550/-\tQ - " + q);
                cmprice += 550 * q;
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                cmprice += 1250 * q;
                System.out.println("\tFacewash         1250/-\tQ - " + q);
            } else if (list.equals("202")) {
                int q = input.nextInt();
                cmprice += 850 * q;
                System.out.print("Quantity ---- ? ");
                System.out.println("\tFace scrub        850/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tToner           1150/-\tQ - " + q);
                cmprice += 1150 * q;
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSerum            1650/-\tQ - " + q);
                cmprice += 1650 * q;
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMoisturizer      1450/-\tQ - " + q);
                cmprice += 1450 * q;
            } else if (list.equals("206")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBB Cream          950/-\tQ - " + q);
                cmprice += 950 * q;
            } else if (list.equals("207")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSun Defense       780/-\tQ - " + q);
                cmprice += 780 * q;
            } else if (list.equals("208")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tShampoo          1350/-\tQ - " + q);
                cmprice += 1350 * q;
            } else if (list.equals("209")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tConditioner      1200/-\tQ - " + q);
                cmprice += 1200 * q;
            } else if (list.equals("210")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tHair oil          290/-\tQ - " + q);
                cmprice += 290 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        System.out.println("\tTotal Price " + cmprice + " BDT");
        buymore();
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
            System.out.println("  Oky Sir. Your Total Price " + cmprice + " BDT");
        }
        System.out.println("|------------------------------------------------|");

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
                cmprice -= 320 * q;
                System.out.println("\tShaving cream    320/-\tQ - " + q);
            } else if (list.equals("102")) {
                int q = input.nextInt();
                cmprice -= 650 * q;
                System.out.print("Quantity ---- ? ");
                System.out.println("\tShampoo          650/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tHair oil         290/-\tQ - " + q);
                cmprice -= 290 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tFacewash         700/-\tQ - " + q);
                cmprice -= 700 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMoisturizer     1250/-\tQ - " + q);
                cmprice -= 1250 * q;
            } else if (list.equals("106")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBody spray       850/-\tQ - " + q);
                cmprice -= 850 * q;
            } else if (list.equals("107")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tGel              550/-\tQ - " + q);
                cmprice -= 550 * q;
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                cmprice -= 1250 * q;
                System.out.println("\tFacewash         1250/-\tQ - " + q);
            } else if (list.equals("202")) {
                int q = input.nextInt();
                cmprice -= 850 * q;
                System.out.print("Quantity ---- ? ");
                System.out.println("\tFace scrub        850/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tToner           1150/-\tQ - " + q);
                cmprice -= 1150 * q;
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSerum            1650/-\tQ - " + q);
                cmprice -= 1650 * q;
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMoisturizer      1450/-\tQ - " + q);
                cmprice -= 1450 * q;
            } else if (list.equals("206")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBB Cream          950/-\tQ - " + q);
                cmprice -= 950 * q;
            } else if (list.equals("207")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSun Defense       780/-\tQ - " + q);
                cmprice -= 780 * q;
            } else if (list.equals("208")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tShampoo          1350/-\tQ - " + q);
                cmprice -= 1350 * q;
            } else if (list.equals("209")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tConditioner      1200/-\tQ - " + q);
                cmprice -= 1200 * q;
            } else if (list.equals("210")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tHair oil          290/-\tQ - " + q);
                cmprice -= 290 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        if (cmprice >= 0) {
            System.out.println("\tTotal Price After Return Some Products " + cmprice + " BDT");
        } else {
            System.out.println("\tTotal Price After Return Some Products " + 0 + " BDT");
        }
    }

    void cosmeticfinal() {
        product_list();
        addProduct();
    }
}
