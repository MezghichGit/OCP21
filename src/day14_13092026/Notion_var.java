package day14_13092026;

public class Notion_var {

	public void doesThisCompile(boolean check) {
	    var question;
	    question = 1;

	    var answer;

	    if (check) {
	        answer = 2;
	    } else {
	        answer = 3;
	    }

	    System.out.println(answer);
	}
	
	public void twoTypes() {
	    int a, var b = 3;   // DOES NOT COMPILE
	    var n = null;       // DOES NOT COMPILE
	}
	public static void main(String[] args) {
		var o = (String)null;

	}

}
