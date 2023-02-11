/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

import java.util.Scanner;
import java.lang.*;

public class AdminMenu extends SecondMenu {

    public int yy;
    public int cg;
    public int ch;

    public void AdminReg() {
        Runtime.getRuntime().exec("cls");
        Scanner ED = new Scanner(System.in);
        System.out.println("        ||||<<   WELLCOME TO LOG IN MENU   >>||||");
        System.out.println("        ||                                     ||");
        System.out.println("        ||     1 LOG IN                      ||");
        System.out.println("        ||       2 SIGN UP                     ||");
        System.out.println("        ||     3 FORGOT PASSWORD/EMAil       ||");
        System.out.println("        ||     4 EXIT                        ||");
        System.out.println("        ||                                     ||");
        System.out.println();
        System.out.print("               Enter Your Choice: ");
        do {
            cg = ED.nextInt();
            switch (cg) {
                case 1:
                    System.out.println("       Going To Log In Menu ....");
                    LOGIN L1 = new LOGIN();
                    L1.AdminLogIN();
                    break;
                case 2:
                    System.out.println("       Going To Sign Up Menu ....");
                    SIGNUP S1 = new SIGNUP();
                    S1.AdminSignUP();
                    break;
                case 3:
                    System.out.println("       Forgot Password ?");
                    System.out.println("       Here is a way to recover your Password ....");
                    FORGOT F1 = new FORGOT();
                    F1.AdminForgot();
                    break;
                case 4:
                    System.out.println("       Going To Main Menu ....");
                    SecondMenu SM = new SecondMenu();
                    super.ElectricityMenu();
                    break;
                default:
                    System.out.println("       Entered wrong choice!");
                    System.out.println("      Please enter again");
                    continue;
            }
        } while (cg < 5);
    }

    public void AdminPanel() {
        do {
            Runtime.getRuntime().exec("cls");
            Scanner EB = new Scanner(System.in);
            System.out.println(" |||~~     Wellcome to Admin Panel    ~~|||\n");
            System.out.println("           {1} Add Customer");
            System.out.println("           {2} Remove Customer");
            System.out.println("           {3} Modify Customer");
            System.out.println("           {4} Show Bill");
            System.out.println("           {5} Search By Miter");
            System.out.println("           {6} Customer List");
            System.out.println("           {7} Paid Customer List");
            System.out.println("           {8} Exit");
            System.out.println();
            System.out.print("       Enter Your Choice: ");
            ch = EB.nextInt();
            switch (ch) {
                case 1:
                    AdminMethods A = new AdminMethods();
                    Runtime.getRuntime().exec("cls");
                    A.AddAccount();
                    System.out.print("Do you want to add more ?");
                    System.out.print("  {1} Yes");
                    System.out.print("  {2} No");
                    int yy = EB.nextInt();
                    if (yy == 1) {
                        A.AddAccount();
                        System.out.print(" Customers successfully added !! ");
                    } else if (yy == 2) {
                        System.out.print(" Customer successfully added !! ");
                    }
                    break;
                case 2:
                    Runtime.getRuntime().exec("cls");
                    AdminMethods A1 = new AdminMethods();
                    A1.RemoveAccount();
                    break;
                case 3:
                    Runtime.getRuntime().exec("cls");
                    AdminMethods A2 = new AdminMethods();
                    A2.ModifyAccount();
                    break;
                case 4:
                    Runtime.getRuntime().exec("cls");
                    AdminMethods A3 = new AdminMethods();
                    A3.SearchBill();
                    break;
                case 5:
                    Runtime.getRuntime().exec("cls");
                    AdminMethods A4 = new AdminMethods();
                    A4.SearchAccount();
                    break;
                case 6:
                    Runtime.getRuntime().exec("cls");
                    AdminMethods A5 = new AdminMethods();
                    A5.CustomerList();
                case 7:
                    AdminMethods A6 = new AdminMethods();
                    A6.PaidCustomerList();
                case 8:
                    System.out.println("Going to Main Menu...");
                    SecondMenu sm = new SecondMenu();
                    sm.ElectricityMenu();
                    break;
                default:
                    System.out.println("Entered wrong choice ...");
                    System.out.println("Please enter again");
            }
            continue;
        } while (ch < 9);
    }
}
