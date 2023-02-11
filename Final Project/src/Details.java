
import java.io.FileReader;

import java.util.Scanner;

public class Details {

    public void managerDetails() {
        try {
            FileReader file = new FileReader("C:/Users/Asus/Documents/NetBeansProjects/Final Project/Manager Details.txt");
            Scanner r = new Scanner(file);
            while (r.hasNextLine()) {
                System.out.println(r.nextLine());
            }
            r.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

    public void salesmenDetails() {
        try {
            FileReader file = new FileReader("C:/Users/Asus/Documents/NetBeansProjects/Final Project/Salesmen Details.txt");
            Scanner r = new Scanner(file);
            while (r.hasNextLine()) {
                System.out.println(r.nextLine());
            }
            r.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }

    public void importDetails() {
        try {
            FileReader file = new FileReader("C:/Users/Asus/Documents/NetBeansProjects/Final Project/Import Details.txt");
            Scanner r = new Scanner(file);
            while (r.hasNextLine()) {
                System.out.println(r.nextLine());
            }
            r.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }

    }

    public void locationDetails() {
        System.out.println("	Middle Badda, Dhaka-1212. House-A, Road-06, Badda,Dhaka.");

    }

}
