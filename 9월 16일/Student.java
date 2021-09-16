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
		System.out.println("이름 : " + name);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + no);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
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
