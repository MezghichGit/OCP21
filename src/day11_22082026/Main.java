package day11_22082026;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            Thread.startVirtualThread(() -> {
                System.out.println("Tâche " + taskId + " exécutée par " 
                        + Thread.currentThread());
            });
        }

        Thread.sleep(1000);
    }
}
