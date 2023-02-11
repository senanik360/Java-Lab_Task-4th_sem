/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package methodpackage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class FORGOT {

    public int n;
    public int aa;
    public int aah;
    public int abcd;
    public int abcc;
    private String emlA;
    private String emailA;
    private String passA;
    private String passwordA;
    private String meterNoC;
    private String emlC;
    private String emailC;
    private String passC;
    private String passwordC;
    private String meterC;
    AdminMenu Am = new AdminMenu();
    CustomerMenu Cm = new CustomerMenu();

    /*
	public FORGOT()
	{ 
	
	}
	public FORGOT(String emlA,String passA)
	{
		this.emailA = emailA;
		this.passA = passA;
	} 
	public FORGOT(String emlC,String miterC, String passC)
	{
		this.emlC = emlC;
		this.miterC = miterC;
		this.passC = passC;
	} 
	public void setemail(String email)
	{
		this.email = email;
	}
	public String getUsername()
	{
		return this.user;
	}
	public void setPassword(String pass)
	{
		this.pass = pass;
	}
	public String getPassword()
	{
		return this.pass;
	}*/
    public void AdminForgot() throws IOException {
        Runtime.getRuntime().exec("cls");
        System.out.println("  Forgot Password / Email ??");
        System.out.println();
        do {
            System.out.println("  {1} Get Password by Email");
            System.out.println("  {2} Get Email by Password");
            System.out.println("  {3} Exit");
            System.out.println("   Enter Choice : ");
            Scanner add7 = new Scanner(System.in);
            aa = add7.nextInt();
            try {
                FileReader filek = new FileReader("Admin.txt");
                FileReader readerk = new FileReader(filek);
                Scanner read = new Scanner(filek);
                while (read.hasNext()) {
                    String e1 = read.next();
                    String p1 = read.next();
                    switch (aa) {
                        case 1:
                            System.out.println("  Forgot Password ?\n");
                            System.out.println("  Enter Your Email : ");
                            Scanner add8 = new Scanner(System.in);
                            emlA = add8.nextLine();
                            if (e1.equals(emlA)) {
                                System.out.println("      LOADING ......... ");
                                System.out.println("      We got your Password !");
                                System.out.println("      Your Password is : " + p1);
                                Am.AdminReg();
                                break;
                            } else {
                                System.out.println("      Entered wrong Email !");
                                Am.AdminReg();
                            }
                            break;
                        case 2:
                            System.out.println("  Forgot Email ?\n");
                            System.out.println("  Enter Your Password : ");
                            Scanner add9 = new Scanner(System.in);
                            passA = add9.nextLine();
                            if (p1.equals(passA)) {
                                System.out.println("      LOADING ......... ");
                                System.out.println("      We got your Email !");
                                System.out.println("      Your Email is : " + e1);
                                Am.AdminReg();
                                break;
                            } else {
                                System.out.println("      Entered wrong Password !");
                                Am.AdminReg();
                            }
                            break;
                        case 3:
                            System.out.println("      Going to Admin Log In Menu ..... ");
                            Am.AdminReg();
                            break;
                        default:
                            System.out.println("      Entered wrong Choice !");
                            continue;
                    }
                }
                readerk.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error! File not found.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } while (aa <= 3);
    }

    public void CustomForgot() {
        Runtime.getRuntime().exec("cls");
        System.out.println("  Forgot Password / Miter No ??\n\n");
        System.out.println("  {1} Get Password by Email");
        System.out.println("  {2} Get Miter No by Password");
        System.out.println("  {3} Exit");
        System.out.println("   Enter Choice : ");
        Scanner add22 = new Scanner(System.in);
        do {
            aah = add22.nextInt();
            try {
                FileReader filef = new FileReaderWriter("Customer.txt");
                FileReader readerf = new FileReader(filef);
                Scanner read = new Scanner(filef);
                while (read.hasNext()) {
                    String e2 = read.next();
                    String m2 = read.next();
                    String p2 = read.next();
                    switch (aah) {
                        case 1:
                            System.out.println("  Forgot Password ?\n");
                            System.out.println();
                            System.out.println("  Enter Your Email : ");
                            Scanner add8 = new Scanner(System.in);
                            emlC = add8.nextLine();
                            if (e2.equals(emlC)) {
                                System.out.println("      LOADING ......... ");
                                System.out.println("      We got your Password !");
                                System.out.println("      Your Password is : " + p2);
                                Cm.CustomerReg();
                            } else {
                                System.out.println("      Entered wrong Email !");
                                Cm.CustomerReg();
                            }
                            break;
                        case 2:
                            System.out.println("  Forgot Email ?\n");
                            System.out.println();
                            System.out.println("  Enter Your Password : ");
                            Scanner add9 = new Scanner(System.in);
                            passC = add9.nextLine();
                            if (p2.equals(passC)) {

                                System.out.println("      LOADING ......... ");
                                System.out.println("      We got your Email !");
                                System.out.println("      Your Email is : " + m2);
                                Cm.CustomerReg();
                            } else {
                                System.out.println("      Entered wrong Email !");
                                Cm.CustomerReg();
                            }
                            break;
                        case 3:
                            System.out.println("      Going to Admin Log In Menu ..... ");
                            Am.AdminReg();
                            break;
                        default:
                            int abcc1;
                            System.out.println("      Entered wrong Choice !");
                            continue;
                    }
                }
                readerf.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error! File not found.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } while (aa <= 3);
    }
}
