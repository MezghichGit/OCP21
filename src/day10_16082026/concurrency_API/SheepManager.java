package day10_16082026.concurrency_API;

import java.util.concurrent.*;

public class SheepManager {

    private int sheepCount = 0;

    private synchronized void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
        //Lecture de la mémoire de sheepCount
        //Ecrire en mémoire 
        //Puis affichage sur la console
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(4); // 4 employers
            SheepManager manager = new SheepManager();

            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.incrementAndReport());
            }

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}