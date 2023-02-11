
import java.util.Date;
import java.util.Scanner;

public class Start extends SignUpIn {

    Choice ch = new Choice();
    ShopDetails shop = new ShopDetails();
    int f, k;
    
       public void datetime() {
        Date date = new Date();
        System.out.println("\t\t\t\t\t\t[ "+date+" ]");
    }

    void start0() {
        entry();
        welcomeAgain();
    }

    void start1() {
        System.out.println("1.Products   -| |-   2.About Shop");
        do {
            f = 0;
            try {
                Scanner input = new Scanner(System.in);
                k = 0;
                int n = input.nextInt();
                if (n == 1) {
                    if (ch == null) {
                        ch = new Choice();
                    }
                    ch.choice1();
                } else if (n == 2) {
                    if (shop == null) {
                        shop = new ShopDetails();
                    }
                    shop.shopDetails1();
                } else {
                    f = 1;
                    System.out.println("Invalid Input. Try again");
                }
            } catch (Exception e) {
                k = 1;
                System.out.println("Exception : " + e);
            } finally {
                if (k == 1) {
                    System.out.println("Invalid Input. Try again");
                }
            }
        } while (f == 1 || k == 1);
    }

}
