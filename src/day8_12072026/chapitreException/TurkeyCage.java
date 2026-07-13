package day8_12072026.chapitreException;

//import java.io.Closeable;

public class TurkeyCage implements AutoCloseable {
	public void close() {
		System.out.println("Close gate");
	}

	public static void main(String[] args) {
		try (TurkeyCage t = new TurkeyCage()) {
			System.out.println("put turkeys in");
		}// finally implicite qui a exécuté la méthode close
	}
}
