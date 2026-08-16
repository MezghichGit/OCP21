package day10_16082026.concurrency_API;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CheckResults {
	Supplier<Integer>s;

    private static int counter = 0;

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            /*Future<?> result = service.submit(() -> {    //Runnable
                for (int i = 0; i < 500; i++)
                    CheckResults.counter++;
            });*/
            
            Future<Double> result = service.submit( () -> {return Math.random();});  // Callable

            System.out.println(result.get(2, TimeUnit.SECONDS));

            System.out.println("Reached!");

        } catch (TimeoutException e) {
            System.out.println("Not reached in time");

        } finally {
            if (service != null)
                service.shutdown();
        }
    }
}