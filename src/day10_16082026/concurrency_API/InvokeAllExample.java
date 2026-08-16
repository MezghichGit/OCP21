package day10_16082026.concurrency_API;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(3000);
                    return "Résultat de la tâche 1";
                },

                () -> {
                    Thread.sleep(1000);
                    return "Résultat de la tâche 2";
                },

                () -> {
                    Thread.sleep(2000);
                    return "Résultat de la tâche 3";
                }
        );

        // Exécute toutes les tâches en parallèle
        List<Future<String>> results = executor.invokeAll(tasks);

        // invokeAll attend que TOUTES les tâches soient terminées
        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}