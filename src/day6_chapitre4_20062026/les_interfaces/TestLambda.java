package day6_chapitre4_20062026.les_interfaces;

public class TestLambda {

	public static void main(String[] args) {
		Prediction prediction = ()->"ocp";
		System.out.println(prediction.test());

	}

}
