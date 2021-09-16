package chap07_practice;

import java.util.Scanner;

public class Q5_chap07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account[] account = new Account[100];
		for(int j=0; j<100;j++) {
			account[j]=new Account("0","0",0);
		}
		int i = 0,key=0;
		while (true) {
			System.out.println("원하시는 메뉴를 입력해주세요");
			System.out.println("계좌개설,은행업무,종료");
			String menu = scan.next();
			switch (menu) {
			case "계좌개설":
				for (int j = 0; j < 100; j++) {
					System.out.println("예금주 성함을 입력해주세요");
					String name = scan.next();
					System.out.println("계좌번호 입력해주세요");
					String account_num = scan.next();
					System.out.println("초기 예금액을 입력해주세요");
					int money = scan.nextInt();
					account[i] = new Account(name, account_num, money);
					i++;
					System.out.println("계좌 개설 완료");
					System.out.println("계속 진행하시겠습니까?\n원하시면 yes 그만하고 싶으시면 아무키나 입력해주세요.\n");
					String a = scan.next();
					if (i >= 100) {
						System.out.println("개설 가능한 계좌 개수를 넘겼습니다.");
					}
					if (a.equals("yes")) {
						continue;
					} else {
						break;
					}

				}
				break;

			case "은행업무":
				System.out.println("계좌번호를 입력해주세요");
				String check = scan.next();
				for (int j = 0; j < 100; j++) {
					if (account[j].account.equals(check)) {
						key=1;
						System.out.printf("안녕하세요 %s고객님\n", account[j].name);
						System.out.println("원하시는 메뉴를 입력해주세요\n예금,출금,잔액조회");
						String bankmenu = scan.next();
						switch (bankmenu) {
						case "예금":
							account[j].money = account[j].deposit();
							break;
						case "출금":
							account[j].money = account[j].withdraw();
							break;
						case "잔액조회":
							System.out.printf("%s고객님 계좌 잔고는 %d원 입니다\n", account[j].name, account[j].money);
							break;
						default:
							System.out.println("입력이 잘못되었습니다.");
						}

					} else if (j == 99 &&key==0) {
						System.out.println("해당 계좌가 없습니다");
						break;
					}
					
				}
				key=0;
				break;
			case "종료" :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			if(menu.equals("종료")) break;

		}

	}

}
