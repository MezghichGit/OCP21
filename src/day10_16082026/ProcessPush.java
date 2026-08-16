package day10_16082026;

public class ProcessPush extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<100; i++)
		{
		  System.out.println("Push notif Sending... : " + i);
		}
		
	}

}
