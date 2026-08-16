package day10_16082026.concurrency_API;

import java.util.concurrent.*;

public class ZooInfo {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println(Thread.currentThread().getName() + " : begin");
			service.execute(() -> System.out.println(Thread.currentThread().getName() + " Printing zoo inventory 1"));
			service.execute(() -> {
				for (int i = 0; i < 3; i++)
					System.out.println(Thread.currentThread().getName() + " Printing record: " + i);
			});
			service.execute(() -> System.out.println(Thread.currentThread().getName() + " Printing zoo inventory 2"));
			System.out.println(Thread.currentThread().getName() + " : end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
