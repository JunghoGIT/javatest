package chap07_practice;

public class Q2_chap07 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name="���浿";
		student1.ban=3;
		student1.no=17;
		student1.kor=92;
		student1.eng=63;
		student1.math=74;
		
		System.out.println("�̸� : "+student1.name);
		System.out.println("���� : "+student1.getTotal());
		System.out.println("�̸� : "+student1.getAverage());

	}

}