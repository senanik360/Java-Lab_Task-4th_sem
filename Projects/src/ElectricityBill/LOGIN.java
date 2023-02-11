/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package methodpackage;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class LOGIN {

    public int ac5;
    public int bbn;
    public int g;
    public int bg;
    public int c1;
    public int a;
    public int abc;
    public int a11;
    private String emlA;
    public String emailA;
    private String passA;
    public String passwordA;
    public String meterNoC;
    private String emlC;
    public String emailC;
    private String passC;
    public String passwordC;
    public String meterC;
    AdminMenu admin = new AdminMenu();
    CustomerMenu customer = new CustomerMenu();

    public void AdminLogIN() {
        Runtime.getRuntime().exec("cls");
        System.out.println("   Wellcome to Log In page !!/n/n");
        System.out.println(" ~~~  LOG IN TO YOUR ACCOUNT  ~~~ /n");
        try {
            File filed = new File("Admin.txt");
            FileReader readerd = new FileReader(filed);
            System.out.println("      EMAIL : ");
            Scanner add = new Scanner(System.in);
            emlA = add.nextLine();
            do {
                System.out.println("      {1} Show Paasword ");
                System.out.println("      {2} Hide Paasword ");
                System.out.println("      Enter choice - ");
                Scanner input = new Scanner(System.in);
                c1 = input.nextInt();
                if (c1 == 1) {
                    System.out.println("      PASSWORD : ");
                    Scanner add1 = new Scanner(System.in);
                    passA = add1.nextLine();
                } else if (c1 == 2) {
                    System.out.println("      PASSWORD : ");
                    Scanner add2 = new Scanner(System.in);
                    passA = add2.nextLine();
                } else {
                    System.out.println("      Entered wrong Choice !");
                    continue;
                }
            } while (c1 < 3);
            Scanner read = new Scanner(filed);
            while (read.hasNext()) {
                String e = read.next();
                String p = read.next();
                if (e.equals(emlA) && p.equals(passA)) {
                    System.out.print("    Successfully Loged In !!");
                    admin.AdminPanel();
                    break;
                } else {
                    System.out.print("    Incorrect Email or Password !");
                    admin.AdminReg();
                    break;
                }
            }
            readerd.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void CustomLogIN() throws IOException {
        Runtime.getRuntime().exec("cls");
        System.out.println("     Wellcome to Log In page !!\n\n");
        System.out.println("  ~~~ LOG IN TO YOUR ACCOUNT ~~~ \n");
        try {
            File fileg = new File("Customer.txt");
            FileReader readerg = new FileReader(fileg);
            System.out.println("      EMAIL : ");
            Scanner add = new Scanner(System.in);
            emlC = add.nextLine();
            System.out.println("      METER NO. : ");
            Scanner add3 = new Scanner(System.in);
            meterC = add3.nextLine();
            do {
                System.out.println("      {1} Show Paasword ");
                System.out.println("      {2} Hide Paasword ");
                System.out.println("      Enter choice : ");
                Scanner input = new Scanner(System.in);
                bg = input.nextInt();
                switch (bg) {
                    case 1:
                        System.out.println("      PASSWORD : ");
                        Scanner add1 = new Scanner(System.in);
                        passC = add1.nextLine();
                        break;
                    case 2:
                        System.out.println("      PASSWORD : ");
                        Scanner add2 = new Scanner(System.in);
                        passC = add2.nextLine();
                        break;
                    default:
                        System.out.println("      Entered wrong Choice !");
                        continue;
                }
            } while (bg <= 3);
            Scanner read = new Scanner(fileg);
            while (read.hasNext()) {
                String e1 = read.next();
                String m1 = read.next();
                String p1 = read.next();
                if (e1.equals(emlC) && m1.equals(meterC) && p1.equals(passC)) {
                    System.out.print("    Successfully Loged In !!");
                    customer.CustomerPanel();
                    break;
                } else {
                    System.out.print("    Incorrect Email or Password !");
                    customer.CustomerReg();
                    break;
                }
            }
            readerg.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
