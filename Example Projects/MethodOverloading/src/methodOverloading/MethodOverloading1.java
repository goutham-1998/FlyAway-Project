package methodOverloading;

class sum {
	static int add(int x, int y)
	{
		return x+y;
	}
	static int add(int x , int y , int z)
	
	{
	return x+y+z;
}
}
	
public class MethodOverloading1 {

	public static void main(String[] args) {
		System.out.println(sum.add(10,20));
		System.out.println(sum.add(10,24,55));

	}
}

