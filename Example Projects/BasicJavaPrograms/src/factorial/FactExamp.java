package factorial;
import java.util.Scanner;

public class FactExamp {

	public static void main(String[] args) {
		
		int num;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your number = ");
		num=s.nextInt();
		
		int fact_var = 1;
		for (int i=1;i<=num;i++)
		{
			fact_var=fact_var*i;
			
			
		}
		System.out.println("The factorial of "+num+" is "+fact_var);
	}

}
