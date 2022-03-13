package bankaccount;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		RegularCustomer regCustomer1 = new RegularCustomer("R123","Krishna","Domestic",10000);
		RegularCustomer regCustomer2 = new RegularCustomer("R345","Satish","Business",10000);
		
		EnterpriseCustomer entCustomer1 = new RegularCustomer("E789","Madhu","Small Scale",10000);
		EnterpriseCustomer entCustomer2 = new RegularCustomer("E379","Lahari","Big Scale",10000);
		
		
		regCustomer1.showCustomerDetails();
		System.out.prinntln("Final Amount : "+regCustomer1.get_final_amount(5,8));
		
		regCustomer2.showCustomerDetails();
		System.out.prinntln("Final Amount : "+regCustomer2.get_final_amount(5,8));
		
		
		entCustomer1.showCustomerDetails();
		System.out.prinntln("Final Amount : "+entCustomer1.get_final_amount(5,8));
		
		entCustomer2.showCustomerDetails();
		System.out.prinntln("Final Amount : "+entCustomer2.get_final_amount(5,8));
		

	}

}
