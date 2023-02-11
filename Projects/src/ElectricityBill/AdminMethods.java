/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class AdminMethods {

    public int m;
    public int abc7;
    public int abc6;
    private String name;
    private String phoneNo;
    private String email;
    private String meterNo;
    private String meter;
    private String adress;
    private int unit;
    private double bill;
    private double amt;
    private double v;
    private double tb;
    Scanner EB = new Scanner(System.in);
    //method to open an account
    AdminMethods aa = new AdminMethods();

    public void AddAccount() {
        Runtime.getRuntime().exec("cls");
        try {
            FileWriter writer4 = new FileWriter("CustomerData.txt", true);
            System.out.print("Customer Name: ");
            name = EB.nextLine();
            System.out.print("Customer Email: ");
            email = EB.nextLine();
            System.out.print("Phone Number: ");
            phoneNo = EB.nextLine();
            System.out.print("Meter No: ");
            meterNo = EB.nextLine();
            System.out.print("Adress: " + adress);
            unit = EB.nextInt();
            System.out.print("Unit: ");
            if (unit <= 100.00) {
                amt = unit * 5;
            } else if (unit >= 101.00 && unit <= 200.00) {
                amt = 100 * 5 + (unit - 100.00) * 7;
            } else if (unit >= 201.00 && unit <= 300.00) {
                amt = 100 * 5 + (unit - 200.00) * 10;
            } else {
                amt = 100 * 5 + (unit - 300.00) * 15;
            }
            if (unit <= 100.00) {
                v = 35;
            } else if (unit >= 101.00 && unit <= 200.00) {
                v = 65;
            } else if (unit >= 201.00 && unit <= 300.00) {
                v = 95;
            } else {
                v = 125;
            }
            double ec = amt + 30;
            double sc = ec + 20;
            double st = sc;
            double mr = 70;
            double cd = st + 70;
            tb = cd + v;
            writer4.write("\r\n" + name + email + phoneNo + meterNo + adress + unit + tb);
            writer4.flush();
            writer4.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //method to remove details
    public void RemoveAccount() {
        Runtime.getRuntime().exec("cls");
        System.out.println(" ||**   Remove Customer  **||/n");
        System.out.println("    Enter Miter No. : ");
        try {
            FileReader file1 = new FileReader("CustomerData.txt");
            FileReader reader1 = new FileReader(file1);
            FileReader reader2 = new FileReader(file1);
            FileWriter writer1 = new FileWriter("TempData.txt", true);
            Scanner add1 = new Scanner(System.in);
            meter = add1.nextLine();
            Scanner read = new Scanner(file1);
            while (read.hasNext()) {
                String n5 = read.next();
                String e5 = read.next();
                String p5 = read.next();
                String m5 = read.next();
                String a5 = read.next();
                int u5 = read.nextInt();
                double tb5 = read.nextDouble();
                if (m5.equals(meter)) {
                    System.out.print("   ~~|||   Customer Details   |||~~\n\n");
                    System.out.println("      Customer Name: " + n5);
                    System.out.println("      Customer Email: " + e5);
                    System.out.println("      Phone Number: " + p5);
                    System.out.println("      Meter No: " + m5);
                    System.out.println("      Adress: " + a5);
                    System.out.println("      Bill: " + tb);
                    System.out.println(" Are you sure to remove details ?");
                    System.out.println("      {1} Yes");
                    System.out.println("      {2} No");
                    System.out.print("      Enter choice :");
                    Scanner addd1 = new Scanner(System.in);
                    abc6 = addd1.nextInt();
                    if (abc6 == 1) {
                        break;
                    } else {
                        System.out.println("     You are not sure !");
                        System.out.println("     Going to Admin Panel ......");
                        break;
                    }
                }
                if (m5.equals(meter)) {

                } else {
                    Scanner read = new Scanner(file1);
                    while  {
                        String n4 = read.next();
                        String e4 = read.next();
                        String p4 = read.next();
                        String m4 = read.next();
                        String a4 = read.next();
                        int u4 = read.nextInt();
                        double tb4 = read.nextDouble();
                        writer1.write("\r\n" + n4 + e4 + p4 + m4 + a4 + u4 + tb4);
                    }
                }
                System.out.println("    Successfully Removed Account.");
                System.out.println("     Going to Admin Panel ....");
                writer1.flush();
                writer1.close();
                reader1.close();
                File f1 = new File("CustomerData.txt");
                boolean b = f1.delete();
                File F1 = new File("TempData.txt");
                File F2 = new File("CustomerData.txt");
                boolean b1 = F1.renameTo(F2);
            }
            catch (FileNotFoundException e){
		  System.out.println("Error! File not found.");
		  }
            catch (IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        }
        //method to search account
    public void SearchAccount() {
        Runtime.getRuntime().exec("cls");
        System.out.println("   ~~~   Search Panel   ~~~ \n\n");
        System.out.print("   Enter Meter No : ");
        try {
            FileReader file8 = new FileReader("CustomerData.txt", true);
            FileReader reader8 = new FileReader(file8);
            Scanner read = new Scanner(file8);
            Scanner add7 = new Scanner(System.in);
            meter = add7.nextLine();
            while (read.hasNext()) {
                String n3 = read.next();
                String e3 = read.next();
                String p3 = read.next();
                String m3 = read.next();
                String a3 = read.next();
                int u3 = read.nextInt();
                double tb3 = read.nextDouble();
                if (m3.equals(meter)) {
                    System.out.print("   ~~|||   Customer Details   |||~~\n\n");
                    System.out.println("      Customer Name: " + n3);
                    System.out.println("      Customer Email: " + e3);
                    System.out.println("      Phone Number: " + p3);
                    System.out.println("      Meter No: " + m3);
                    System.out.println("      Adress: " + a3);
                    System.out.println("      Bill: " + tb3);
                } else {
                    int abct;
                    System.out.print("    Incorrect Meter No. !");
                    System.out.println("      {1} Enter Again");
                    System.out.println("      {2} Exit");
                    System.out.print("      Enter choice :");
                    Scanner addd2 = new Scanner(System.in);
                    abct = addd2.nextInt();
                }
            }
            reader8.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void SearchBill() {
        System.out.print("   ~~|||   Bill Details   |||~~\n\n");
        System.out.print("   Enter Meter No : ");
        try {
            FileReader file8 = new FileReader("CustomerData.txt");
            FileReader reader = new FileReader(file8, true);
            Scanner read = new Scanner(file8);
            Scanner add8 = new Scanner(System.in);
            meter = add8.nextLine();
            while (read.hasNext()) {
                String n7 = read.next();
                String e7 = read.next();
                String p7 = read.next();
                String m7 = read.next();
                String a7 = read.next();
                int u7 = read.nextInt();
                double tb7 = read.nextDouble();
                if (m7.equals(meter)) {
                    if (u7 <= 100.00) {
                        amt = u7 * 5;
                    } else if (u7 >= 101.00 && u7 <= 200.00) {
                        amt = 100 * 5 + (u7 - 100.00) * 7;
                    } else if (u7 >= 201.00 && u7 <= 300.00) {
                        amt = 100 * 5 + (u7 - 200.00) * 10;
                    } else {
                        amt = 100 * 5 + (u7 - 300.00) * 15;
                    }
                    if (u7 <= 100.00) {
                        v = 35;
                    } else if (u7 >= 101.00 && u7 <= 200.00) {
                        v = 65;
                    } else if (u7 >= 201.00 && u7 <= 300.00) {
                        v = 95;
                    } else {
                        v = 125;
                    }
                    double ec = amt + 30;
                    double sc = ec + 20;
                    double st = sc;
                    double mr = 70;
                    double cd = st + 70;
                    tb = cd + v;
                    double td = tb + 100;
                    System.out.print("   Demand Charge : " + amt);
                    System.out.print("   Energy Charge : " + ec);
                    System.out.print("   Service Charge : " + sc);
                    System.out.print("   Sub-Total : " + st);
                    System.out.print("   Meter Rent : " + mr);
                    System.out.print("   Current Dues : " + cd);
                    System.out.print("   Vat : " + v);
                    System.out.print("   Total Bill : " + tb);
                    System.out.print("   Total if paid after Due date : " + td);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void ModifyAccount() {
        int ch;
        try {
            do {
                Runtime.getRuntime().exec("cls");
                Scanner add4 = new Scanner(System.in);
                System.out.print("      ~~|||  Modify Details   |||~~\n\n");
                FileReader filei = new FileReader("CustomerData.txt");
                FileReader readeri = new FileReader(filei);
                FileReader writeri = new FileReader("TempData.txt", true);
                Scanner read = new Scanner(filea);
                meter = add4.nextLine();
                while (read.hasNext()) {
                    String n6 = read.next();
                    String e6 = read.next();
                    String p6 = read.next();
                    String m6 = read.next();
                    String a6 = read.next();
                    int u6 = read.nextInt();
                    double tb6 = read.nextDouble();
                    if (m6.equals(meter)) {
                        System.out.println("     Which part do you want to modify?\n");
                        System.out.println("     {1}Name\n");
                        System.out.println("     {2}Phone no.\n");
                        System.out.println("     {3}Adress\n");
                        System.out.println("     {4}Exit\n");
                        System.out.print("      Enter choice - ");
                        Scanner add4 = new Scanner(System.in);
                        ch = add4.nextLine();
                        if (ch == 1) {
                            Scanner add4 = new Scanner(System.in);
                            System.out.print("     Enter new Name : ");
                            String nm = add4.nextLine();
                            if () {
                                
                            }
                        }

                        break;
                      
                        case 2:
			Scanner add5 = new Scanner(System.in);
			System.out.print("     Enter new Phone No. : ");
			String ph = add5.nextLine();
			break;
			case 3:
			Scanner add6 = new Scanner(System.in);
			System.out.print("     Enter new Adress : ");
			String ad = add6.nextLine();
			break;
			case 4:
			System.out.print("     Going to Admin Panel .....");
			break;
			default:
			System.out.print("     Wrong Choice Entered !");
			System.out.print("     Enter Again.");
			continue;
	  }
		  else 
	{
		System.out.println("   Search Failed! Miter does not exist.");
                        System.out.println("   Going to Admin Panel.....");
                        break;
                    }
                    if (m6.equals(meter)) {
                    } else {
                        Scanner read = new Scanner(filea);
                        while  {
                            String n1 = read.next();
                            String e1 = read.next();
                            String p1 = read.next();
                            String m1 = read.next();
                            String a1 = read.next();
                            int u1 = read.nextInt();
                            double tb1 = read.nextDouble();
                            writeri.write("\r\n" + n1 + e1 + p1 + m1 + a1 + u1 + tb1);
                        }
                        writeri.flush();
                        writeri.close();
                    }
                }
                readeri.close();
                File f1 = new File("CustomerData.txt");
                boolean b = f1.delete();
                File F1 = new File("TempData.txt");
                File F2 = new File("CustomerData.txt");
                boolean b1 = F1.renameTo(F2);
            } while (ch < 5)
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void PaidCustomerList() {
        Runtime.getRuntime().exec("cls");
        try {
            System.out.print("                 ~~|||      Paid Customers     |||~~\n\n");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("| No.| Miter No. |       Name       |      Email     |  Phone No. |  Bill  |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            File file1 = new File("CustomerData.txt", true);
            FileReader reader = new FileReader(file1);
            Scanner read = new Scanner(file1);
            while (read.hasNext()) {
                int i = 1;
                String n7 = read.next();
                String e7 = read.next();
                String p7 = read.next();
                String m7 = read.next();
                String a7 = read.next();
                int u7 = read.nextInt();
                double tb7 = read.nextDouble();
                i++;
                if (tb7 == 0.00) {
                    System.out.println(" " + i + "   " + m7 + "    " + n7 + "    " + e7 + "    " + p7 + "   " + tb7 + "     ");
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void CustomerList() {
        Runtime.getRuntime().exec("cls");
        try {
            System.out.print("                 ~~|||      Default Customers     |||~~\n\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.print("| No.| Miter No. |       Name       |      Email     |  Phone No. |\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            File file1 = new File("CustomerData.txt", true);
            FileReader reader = new FileReader(file1);
            Scanner read = new Scanner(file1);
            while (read.hasNext()) {
                int i = 1;
                String n9 = read.next();
                String e9 = read.next();
                String p9 = read.next();
                String m9 = read.next();
                String a9 = read.next();
                int u9 = read.nextInt();
                double tb9 = read.nextDouble();
                i++;
                System.out.println(" " + i + "   " + m9 + "    " + n9 + "    " + e9 + "    " + p9 + "   ");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
