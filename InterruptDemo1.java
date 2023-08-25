class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10000;i++)
		{
			System.out.println("Child Thread -" +i);
		}
		System.out.println("I am going for sleeping ");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("I got interrupted");
		}
	}
}

class InterruptDemoOne
{
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		t.start();
		//t.interrupt();
		
		System.out.println("End of Main Thread");
	}
}