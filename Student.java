package chap07_practice;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	Student() {

	}

	public void info() {
		int sum = getTotal();
		float avg = getAverage();
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + ban);
		System.out.println("��ȣ : " + no);
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

	public int getTotal() {
		int sum = 0;
		sum = kor + eng + math;
		return sum;

	}

	public float getAverage() {
		float avg = 0;
		int sum = getTotal();
		avg = (float) sum / 3;
		return avg;

	}

}
