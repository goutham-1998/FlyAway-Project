package stoken;
import java.util.StringTokenizer;

public class Stoken1 {

	public static void main(String[] args) {
		
		StringTokenizer St1 = new StringTokenizer("My name is Goutham");
		while (St1.hasMoreTokens())
		{
			System.out.println(St1.nextToken());
		}
			

	}

}
