/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		//Voucher code FoodKing321
		Choice c1 = new Choice();
		Names n1 = new Names();
		n1.DisplayDetail();
		c1.choiceItem();
		VoucherCode vc=new VoucherCode();
		vc.displayVoucher();
		
	}
	
}
