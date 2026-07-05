package day7_05072026;

class GorillaFamily {
	String walk = "walk";

	void everyonePlay(boolean baby) {
		String approach = "amble"; // effectively final
		 //approach = "run";
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}

	void play(Gorilla g) {
		System.out.println(g.move());
	}

}
