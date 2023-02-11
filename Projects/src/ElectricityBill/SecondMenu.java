/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package mainpackage;
//import mainpackage.admincustomerpackage.*;
//import mainpackage.admincustomerpackage.methodpackage.*;
import java.util.Scanner;
import java.lang.*;

public class SecondMenu {

    public int nn;
    AdminMenu menuB = new AdminMenu();
    CustomerMenu menuC = new CustomerMenu();

    public void ELectricityMenu() {
        do {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.print("~~   ELECTRICITY BILLING SYSTEM   ~~\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.print("          ~~  Menu Bar  ~~   \n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.print("      1 Admin Panel\n");
            System.out.print("      2 Customer Panel\n");
            System.out.print("      3 Exit\n\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.print("      Enter your option : ");
            Scanner in = new Scanner(System.in);
            nn = in.nextInt();
            if (nn == 1) {
                System.out.println("  Entering in Admin panel....");
                menuB.AdminReg();
            } else if (nn == 2) {
                System.out.println("  Entering in Customer panel....");
                menuC.CustomerReg();
            } else if (nn == 3) {
                System.out.println("  Exiting from system...");
            } else {
                System.out.println("  Invalid input!");
                System.out.println("  Please enter again");
            }
        } while (nn <= 3);
        System.out.println(" Thank You for Using Our System");
    }
}
