package day10_16082026;

public class Application {

	public static void main(String[] args) {
		System.out.println("Begin  : "+ Thread.currentThread().getName());
		
		Thread t1 = new Thread(new ProcessusEmail());
		t1.start(); //  elle va exécuter la task run()
		
		
		Thread t2 = new Thread(new ProcessSMS());
		t2.start(); //  elle va exécuter la task run()
		
		
		System.out.println("End  : "+ Thread.currentThread().getName());

	}

}
