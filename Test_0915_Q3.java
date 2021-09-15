package Test_0915_Q1;

import java.util.Scanner;

public class Test_0915_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영화관 좌석 갯수를 입력해주세요.");
		int index = scan.nextInt();
		int[] seat = new int[index];
		int money = 0;
		String menu;
		System.out.println("영화 예매 프로그램 시작");

		while (true) {
			System.out.println("원하시는 메뉴를 입력해주세요.");
			System.out.println("<예매 , 종료>");
			menu = scan.next();
			switch (menu) {
			case "예매":
				System.out.printf("1번에서 %d번 중 원하시는 자리를 선택해주세요\n", seat.length);
				System.out.println("자리 예약 현황은 다음과 같습니다.\n(0=빈자리 1=예약된 자리)");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				int ticketnum = scan.nextInt();
				if (seat[ticketnum - 1] == 0) {
					seat[ticketnum - 1] = 1;
					System.out.println("예약이 완료되었습니다.");
					money += 12000;
				} else {
					System.out.println("해당 자리를 예약이 불가능합니다.");
				}
				break;

			case "종료":
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
			if (menu.equals("종료")) {
				break;
			}

		}
		System.out.printf("총 매출 금액은 : %d원 입니다\n", money);

	}

}
