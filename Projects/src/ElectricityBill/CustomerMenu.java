/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package admincustomerpackage;
//import admincustomerpackage.methodpackage.*;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class CustomerMenu {

    public int ch1;
    public int chh;
    CustomerMethods CC = new CustomerMethods();

    public void CustomerReg() throws IOException {
        Runtime.getRuntime().exec("cls");
        Scanner BD = new Scanner(System.in);
        System.out.println("        ||||<<   WELLCOME TO LOG IN MENU   >>||||");
        System.out.println("        ||                                     ||");
        System.out.println("        ||     {1} LOG IN                      ||");
        System.out.println("        ||     {2} SIGN UP                     ||");
        System.out.println("        ||     {3} FORGOT PASSWORD / EMAIL     ||");
        System.out.println("        ||     {4} EXIT                        ||");
        System.out.println("        ||                                     ||");
        System.out.println();
        System.out.print("               Enter Your Choice: ");
        Scanner add9 = new Scanner(System.in);
        do {
            ch1 = add9.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("       Going To Log In Menu ....");
                    LOGIN L2 = new LOGIN();
                    L2.CustomLogIN();
                    break;
                case 2:
                    System.out.println("       Going To Sign Up Menu ....");
                    SIGNUP S2 = new SIGNUP();
                    S2.CustomSignUP();
                    break;
                case 3:
                    System.out.println("       Forgot Password ?");
                    System.out.println("       Here is a way to recover your Password ....");
                    FORGOT F2 = new FORGOT();
                    F2.CustomForgot();
                    break;
                case 4:
                    System.out.println("       Going To Main Menu ....");
                    SecondMenu E1 = new SecondMenu();
                    E1.ElectricityMenu();
                    break;
                default:
                    System.out.println("       Entered wrong choice!");
                    System.out.println("      Please enter again");
            }
        } while (ch1 <= 4);
    }

    public void CustomerPanel() {
        Runtime.getRuntime().exec("cls");
        Scanner B1 = new Scanner(System.in);
        do {
            System.out.println("    ~~~~  Wellcome to Customer Panel  ~~~~\n\n");
            System.out.println("            {1} Show Account");
            System.out.println("            {2} Show Bill");
            System.out.println("            {3} Pay Bill");
            System.out.println("            {4} Exit\n");
            System.out.print("             Enter Your Choice: ");
            chh = B1.nextInt();
            switch (chh) {
                case 1:
                    Runtime.getRuntime().exec("cls");
                    CustomerMethods CC = new CustomerMethods();
                    CC.showAccount();
                    break;
                case 2:
                    Runtime.getRuntime().exec("cls");
                    CustomerMethods CC1 = new CustomerMethods();
                    CC1.ShowBill();
                    break;
                case 3:
                    Runtime.getRuntime().exec("cls");
                    CustomerMethods CC2 = new CustomerMethods();
                    CC2.BillPay();
                    break;
                case 4:
                    Runtime.getRuntime().exec("cls");
                    System.out.println("Going to Main Menu...");
                    SecondMenu E3 = new SecondMenu();
                    E3.ElectricityMenu();
                    break;
                default:
                    System.out.println("Entered wrong choice ...");
                    System.out.println("Please enter again");
            }
            continue;
        } while (chh < 5);
    }
}
