package chap07_practice;

public class Circle {
	int half;
	int area;
	double pi = 3.14;

	Circle(int half) {
		this.half = half;
		area = (int) (half * half * pi);

	}

}
