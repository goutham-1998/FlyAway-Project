package methodexamp1;

public class MethodExamp1 {
	public int multiplynumbers(int a,int b)
	{
		int z = a*b;
		return z;
	}

	public static void main(String[] args) {
		
		MethodExamp1 c = new MethodExamp1();
		int res = c.multiplynumbers(4,5);
		System.out.println("The multiplication of two numbers is "+res);
		
		

	}

}
