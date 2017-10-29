public class ThreadEg extends Thread
{
	public void run()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			System.out.println("Even : "+i);
		}
	}

	public static void main(String[] args) 
	{
		ThreadEg ob = new ThreadEg();
		ob.start();
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			System.out.println("Odd : "+i);
		}
		
	}
}