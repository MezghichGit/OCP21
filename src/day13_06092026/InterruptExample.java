package day13_06092026;

class Example extends Thread {

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is going to sleep...");
			Thread.sleep(5000); // The thread enters a TIMED_WAITING state
			System.out.println(Thread.currentThread().getName() + " woke up normally.");
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " was interrupted!");
		}
	}
}

public class InterruptExample {
	public static void main(String[] args) {

		Example thread = new Example();
		thread.start();
		// Interrupt the thread after 2 seconds
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
		// Interrupting the sleeping thread
	}

}
