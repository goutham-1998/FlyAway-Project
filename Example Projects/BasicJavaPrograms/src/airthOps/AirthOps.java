package airthOps;
import java.util.Scanner;
public class AirthOps {

	public static void main(String[] args) {
int a,b;
Scanner s = new Scanner(System.in);

System.out.println("Your First number : ");
a=s.nextInt();
System.out.println("Your Second number : ");
b=s.nextInt();

System.out.println("Addition of your two numbers is = "+(a+b));
System.out.println("Subtraction of your two numbers is = "+(a-b));
System.out.println("Multiplication of your two numbers is = "+(a*b));
System.out.println("Division of your two numbers is = "+(a/b));
System.out.println("Modulo of your two numbers is = "+(a%b));
	}

}
