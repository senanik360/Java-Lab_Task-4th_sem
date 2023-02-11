/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package methodpackage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class CustomerMethods {

    public double pay;
    public double billp;
    private String meter;
    private String meterNoC;
    private String name;
    private String emailC;
    private String phoneNo;
    private String adress;
    private int unit;
    private double amt;
    private double v;
    private double vv;
    private double tb;

    Scanner EB = new Scanner(System.in);
    //method to display account details

    public void showAccount() throws IOException {
        Runtime.getRuntime().exec("cls");
        System.out.print("   ~~|||  Wellcome to Your Account  |||~~\n\n");
        try {
            FileWriter fileb = new FileWriter("CustomerData.txt");
            FileReader readerb = new FileReader(fileb);
            Scanner read = new Scanner(fileb);
            System.out.print("   Enter Meter No : ");
            meter = EB.nextLine();
            while (read.hasNext()) {
                String n = read.next();
                String e = read.next();
                String p = read.next();
                String m = read.next();
                String a = read.next();
                double u = read.nextDouble();
                double tb = read.nextDouble();
                if (m.equals(meter)) {
                    System.out.println("   ~~~   Search Panel   ~~~ \n\n");
                    System.out.print("   ~~|||   Customer Details   |||~~\n");
                    System.out.println("        Customer Name: " + n);
                    System.out.println("        Customer Email: " + e);
                    System.out.println("        Phone Number: " + p);
                    System.out.println("        Meter No: " + m);
                    System.out.println("        Adress: " + a);
                    System.out.println("        Bill Amount: " + tb);
                    break;
                } else {
                    System.out.println("   Search Failed! Miter does not exist.");
                    System.out.println("   Going to Customer Panel.....");
                    break;
                }
            }
            readerb.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //method of bill calculation
    public void ShowBill() {
        Runtime.getRuntime().exec("cls");
        System.out.println("   ~~|||   Show Total Bill  |||~~");
        System.out.println("     Enter Meter No.: ");
        try {
            FileReader fileh = new FileReader("CustomerData.txt");
            FileReader readerh = new FileReader(fileh);
            Scanner read = new Scanner(fileh);
            Scanner add7 = new Scanner(System.in);
            meter = add7.nextLine();
            while (read.hasNext()) {
                String n7 = read.next();
                String e7 = read.next();
                String p7 = read.next();
                String m7 = read.next();
                String a7 = read.next();
                int u7 = read.nextInt();
                double tb7 = read.nextDouble();
                if (m7.equals(meter)) {
                    if (u7 <= 100) {
                        amt = u7 * 5;
                    } else if (u7 >= 101 && u7 <= 200) {
                        amt = 100 * 5 + (u7 - 100) * 7;
                    } else if (u7 >= 201 && u7 <= 300) {
                        amt = 100 * 5 + (u7 - 200) * 10;
                    } else {
                        amt = 100 * 5 + (u7 - 300) * 15;
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
                    System.out.println("     Your unit is: ");
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
            readerh.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //method to pay the bill
    //method to search a miter nu
    public void BillPay() {
        Runtime.getRuntime().exec("cls");
        System.out.print("   ~~|||   Pay Bill Panel   |||~~\n\n");
        System.out.print("   Enter Meter No : ");
        try {
            FileReader filea = new FileReader("CustomerData.txt");
            FileReader readera = new FileReader(filea);
            FileReader writera = new FileReader("TempData.txt", true);
            Scanner read = new Scanner(filea);
            meter = EB.nextLine();
            while (read.hasNext()) {
                String n6 = read.next();
                String e6 = read.next();
                String p6 = read.next();
                String m6 = read.next();
                String a6 = read.next();
                int u6 = read.nextInt();
                double tb6 = read.nextDouble();
                if (m6.equals(meter)) {

                    System.out.println("Your Bill is :" + tb6);
                    System.out.println("Enter the money you want to pay :");
                    pay = EB.nextInt();
                    if (tb6 == pay) {
                        billp = pay - tb6;
                        System.out.println("Successfully Bill Paid.");
                        Scanner read = new Scanner(filea);
                        while  {
                            if (tb6 == pay) {

                            } else {
                                String n4 = read.next();
                                String e4 = read.next();
                                String p4 = read.next();
                                String m4 = read.next();
                                String a4 = read.next();
                                int u4 = read.nextInt();
                                double tb4 = read.nextDouble();
                                writera.write("\r\n" + n4 + e4 + p4 + m4 + a4 + u4 + tb4);
                            }
                        }
                        writera.flush();
                        writera.close();
                    } else {
                        System.out.println("  Your Can't pay like this!");
                        System.out.println("  Your have to pay full amount.");
                        System.out.println("      {1} Pay Again");
                        System.out.println("      {2} Exit");
                        System.out.print("      Enter choice :");
                        Scanner agg = new Scanner(System.in);
                        a11 = agg.nextInt();
                    }
                } else {
                    System.out.println("   Search Failed! Miter does not exist.");
                    System.out.println("   Going to Customer Panel.....");
                    break;
                }
            }
            readera.close();
            File f1 = new File("CustomerData.txt");
            boolean b = f1.delete();
            File F1 = new File("TempData.txt");
            File F2 = new File("CustomerData.txt");
            boolean b1 = F1.renameTo(F2);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
