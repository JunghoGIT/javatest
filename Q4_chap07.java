package chap07_practice;

import java.util.Scanner;

public class Q4_chap07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Book[] book = new Book[2];

		for (int i = 0; i < 2; i++) {
			System.out.print("제목>>");
			String title = scan.nextLine();
			System.out.print("저자>>");
			String writer = scan.nextLine();
			book[i] = new Book(title, writer);
		}
		System.out.printf("(%s,%s)", book[0].title, book[0].writer);
		System.out.printf("(%s,%s)", book[1].title, book[1].writer);

	}

}
