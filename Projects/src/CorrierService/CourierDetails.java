
package CorrierService;

import java.util.Scanner;

public class CourierDetails extends inputCourierDetails {
	int product ;
	String product_type;
	int product_weight;
	String send_product;
	
//	public CourierDetails(int product, String product_type, int product_weight, String send_product) {
//		this.product = product;
//		this.product_type = product_type;
//		this.product_weight = product_weight;
//		this.send_product = send_product;
//	}
	
	
	void showCourierDetails() {
		System.out.println("Product Material : " + super.getProduct());
		System.out.println("Product Type : " + product_type);
		System.out.println("Product Weight : " + product_weight + "KG");
		System.out.println("Product Send Location : " + send_product);
	}

}

