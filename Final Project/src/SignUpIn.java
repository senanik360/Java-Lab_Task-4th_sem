
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class SignUpIn {

    Scanner input = new Scanner(System.in);
    private String name, contactNo, gender;
    private String pass, repass;
    int t1, t2, t3, t4, k;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    public void entry() {
        System.out.println("-------------------------------------------------");
        System.out.println("|-  1.Sign In.  \t-|-\t   2.Sign Up.  -|");
        System.out.println("-------------------------------------------------");
        do {
            k = 0;
            Scanner input = new Scanner(System.in);
            String n = input.next();
            if (n.equalsIgnoreCase("1")) {
                SignIn();
            } else if (n.equalsIgnoreCase("2")) {
                SignUp();
            } else {
                k = 1;
                System.out.println("Invalid Input. Try Again Please.");
            }
        } while (k == 1);

    }

    public void SignUp() {

        System.out.println("\t • • • Please Enroll Your Details & Sign Up. • • • ");
        System.out.println("|------------------------------------------------|");
        Scanner input = new Scanner(System.in);
        System.out.print("|   Name : ");
        name = input.nextLine();
        setName(name);
        System.out.print("|   Gender : ");
        gender = input.nextLine();
        setGender(gender);
        System.out.print("|   Contact No. : ");
        contactNo = input.nextLine();
        setContactNo(contactNo);
        try {
            Formatter formatter = new Formatter("C:/Users/Asus/Documents/NetBeansProjects/Final Project/SequirityDetails.txt");
            do {
                t1 = 0;

                System.out.print("|   Set Password : ");
                pass = input.nextLine();
                if (pass.length() >= 8) {
                    setPass(pass);
                    System.out.print("|   Retype Password : ");
                } else {
                    t1 = 1;
                    System.out.println(" :-Try Again with Minimum Eight(8) Charecters. ");
                }
            } while (t1 == 1);
            do {
                t2 = 0;
                repass = input.nextLine();
                if (getPass().equals(repass)) {
                    System.out.println("\n\t  ~~ Thank You For Sign Up. ~~ ");
                } else {
                    t2 = 2;
                    System.out.println("Invalid. Try Again.");
                    System.out.print("|   Retype Password : ");
                }
            } while (t2 == 2);

            formatter.format("%s %s\r\n", getName(), getPass());
            formatter.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        SignIn();
    }

    public void SignIn() {
        try {
            System.out.println("\t\t|-------------|");
            System.out.println("\t\t|-  Sign In  -|");
            System.out.println("\t\t|-------------|");
            File read = new File("C:/Users/Asus/Documents/NetBeansProjects/Final Project/SequirityDetails.txt");
            Scanner scan = new Scanner(read);
            Scanner input = new Scanner(System.in);
            while (scan.hasNext()) {
                System.out.print("Name : ");
                String n = input.nextLine();
                String name = scan.next();
                if (n.equalsIgnoreCase(name)) {
                    System.out.print("Password : ");
                    String i = input.nextLine();
                    String pass = scan.next();
                    if (i.equalsIgnoreCase(pass)) {
                        System.out.println("\t -• You Are Successfully Logged in. •-");
                    } else {
                        System.out.println("\tYour Password isn't correct.");
                        System.out.println("\t\t[Press left Arrow(<) to back / Press Right Arrow(>) for Sign Up ]");
                        do {
                            k = 0;
                            String press = input.next();
                            if (press.equalsIgnoreCase("<")) {
                                entry();
                            } else if (press.equalsIgnoreCase(">")) {
                                SignUp();
                            } else {
                                k = 1;
                            }
                        } while (k == 1);

                    }
                } else {
                    System.out.println("\tYour Name isn't correct.");
                    System.out.println("\t\t[Press left Arrow(<) to back / Press Right Arrow(>) for Sign Up ]");
                    do {
                        k = 0;
                        String press = input.next();
                        if (press.equalsIgnoreCase("<")) {
                            entry();
                        } else if (press.equalsIgnoreCase(">")) {

                            SignUp();
                        } else {
                            k = 1;
                            System.out.println("\tInvalid Input. Try Again.");
                        }
                    } while (k == 1);
                }
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }

    public void welcomeAgain() {
        try {
            System.out.println("\n   --------- > >");
            File read = new File("C:/Users/Asus/Documents/NetBeansProjects/Final Project/SequirityDetails.txt");
            Scanner scan = new Scanner(read);
            String name = scan.next();

            System.out.println("Hello Mr./Ms. " + name + ". Welcome Again.");
            System.out.println("\t\t\t   < < ----------\n");
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
