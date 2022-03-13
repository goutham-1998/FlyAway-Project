package quiz;
import java.util.Scanner;

public class QuizProgram {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
	System.out.println("Who is the Prime Minister of India ?");
	System.out.println("1. Narendra Modi\n2. Rahul Gandhi\n3. KCR\n4. Jagan Mohan Reddy\n5. EXIT");
	
	while(true)
	{
	System.out.println("Enter Your Choice : ");
	n = s.nextInt();
	
	if (n ==1) {
		System.out.println("You've Won The Quiz");
		break;
	}
	else if (n == 5)
	{
		break;
	}
	else if (n>5)
	{
		System.out.println("Please Choose The Options In Between 1/2/3/4/5\n");
	}
	else {
		System.out.println("OOPS!!!!Your Choice Is Wrong\n");
	}

	}
	}
}
