/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectricityBill;

//import mainpackage.*;
public class FirstMenu {

    FirstMenu() {
        System.out.println("  Wellcome to Electricity Billing System  ");
    }

    public static void main(String[] args) {
        SecondMenu Smenu = new SecondMenu();
        Smenu.ELectricityMenu();
    }
}
