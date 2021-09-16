package chap07_practice;

public class Q3_chap07 {
	public static void main(String[] args) {
		Circle[] circle = new Circle[5];
		for (int i = 0; i < 5; i++) {
			circle[i] = new Circle(i);
			System.out.printf("반지름%d\t원의 넓이 : %d\n", i, circle[i].area);
		}

	}

}
