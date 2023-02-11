/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//package methodpackage;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class SIGNUP {

    public int ccc1;
    public int acd1;
    public int choice;
    public int ac1;
    private String emailA;
    private String passwordA;
    private String meterNoC;
    private String emailC;
    private String passwordC;
    AdminMenu AM = new AdminMenu();
    CustomerMenu CM = new CustomerMenu();

    public SIGNUP() {
    }

    public SIGNUP(String emailA) {
        this.emailA = emailA;
    }

    /*public SIGNUP(String email,String miterNo,String password)
	{
		this.email = email;
		this.miterNo = miterNo;
		this.password = password;
	} 
	public void setemail(String email)
	{
		this.email = email;
	}
	public String getemail()
	{
		return this.email;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setmiterNo(String miterNo)
	{
		this.miterNo= miterNo;
	}
	public String getmiterNo()
	{
		return this.miterNo;
	}*/
    public void AdminSignUP() throws IOException {
        Runtime.getRuntime().exec("cls");
        System.out.println("     Wellcome to Sign Up page !!/n/n");
        System.out.println("    ~~~ SIGN UP TO YOUR ACCOUNT ~~~ /n");
        try {
            FileWriter writerv = new FileWriter("Admin.txt", true);
            System.out.println("      EMAIL : ");
            Scanner add = new Scanner(System.in);
            emailA = add.nextLine();
            do {
                System.out.println("      [1] Show Paasword ");
                System.out.println("      [2] Hide Paasword ");
                System.out.println("      Enter choice - ");
                Scanner input = new Scanner(System.in);
                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("      PASSWORD : ");
                    Scanner add1 = new Scanner(System.in);
                    passwordA = add1.nextLine();
                    System.out.println("/n/n      Successfully Signed In ! ");
                    AM.AdminReg();
                    break;
                } else if (choice == 2) {
                    System.out.println("      PASSWORD : ");
                    Scanner add2 = new Scanner(System.in);
                    passwordA = add2.nextLine();
                    System.out.println("/n/n      Successfully Signed In ! ");
                    AM.AdminReg();
                    break;
                } else {
                    System.out.println("      Entered wrong Choice !");
                    continue;
                }
            } while (choice <= 2);
            writerv.write("\r\n" + emailA + passwordA);
            writerv.flush();
            writerv.close();
        } catch (IOException e) {
            System.out.println("An error occurred." + e);
            e.printStackTrace();
        }
    }

    public void CustomSignUP() {
        Runtime.getRuntime().exec("cls");
        System.out.println("  Wellcome to Sign Up page !!\n\n");
        System.out.println("  ~~~ SIGN UP TO YOUR ACCOUNT ~~~ \n");
        try {
            FileWriter writero = new FileWriter("Customer.txt", true);
            System.out.println("      EMAIL : ");
            Scanner add4 = new Scanner(System.in);
            emailC = add4.nextLine();
            System.out.println("      METER NO. : ");
            Scanner add44 = new Scanner(System.in);
            meterNoC = add44.nextLine();
            System.out.println("      [1] Show Paasword ");
            System.out.println("      [2] Hide Paasword ");
            System.out.println("      Enter choice - ");
            Scanner input = new Scanner(System.in);
            ccc1 = input.nextInt();
            do {
                if (ccc1 == 1) {
                    System.out.println("      PASSWORD : ");
                    Scanner add3 = new Scanner(System.in);
                    passwordC = add3.nextLine();
                    System.out.println();
                    System.out.println("      Successfully Signed In ! ");
                    CM.CustomerReg();
                    break;
                } else if (ccc1 == 2) {
                    System.out.println("      PASSWORD : ");
                    Scanner add5 = new Scanner(System.in);
                    passwordC = add5.nextLine();
                    System.out.println("/n/n      Successfully Signed In ! ");
                    CM.CustomerReg();
                    break;
                } else {
                    System.out.println("      Entered wrong Choice !");
                    continue;
                }
            } while (ccc1 < 3);
            writero.write("\r\n" + emailC + passwordC);
            writero.flush();
            writero.close();
        } catch (IOException e) {
            System.out.println("An error occurred." + e);
            e.printStackTrace();
        }
    }
}
