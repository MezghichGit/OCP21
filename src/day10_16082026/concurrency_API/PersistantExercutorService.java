package day10_16082026.concurrency_API;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PersistantExercutorService {

	static ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	
	static void killScheduledExecutorService() {
		if (service != null)
			service.shutdown();
	}
	public static void main(String[] args) {
		
		// if click sur le bouton quitter lancer la méthode killScheduledExecutorService()
		
		Runnable task = ()->System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDateTime.now());
		service.scheduleAtFixedRate(task, 5, 2, TimeUnit.SECONDS);

	}

}
