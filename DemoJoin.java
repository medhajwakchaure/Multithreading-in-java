class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seeta Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				
			}
		}
	}
}

class DemoJoin
{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.join(1000);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
