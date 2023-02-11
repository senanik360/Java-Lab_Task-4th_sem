
package CorrierService;

import java.util.Scanner;

public class inputCourierDetails {
    
    private  int product,product_weight;

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(int product_weight) {
        this.product_weight = product_weight;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getInput3() {
        return input3;
    }

    public void setInput3(String input3) {
        this.input3 = input3;
    }

    public String getInput5() {
        return input5;
    }

    public void setInput5(String input5) {
        this.input5 = input5;
    }

    public String getInput6() {
        return input6;
    }

    public void setInput6(String input6) {
        this.input6 = input6;
    }
            private String input2,product_type,input3,input5,input6;
	

void inputCourierDetails() {
		
		System.out.println("Where do you want to send your product \n1. In side Bangladesh\n2. Outside Bangladesh\n\nEnter your choice : (1/2)");
		Scanner r4 = new Scanner (System.in);
		int input4;
		input4 = r4.nextInt();
		if(input4 == 1) {
			System.out.println("Thanks for courier your product to courier in side Bangladesh from DHL Courier Service");	
		}
		else {
			System.out.println("Thanks for courier your product to courier outside Bangladesh from DHL Courier Service");
		}
		
		
		System.out.println("How many product do you want to courier at a time?");
		Scanner in = new Scanner (System.in);

		int product = in.nextInt();
                setProduct(product);
		if(product > 10) {
			System.out.println("You have to pay extra charge for more than 10 products\n");
		}
		
		Scanner r2 = new Scanner (System.in);
		String input2;
		input2 = r2.nextLine();
		
		System.out.println("What kind of product do you want to courier");
		Scanner in1 = new Scanner (System.in);
		String product_type = in.nextLine();
		
		Scanner r3 = new Scanner (System.in);
		String input3;
		input3 = r3.nextLine();
		
		System.out.println("Enter your product weight : ");
		Scanner in2 = new Scanner (System.in);
		int product_weight = in.nextInt();
		
		Scanner r5 = new Scanner (System.in);
		String input5;
		input5 = r5.nextLine();
		
		System.out.println("Enter location where you want to send product : ");
		Scanner in3 = new Scanner (System.in);
		String send_product = in.nextLine();
		
		Scanner r6 = new Scanner (System.in);
		String input6;
		input6 = r6.nextLine();
	}

}
