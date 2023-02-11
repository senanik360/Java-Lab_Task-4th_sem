
package Restaurant;

import java.io.*;
import java.util.Scanner;
public class Dessert extends Food{
	
	@Override
	public void displayfood()
	{
	System.out.println("___Welcome to our Dessert section___");
	System.out.println("");
	try{
            	String address = System.getProperty("user.dir"); 
            	FileReader fr = new FileReader(address+"//FoodData//Dessert.txt");
		int i;
		while((i = fr.read())!= -1){ 
			System.out.print((char)i);
		}
		System.out.println("");
		fr.close();	
	}

	catch(Exception e){
		System.out.println(e);
	}

	finally{}
	
	}
	
	
	@Override
	public void displayFoodBill() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter your choice = ");
		System.out.println("To confirm your order press '='");
		char i = '0';
		
		
		while(true) {
			
			i = input.next().charAt(0);
			
			if(i == '=') {
				break;
			}
			
			else if(i == '1') {
				totalBill += 100;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '2') {
				totalBill += 50;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '3') {
				totalBill += 20;
				System.out.println("Amount = "+totalBill);
				
			}
			
			else if(i == '4') {
				totalBill += 30;
				System.out.println("Amount = "+totalBill);
				
			}

			else{
				System.out.println("Invalid input please try again");
			}
			
			
			
		}
		
		System.out.println("Total Bill = "+totalBill);
	}

	
}
