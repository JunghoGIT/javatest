package chap07_practice;

import java.util.Scanner;

public class Q7_chap07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());

		scan.close();
	}
}