package threads;

class ThreadRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread()+ " : "+i);
			
		}
	}
}
public class ThreadExamp1 {

	public static void main(String[] args) {
		Runnable runnableobj = new ThreadRunnable();
		Thread t1 = new Thread(runnableobj);
		Thread t2 = new Thread(runnableobj);
		t1.start();
		
		t2.start();

	}

}
