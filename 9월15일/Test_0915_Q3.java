package Test_0915_Q1;

import java.util.Scanner;

public class Test_0915_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȭ�� �¼� ������ �Է����ּ���.");
		int index = scan.nextInt();
		int[] seat = new int[index];
		int money = 0;
		String menu;
		System.out.println("��ȭ ���� ���α׷� ����");

		while (true) {
			System.out.println("���Ͻô� �޴��� �Է����ּ���.");
			System.out.println("<���� , ����>");
			menu = scan.next();
			switch (menu) {
			case "����":
				System.out.printf("1������ %d�� �� ���Ͻô� �ڸ��� �������ּ���\n", seat.length);
				System.out.println("�ڸ� ���� ��Ȳ�� ������ �����ϴ�.\n(0=���ڸ� 1=����� �ڸ�)");
				for (int i = 0; i < seat.length; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();
				int ticketnum = scan.nextInt();
				if (seat[ticketnum - 1] == 0) {
					seat[ticketnum - 1] = 1;
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					money += 12000;
				} else {
					System.out.println("�ش� �ڸ��� ������ �Ұ����մϴ�.");
				}
				break;

			case "����":
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
			}
			if (menu.equals("����")) {
				break;
			}

		}
		System.out.printf("�� ���� �ݾ��� : %d�� �Դϴ�\n", money);

	}

}
