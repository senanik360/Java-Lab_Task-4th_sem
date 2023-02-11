package E.Bill;

import java.util.Scanner;

public class Reg {
    
    private String name, meter, phoneNo;
    int a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }
  
    public void match() {
        System.out.println("\t\t --- Please Sign in With Your Name, Meter Name & Phone No. ---");
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Name : ");
            name = input.nextLine();
            setName(name);
            System.out.print("Meter No.");
            meter = input.nextLine();
            setMeter(meter);
            System.out.print("Phone No.");
            phoneNo = input.nextLine();
            setPhoneNo(phoneNo);
            if (getName().equalsIgnoreCase("Sadia") && getMeter().equals("12345") && getPhoneNo().equals("9876")) {
                System.out.println("Valid");
            } else {
                a = 1;
                System.out.println("Invalid Input.   Try again please.");
            }
        } while (a == 1);

    }
}

//    public void SignUp() {
//        System.out.println("\t *** Please Enroll Your Details & Sign Up. ***");
//        System.out.print(" Name : ");
//        name = input.nextLine();
//        setName(name);
//        System.out.print(" Gender : ");
//        gender = input.nextLine();
//        System.out.print(" Address : ");
//        address = input.nextLine();
//        setAddress(address);
//        System.out.print(" Contact No. : ");
//        contactNo = input.nextLine();
//        setContactNo(contactNo);
//        do {
//            t1 = 0;
//            System.out.print(" Set Password : ");
//            pass = input.nextLine();
//            if (pass.length() >= 8) {
//                System.out.print(" Retype Password : ");
//            } else {
//                t1 = 1;
//                System.out.println("Minimum Eight(8) Charecters. Try Again");
//            }
//        } while (t1 == 1);
//        do {
//            t2 = 0;
//            repass = input.nextLine();
//            if (pass.equals(repass)) {
//                System.out.println("\n\t  ~~ Thank You For Sign Up. ~~ ");
//            } else {
//                t2 = 2;
//                System.out.println("Invalid. Try Again.");
//            }
//        } while (t2 == 2);
//
//    }
//
//    public void SignIn() {
//        System.out.println("\n      ------------------");
//        System.out.println("           Sign in.");
//        System.out.println("      ------------------");
//        System.out.print("\t\t Name : ");
//        do {
//            t3 = 0;
//            String inName = input.nextLine();
//            if (inName.equals(name)) {
//                System.out.print("\t\t Password : ");
//                do {
//                    t4 = 0;
//                    String inPass = input.nextLine();
//                    if (inPass.equals(pass)) {
//                    } else {
//                        t4 = 1;
//                        System.out.println("Incorrect PassWord. Try Again Please.");
//                    }
//                } while (t4 == 1);
//            } else {
//                t3 = 1;
//                System.out.println("Incorrect Name. Try Again Please.");
//            }
//        } while (t3 == 1);
//    }
//
//    public void welcomeAgain() {
//        System.out.println("   --------- > >");
//        System.out.print("\tHello ");
//        if (gender.equalsIgnoreCase("male")) {
//            System.out.print("Mr. ");
//        } else if (gender.equalsIgnoreCase("female")) {
//            System.out.print("Ms. ");
//        } else {
//            System.out.print("Mr./Ms. ");
//        }
//        System.out.println(getName() + ". Welcome Again.");
//        System.out.println("\t\t\t   < < ----------");
//    }
