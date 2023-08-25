class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
	}
}

class ThreadDemo1
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Medhaj");
		System.out.println(Thread.currentThread().getName());
	}
}