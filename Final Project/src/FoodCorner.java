
import java.util.Scanner;

public class FoodCorner implements I_Products {

    Scanner input = new Scanner(System.in);
    static int fprice = 0, k;
    Start obj;

    @Override
    public void product_list() {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t*** WelCome to Food Corner ***");
        System.out.println("  Please Select Any Option.");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("\t\t-- 1.Fruits.\n\t-- 2.Vegetables.\n\t\t\t-- 3.Meat. \n\t\t-- 4.Fish.\n\t-- 5.Breads,Biscuits,Cake & Chocolates.\n\t\t\t-- 6.Snaks.\n\t\t-- 7.Drinks.");
        System.out.println("\t\t\t\t\t\t[ Press Left Arrow(<) to Back Homepage.]");
        do {
            k = 0;
            String s = input.next();
            if (s.equals("1")) {
                System.out.println("  •   101. Apple   120/-");
                System.out.println("  •   102. Watermelon   80/-");
                System.out.println("  •   103. Orrange  100/-");
                System.out.println("  •   104. Banana   40/-");
                System.out.println("  •   105. Papaya   60/-");
                System.out.println("  •   106. Jackfruit  40/-");
                System.out.println("  •   107. Mango  140/-");
            } else if (s.equals("2")) {
                System.out.println("  •   201. Carrot  60/-");
                System.out.println("  •   202. Onion  100/-");
                System.out.println("  •   203. Tomato  60/-");
                System.out.println("  •   204. Pumpkin  40/-");
                System.out.println("  •   205. Chili  30/-");
                System.out.println("  •   206. Garlic  40/-");
                System.out.println("  •   207. Potato   45/-");
            } else if (s.equals("3")) {
                System.out.println("  •   301. Chicken   150/-");
                System.out.println("  •   302. Mutton   280/-");
                System.out.println("  •   303. Beef   300/-");
            } else if (s.equals("4")) {
                System.out.println("  •   401. Ilish   600/-");
                System.out.println("  •   402. Boal   400/-");
                System.out.println("  •   403. Katle  280/-");
            } else if (s.equals("5")) {
                System.out.println("  •   501.Breads          120/-");
                System.out.println("  •   502.Biscuits        170/-");
                System.out.println("  •   503.Cake            350/-");
                System.out.println("  •   504.Pastries        650/-");
                System.out.println("  •   505.Cookies         260/-");
                System.out.println("  •   506.Dark chocolate  450/-");
            } else if (s.equals("6")) {
                System.out.println("  •   601.Soups           65/-");
                System.out.println("  •   602.Chips          199/-");
                System.out.println("  •   603.Nut            200/-");
                System.out.println("  •   604.Pastas         340/-");
                System.out.println("  •   605.Canned foods   560/-");
                System.out.println("  •   606.Noodles        280/-");
            } else if (s.equals("7")) {
                System.out.println("  •   701.Tea                40/-");
                System.out.println("  •   702.Coffee             80/-");
                System.out.println("  •   703.Soft Drinks       120/-");
                System.out.println("  •   704.Powdered Drinks   280/-");
                System.out.println("  •   705.Juices            190/-");
            } else if (s.equals("<")) {       
                if (obj == null) {
                    obj = new Start();
                }
                obj.start1();
            } else {
                k = 1;
                System.out.println("Invalid Input! Try Again Please.");
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
                fprice += 120 * q;
                System.out.println("\tApple   120/-\tQ - " + q);
            } else if (list.equals("102")) {
                fprice += 80;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tWatermelon   80/-\tQ - " + q);
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tOrrange  100/-\tQ - " + q);
                fprice += 100 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBanana   40/-\tQ - " + q);
                fprice += 40 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPapaya   60/-\tQ - " + q);
                fprice += 60 * q;
            } else if (list.equals("106")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tJackfruit  40/-\tQ - " + q);
                fprice += 40 * q;
            } else if (list.equals("107")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMango  140/-\tQ - " + q);
                fprice += 140 * q;
            } else if (list.equals("107")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMango  140/-\tQ - " + q);
                fprice += 140 * q;
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice += 60 * q;
                System.out.println("\tCarrot  60/-\tQ - " + q);
            } else if (list.equals("202")) {
                fprice += 100;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tOnion  100/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tTomato  60/-\tQ - " + q);
                fprice += 60 * q;
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPumpkin  40/-\tQ - " + q);
                fprice += 40 * q;
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tChili  30/-\tQ - " + q);
                fprice += 30 * q;
            } else if (list.equals("206")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tGarlic  40/-\tQ - " + q);
                fprice += 40 * q;
            } else if (list.equals("207")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPotato   45/-\tQ - " + q);
                fprice += 45 * q;
            } else if (list.equals("301")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice += 150 * q;
                System.out.println("\tChicken   150/-\tQ - " + q);
            } else if (list.equals("302")) {
                fprice += 280;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMutton   280/-\tQ - " + q);
            } else if (list.equals("303")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBeef   300/-\tQ - " + q);
                fprice += 300 * q;
            } else if (list.equals("401")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tIlish   600/-\tQ - " + q);
                fprice += 600 * q;
            } else if (list.equals("402")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBoal   400/-\tQ - " + q);
                fprice += 400 * q;
            } else if (list.equals("403")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tKatle  280/-\tQ - " + q);
                fprice += 280 * q;
            } else if (list.equals("501")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBreads     120/-\tQ - " + q);
                fprice += 120 * q;
            } else if (list.equals("502")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice += 170 * q;
                System.out.println("\tBiscuits     170/-\tQ - " + q);
            } else if (list.equals("503")) {
                fprice += 350;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCake       350/-\tQ - " + q);
            } else if (list.equals("504")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPastries      650/-\tQ - " + q);
                fprice += 650 * q;
            } else if (list.equals("505")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCookies      260/-\tQ - " + q);
                fprice += 260 * q;
            } else if (list.equals("506")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tDark chocolate  450/-\tQ - " + q);
                fprice += 450 * q;
            } else if (list.equals("601")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSoups      65/-\tQ - " + q);
                fprice += 65 * q;
            } else if (list.equals("602")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice += 199 * q;
                System.out.println("\tChips     199/-\tQ - " + q);
            } else if (list.equals("603")) {
                fprice += 200;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tNut     200/-\tQ - " + q);
            } else if (list.equals("604")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPastas     340/-\tQ - " + q);
                fprice += 340 * q;
            } else if (list.equals("605")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCanned foods   560/-\tQ - " + q);
                fprice += 560 * q;
            } else if (list.equals("606")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tNoodles        280/-\tQ - " + q);
                fprice += 280 * q;
            } else if (list.equals("701")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tTea          40/-\tQ - " + q);
                fprice += 40 * q;
            } else if (list.equals("702")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCoffee       80/-\tQ - " + q);
                fprice += 80 * q;
            } else if (list.equals("703")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice += 120 * q;
                System.out.println("\tSoft Drinks      120/-\tQ - " + q);
            } else if (list.equals("704")) {
                fprice += 280;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPowdered Drinks   280/-\tQ - " + q);
            } else if (list.equals("705")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tJuices            190/-\tQ - " + q);
                fprice += 190 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        System.out.println("\tTotal Price " + fprice + " BDT");
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
                System.out.println("\tApple   120/-\tQ - " + q);
                fprice -= 120 * q;
            } else if (list.equals("102")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tWatermelon   80/-\tQ - " + q);
                fprice -= 80 * q;
            } else if (list.equals("103")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tOrrange  100/-\tQ - " + q);
                fprice -= 100 * q;
            } else if (list.equals("104")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBanana   40/-\tQ - " + q);
                fprice -= 40 * q;
            } else if (list.equals("105")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPapaya   60/-\tQ - " + q);
                fprice -= 60 * q;
            } else if (list.equals("106")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tJackfruit  40/-\tQ - " + q);
                fprice -= 40 * q;
            } else if (list.equals("107")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMango  140/-\tQ - " + q);
                fprice -= 140 * q;
            } else if (list.equals("201")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice -= 60 * q;
                System.out.println("\tCarrot  60/-\tQ - " + q);
            } else if (list.equals("202")) {
                fprice -= 100;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tOnion  100/-\tQ - " + q);
            } else if (list.equals("203")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tTomato  60/-\tQ - " + q);
                fprice -= 60 * q;
            } else if (list.equals("204")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPumpkin  40/-\tQ - " + q);
                fprice -= 40 * q;
            } else if (list.equals("205")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tChili  30/-\tQ - " + q);
                fprice -= 30 * q;
            } else if (list.equals("206")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tGarlic  40/-\tQ - " + q);
                fprice -= 40 * q;
            } else if (list.equals("207")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPotato   45/-\tQ - " + q);
                fprice -= 45 * q;
            } else if (list.equals("301")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice -= 150 * q;
                System.out.println("\tChicken   150/-\tQ - " + q);
            } else if (list.equals("302")) {
                fprice -= 280;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tMutton   280/-\tQ - " + q);
            } else if (list.equals("303")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBeef   300/-\tQ - " + q);
                fprice -= 300 * q;
            } else if (list.equals("401")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tIlish   600/-\tQ - " + q);
                fprice -= 600 * q;
            } else if (list.equals("402")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBoal   400/-\tQ - " + q);
                fprice -= 400 * q;
            } else if (list.equals("403")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tKatle  280/-\tQ - " + q);
                fprice -= 280 * q;
            } else if (list.equals("501")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tBreads     120/-\tQ - " + q);
                fprice -= 120 * q;
            } else if (list.equals("502")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice -= 170 * q;
                System.out.println("\tBiscuits      170/-\tQ - " + q);
            } else if (list.equals("503")) {
                fprice -= 350;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCake      350/-\tQ - " + q);
            } else if (list.equals("504")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPastries        650/-\tQ - " + q);
                fprice -= 650 * q;
            } else if (list.equals("505")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCookies      260/-\tQ - " + q);
                fprice -= 260 * q;
            } else if (list.equals("506")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tDark chocolate    450/-\tQ - " + q);
                fprice -= 450 * q;
            } else if (list.equals("601")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tSoups        65/-\tQ - " + q);
                fprice -= 65 * q;
            } else if (list.equals("602")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice -= 199 * q;
                System.out.println("\tChips       199/-\tQ - " + q);
            } else if (list.equals("603")) {
                fprice -= 200;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tNut        200/-\tQ - " + q);
            } else if (list.equals("604")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPastas       340/-\tQ - " + q);
                fprice -= 340 * q;
            } else if (list.equals("605")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCanned foods   560/-\tQ - " + q);
                fprice -= 560 * q;
            } else if (list.equals("606")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tNoodles       280/-\tQ - " + q);
                fprice -= 280 * q;
            } else if (list.equals("701")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tTea        40/-\tQ - " + q);
                fprice -= 40 * q;
            } else if (list.equals("702")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tCoffee         80/-\tQ - " + q);
                fprice -= 80 * q;
            } else if (list.equals("703")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                fprice -= 120 * q;
                System.out.println("\tSoft Drinks      120/-\tQ - " + q);
            } else if (list.equals("704")) {
                fprice -= 280;
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tPowdered Drinks   280/-\tQ - " + q);
            } else if (list.equals("705")) {
                System.out.print("Quantity ---- ? ");
                int q = input.nextInt();
                System.out.println("\tJuices       190/-\tQ - " + q);
                fprice -= 190 * q;
            } else if (list.equals("=")) {
                k = 1;
            } else {
                System.out.println("Invalid Product Code! Please try Again Sir.");
            }
        } while (k != 1);
        if (fprice >= 0) {
            System.out.println("\tTotal Price After Return Some Products " + fprice + " BDT");
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

    void foodfinal() {
        product_list();
        addProduct();
    }
}
