package Test_0915_Q1;

public class Test_0915_Q2_1 {

	public static void main(String[] args) {
		int i = 2;

		while (i != 10) {
			System.out.println(i+"´Ü Ãâ·Â");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%dX%d = %d\n", i, j, i * j);
			}
			i++;
			System.out.println();
		}
	}

}
