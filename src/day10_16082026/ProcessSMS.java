package day10_16082026;

public class ProcessSMS implements Runnable{

	
	public void initSMSSender()
	{
		System.out.println("SMS init...");
	}
	@Override
	public void run() {
		for(int i=0;i<100; i++)
		{
		  System.out.println("SMS Sending... : " + i);
		}
		
	}

}
