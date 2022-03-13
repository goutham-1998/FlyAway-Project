package forexamp;

public class Foreg {

	public static void main(String[] args) {
		label1 : for (int a=1;a<=3;a++)
		{
			label2 : for (int b=1;b<=3;b++)
			{
				if(a == 2 && b==2)
				{
					break label2;
				}
				System.out.println(a+" "+b);
			}
		}

	}

}
