
package CorrierService;

public class RegOfCus {
	private String cus_name;
	private int cus_number;
	private String cus_email;
	private String cus_address;
	private String cus_gender;
	private String cus_location;
	
	public RegOfCus(String cus_name, int cus_num, String cus_email, String cus_address, int cus_number, String cus_gender, String cus_location) {
		this.cus_name = cus_name;
		this.cus_number = cus_number;
		this.cus_email = cus_email;
		this.cus_address = cus_address;
		this.cus_gender = cus_gender;
		this.cus_location = cus_location;
	}
	
	public String getcus_name() {
		return cus_name;
	}
	
	public void setcus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	
	public int getcus_number() {
		return cus_number;
	}
	
	public void setcus_name(int cus_number) {
		this.cus_number = cus_number;
	}
	
	public String getcus_email() {
		return cus_email;
	}
	
	public void setcus_email(String cus_email) {
		this.cus_email = cus_email;
	}
	
	public String getcus_address() {
		return cus_address;
	}
	
	public void setcus_address(String cus_address) {
		this.cus_address = cus_address;
	}
	
	public String getcus_gender() {
		return cus_gender;
	}
	
	public void setcus_gender(String cus_gender) {
		this.cus_gender = cus_gender;
	}
	
	public String getcus_location() {
		return cus_location;
	}
	
	public void setcus_location(String cus_location) {
		this.cus_location = cus_location;
	}
	
	void showCusDetails() {
		System.out.println("Customer's Name : " + cus_name);
		System.out.println("Customer's Number : " + cus_number);
		System.out.println("Customer's Email : " + cus_email);
		System.out.println("Customer's Address : " + cus_address);
		System.out.println("Customer's Gender : " + cus_gender);
		System.out.println("Customer's Location : " + cus_location);
	}
}
