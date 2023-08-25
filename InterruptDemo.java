class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("I got interrupted.");
		}
	}
}

class InterruptDemo
{
	public static void main(String args[]) //throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		
		System.out.println("Main Thread End");
	}
}