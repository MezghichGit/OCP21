package day10_16082026;

public class ProcessusEmail implements Runnable{

	
	public void initEmailSender()
	{
		System.out.println("Email init...");
	}
	@Override
	public void run() {
		for(int i=0;i<100; i++)
		{
		  System.out.println("Email Sending... : " + i);
		}
		
	}

}
