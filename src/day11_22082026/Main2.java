package day11_22082026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
    	long start = System.nanoTime();
        //try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
    	try (ExecutorService executor = Executors.newFixedThreadPool(1000)) {
            for (int i = 1; i <= 1000; i++) {
                int taskId = i;

                executor.submit(() -> {
                	Thread.sleep(1000);// block ==> unmount
                    System.out.println("Traitement de la tâche " + taskId);
                    
                    return taskId;
                });
            }

        }
    	long end = System.nanoTime();

        long duration = end - start;

        System.out.println("Temps d'exécution : "
                + duration / 1_000_000 + " ms");
    }
}
