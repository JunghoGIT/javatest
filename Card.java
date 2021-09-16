package chap07_practice;

public class Card {
	int a = 1;
	boolean b = true;
	String c;

	Card(int a, boolean b) {
		this.a = a;
		this.b = b;
	}

	Card() {

	}

	public String info() {
		if (b) {
			c = "" + a + "k";
			return c;
		} else {
			c = "" + a;
			return c;
		}

	}

}
