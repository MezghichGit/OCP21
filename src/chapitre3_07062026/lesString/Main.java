package chapitre3_07062026.lesString;

public class Main {

	public static void main(String[] args) {
		String name1 = "Fluffy";  // Pooling
		String name2 = new String("Fluffy");  // Heap
		String name3 = "Fluffy"; // Pooling
		
		System.out.println(name1==name2);  //false
		System.out.println(name1==name3);  //true
		System.out.println("====");
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equals(name3)); //true
		
		String temp = "\t abc \n";
		String temp2 = "abc";
		System.out.println(temp.trim());
		System.out.println(temp2);

	}

}
