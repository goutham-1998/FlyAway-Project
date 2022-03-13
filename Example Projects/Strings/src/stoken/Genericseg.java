package stoken;


class Test <T>
{
	T obj;
	Test(T obj)
	{
		this.obj=obj;
	}
	public T getObject() {
		return this.getObject();
	}
}

public class Genericseg {

	public static void main(String[] args) {
		
		
		Test <Integer> jobj = new Test <Integer> (15);
		System.out.println(jobj.getObject());
		Test <String> mObj = new Test <String> ("Hello World!!!");
		System.out.println(mObj.getObject());

	}

}
