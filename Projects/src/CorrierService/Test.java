package CorrierService;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("********************WELCOME TO DHL WORLD WIDE COURIER SERVICE******************** \n---------------------------------------------------------------------------------\nDHL is the global leader in the logistic industries. Specially in international shipping, courier service and transport\n\n");

        System.out.println("Don't already have an account?\nPress ENTER for registration");
        String input;
        input = scan.nextLine();

        System.out.println("Enter your name");
        String cus_name = scan.nextLine();

        System.out.println("Enter your number");
        int cus_number = scan.nextInt();

        System.out.println("Enter your email");
        String cus_email = scan.nextLine();

        System.out.println("Enter your address");
        String cus_address = scan.nextLine();

        System.out.println("Enter your gender");
        String cus_gender = scan.next();

        System.out.println("Enter your location");
        String cus_location = scan.next();

        System.out.println("------------CONGRATULATION!! Your registration is successfully completed!!!------------\n\nNow please give some information about your product for courier.\n\n");
        String input1;
        input1 = scan.nextLine();

        String send_product = null;
        int product = 0;
        String product_type = null;
        int product_weight = 0;
//        CourierDetails c = new CourierDetails(product, product_type, product_weight, send_product);
        inputCourierDetails s = new inputCourierDetails();
        s.inputCourierDetails();

        System.out.println("---------------------------OK!! Thanks for your information.---------------------------\n\n----------------------Please wait for a while for your full courier information.---------------------- ");

        String input7;
        input7 = scan.nextLine();

        System.out.println("\n\n************************CUSTOMER'S INFORMATION*******************");

        RegOfCus s1 = new RegOfCus(cus_name, cus_number, cus_email, cus_address, cus_number, cus_gender, cus_location);
        s1.showCusDetails();

        System.out.println("\n\n************************Courier Details************************");

//        CourierDetails s2 = new CourierDetails(product, product_type, product_weight, send_product);
//        s2.showCourierDetails();
    }

}
