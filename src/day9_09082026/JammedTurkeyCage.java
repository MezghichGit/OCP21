package day9_09082026;

public class JammedTurkeyCage implements AutoCloseable {

	String id;

	public void close() throws IllegalStateException {
		System.out.println(this.id);
		throw new IllegalStateException("Cage door does not close : " + this.id); // ex2

	}

	public JammedTurkeyCage(String t) {
		this.id = t;
	}

	public static void main(String[] args) {

		/*try (JammedTurkeyCage t = new JammedTurkeyCage("t")) {
			throw new IllegalArgumentException("turkeys ran off");}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		 finally {
			throw new RuntimeException("and we couldn't find them");
		}*/

		/*
		 * try (JammedTurkeyCage t1 = new JammedTurkeyCage("t1"); JammedTurkeyCage t2 =
		 * new JammedTurkeyCage("t2")) { System.out.println("turkeys entered cages"); }
		 * catch (IllegalStateException e) { System.out.println("caught: " +
		 * e.getMessage()); for (Throwable t : e.getSuppressed())
		 * System.out.println(t.getMessage()); }
		 */
		
		  try (JammedTurkeyCage t = new JammedTurkeyCage("t")) { 
			  throw new RuntimeException("turkeys ran off"); 
			  } 
		  catch (IllegalStateException e) {
		  System.out.println("caught: " + e.getMessage()); }
		 

		/*
		 * try (JammedTurkeyCage t = new JammedTurkeyCage()) { throw new
		 * IllegalStateException("turkeys ran off"); // ex1 } catch
		 * (IllegalStateException e) { System.out.println("caught: " + e.getMessage());
		 * 
		 * for (Throwable t : e.getSuppressed()) System.out.println(t.getMessage()); }
		 */
		/*
		 * try (JammedTurkeyCage t = new JammedTurkeyCage()) {
		 * System.out.println("put turkeys in"); }// appel au bloc close implicitement
		 * catch (IllegalStateException e) { System.out.println("caught: " +
		 * e.getMessage()); }
		 */
	}
}