package chap07_practice;

public class Q3_chap07 {
	public static void main(String[] args) {
		Circle[] circle = new Circle[5];
		for (int i = 0; i < 5; i++) {
			circle[i] = new Circle(i);
			System.out.printf("������%d\t���� ���� : %d\n", i, circle[i].area);
		}

	}

}
