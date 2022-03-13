package foreach;

public class Foreachexam {

	public static void main(String[] args) {
		int a[] = {20,30,40,50};
		int sum = 0;
		for (int x: a)
		{
			sum = sum + x;
			System.out.println(sum);
		}

	}

}
