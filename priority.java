class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
	}


}

class DemoThread
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(8);
		
		MyThread t=new MyThread();
		
		System.out.println(t.getPriority());
	}
}