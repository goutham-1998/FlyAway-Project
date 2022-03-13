package arrayminium;

public class Arrayminimum {
static void minimum(int a[])
{
	int value = a[0];
	for (int m=1;m<a.length;m++)
	{
	if(value >a[m])
	{
		value = a[m];
		System.out.println(value);
	}
	}
}
	public static void main(String[] args) {
		int x[] = {90,1,5,7};
		minimum(x);
	}

}
