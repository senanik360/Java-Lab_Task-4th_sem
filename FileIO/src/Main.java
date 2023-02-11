
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

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

        System.out.println("\t *** Please Enroll Your Details & Sign Up. ***");
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
            FileWriter file = new FileWriter("C:/Users/Asus/Documents/NetBeansProjects/FileIO/EntryDetails.txt", true);
//            Formatter formatter = new Formatter("C:/Users/Asus/Documents/NetBeansProjects/FileIO/EntryDetails.txt");
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
                }
            } while (t2 == 2);
//            file.write("%s%s", getName(), getPass());

            file.write("\n");
            file.write(getName());
            file.write(" ");
            file.write(getPass());

//            formatter.format("%s %s\r\n", getName(), getPass());
//            formatter.close();
            file.close();
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
            File read = new File("C:/Users/Asus/Documents/NetBeansProjects/FileIO/EntryDetails.txt");
            Scanner scan = new Scanner(read);
            Scanner input = new Scanner(System.in);
//            while (scan.hasNext()) {
            while (scan.hasNext()) {
                System.out.print("Name : ");
                String n = input.nextLine();
//                do {
                    String name = scan.next();
//                } while (!n.equalsIgnoreCase(name));

//                while(name!=null){
//                    }
                if (n.equalsIgnoreCase(name)) {
                    System.out.print("Password : ");
                    String i = input.nextLine();
//                    do {
                        String pass = scan.next();
//                    } while (!n.equalsIgnoreCase(pass));

                    if (i.equalsIgnoreCase(pass)) {
                        System.out.println(" Done");
                        break;
                    } else {
                        System.out.println("\tYour Password isn't correct.");
                        System.out.println("\t\t[Press left Arrow(<) to back / Press 1 for Sign Up ]");
                        do {
                            k = 0;
                            String press = input.next();
                            if (press.equalsIgnoreCase("<")) {
                                entry();
                            } else if (press.equalsIgnoreCase("1")) {
                                SignUp();
                            } else {
                                k = 1;
                            }
                        } while (k == 1);

                    }
                } else {
                    System.out.println("\tYour Name isn't correct.");
                    System.out.println("\t\t[Press left Arrow(<) to back / Press 1 for Sign Up ]");
                    do {
                        k = 0;
                        String press = input.next();
                        if (press.equalsIgnoreCase("<")) {
                            entry();
                        } else if (press.equalsIgnoreCase("1")) {

                            SignUp();
                        } else {
                            k = 1;
                        }
                    } while (k == 1);
                }
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.entry();
    }
}
