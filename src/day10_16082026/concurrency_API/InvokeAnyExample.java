package day10_16082026.concurrency_API;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyExample {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(

                () -> {
                    Thread.sleep(3000);
                    return "Réponse du serveur 1";
                },

                () -> {
                    Thread.sleep(1000);
                    return "Réponse du serveur 2";
                },

                () -> {
                    Thread.sleep(2000);
                    return "Réponse du serveur 3";
                }
        );

        // Retourne le premier résultat disponible
        String result = executor.invokeAny(tasks);

        System.out.println(result);

        executor.shutdown();
    }
}
