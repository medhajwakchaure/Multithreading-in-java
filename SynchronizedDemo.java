class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good morning :");
		
		    try
		    {
		        Thread.sleep(2000);
		    }
		    catch(InterruptedException ie)
		    {
			   
		    }   
			 System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}

class SynchronizedDemo
{
	public static void main(String args[])
	{
		Display d=new Display();
		
		MyThread t1=new MyThread(d,"Medhaj");
		
		
		MyThread t2=new MyThread(d,"Shubham");
		
		
		MyThread t3=new MyThread(d,"Tanmay");
		
		
		MyThread t4=new MyThread(d,"Mahesh");
		
		t4.setPriority(10);
		t2.setPriority(9);
		t1.setPriority(8);
        t3.setPriority(7);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}