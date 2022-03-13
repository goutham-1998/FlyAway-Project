package methodOverloading;

class sum1
{
	static int add (int x, int y)
	{
	return x+y;
}
	static double add(double x,double y,double z)
	{
		return x+y+z;
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		System.out.println(sum1.add(40, 50));
		System.out.println(sum1.add(20, 40, 10));

	}

}
