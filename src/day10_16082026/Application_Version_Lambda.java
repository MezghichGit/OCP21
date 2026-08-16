package day10_16082026;

public class Application_Version_Lambda {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Email Sending... : " + i);
			}
		};
		
		Runnable task2 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("SMS Sending... : " + i);
			}
		};
		
		Thread t1 = new Thread(task1);
		t1.start();
		
		Thread t2 = new Thread(task2);
		t2.start();
		
		ProcessPush p = new ProcessPush();
		p.start();

	}

}
