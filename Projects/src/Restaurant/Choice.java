
package Restaurant;

import java.util.Scanner;
public class Choice {

	void choiceItem() 
	{
		
	
		
	System.out.println("");
	
		System.out.print("Enter your Choice : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if (choice == 1) {
			Food f1 = new FastFood();//Runtime Poly...Superclass er rfrnc diye subclass er obj cl korsi
			f1.displayfood();
			f1.displayFoodBill();
			
		}
		
		else if(choice == 2) {
			Food c1= new Chinese();
			c1.displayfood();
			c1.displayFoodBill();
		}
		
		else if(choice == 3){
			Food b1 = new BengaliDish();
			b1.displayfood();
			b1.displayFoodBill();
		}
		
		else if(choice == 4){
			Food d1 = new Dessert();
			d1.displayfood();
			d1.displayFoodBill();
		}

		else {
			System.out.println("Invalid input\nPlease try again");
			choiceItem();
		}
	
	
	
	
	
	}
	
	
	
}

