package synchronization;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		Display d1=new Display();
		Display d2=new Display();
		MyThread1 t1=new MyThread1(d1);
		MyThread2 t2=new MyThread2(d2);
		t1.start();
		t2.start();
		
	}

}
