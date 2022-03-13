package stackexamp;
import java.util.Stack;
import java.util.Scanner;

public class Stackexamp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack <String>();
		
		//adding elements to the stack
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Fourth");
		stack.push("Fifth");
		
		System.out.println("Initial Stack is : " + stack);
		
		System.out.println("Enter a String to check :");
		String usr_string =sc.next(); 
		
		//Checking the string if present or not
		if(stack.search(usr_string) != -1)
		{
			System.out.println("Given String "+usr_string+" Exists in the Stack");
		}
		else
		{
			System.out.println("Given String "+usr_string+" Doesn't exist in the Stack");
		}
		
		//getting top element of the stack
		System.out.println("The top element in the stack is : "+stack.peek()); 
		
		//removing elemenyts from the stack
				while(!stack.empty())
		{
			stack.pop();
			System.out.println("Stack after popping the elements is : "+stack);
			
		}
		
				
		
	}

}
