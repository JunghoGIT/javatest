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
			System.out.println("���Ͻô� �޴��� �Է����ּ���");
			System.out.println("���°���,�������,����");
			String menu = scan.next();
			switch (menu) {
			case "���°���":
				for (int j = 0; j < 100; j++) {
					System.out.println("������ ������ �Է����ּ���");
					String name = scan.next();
					System.out.println("���¹�ȣ �Է����ּ���");
					String account_num = scan.next();
					System.out.println("�ʱ� ���ݾ��� �Է����ּ���");
					int money = scan.nextInt();
					account[i] = new Account(name, account_num, money);
					i++;
					System.out.println("���� ���� �Ϸ�");
					System.out.println("��� �����Ͻðڽ��ϱ�?\n���Ͻø� yes �׸��ϰ� �����ø� �ƹ�Ű�� �Է����ּ���.\n");
					String a = scan.next();
					if (i >= 100) {
						System.out.println("���� ������ ���� ������ �Ѱ���ϴ�.");
					}
					if (a.equals("yes")) {
						continue;
					} else {
						break;
					}

				}
				break;

			case "�������":
				System.out.println("���¹�ȣ�� �Է����ּ���");
				String check = scan.next();
				for (int j = 0; j < 100; j++) {
					if (account[j].account.equals(check)) {
						key=1;
						System.out.printf("�ȳ��ϼ��� %s����\n", account[j].name);
						System.out.println("���Ͻô� �޴��� �Է����ּ���\n����,���,�ܾ���ȸ");
						String bankmenu = scan.next();
						switch (bankmenu) {
						case "����":
							account[j].money = account[j].deposit();
							break;
						case "���":
							account[j].money = account[j].withdraw();
							break;
						case "�ܾ���ȸ":
							System.out.printf("%s���� ���� �ܰ�� %d�� �Դϴ�\n", account[j].name, account[j].money);
							break;
						default:
							System.out.println("�Է��� �߸��Ǿ����ϴ�.");
						}

					} else if (j == 99 &&key==0) {
						System.out.println("�ش� ���°� �����ϴ�");
						break;
					}
					
				}
				key=0;
				break;
			case "����" :
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default :
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			if(menu.equals("����")) break;

		}

	}

}
