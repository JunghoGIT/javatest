package chap07_practice;

import java.util.Scanner;

public class Account {
	static Scanner scan =new Scanner(System.in);
	String name;
	int money;
	String account;
	
	Account(String name,String account,int money){
		this.name=name;
		this.account=account;
		this.money=money;
	}
	
	public int deposit() {
		System.out.println("���� �� �ݾ��� �Է����ּ���");
		int temp=scan.nextInt();
		System.out.printf("%d�� ���� �Ϸ�\n\n",temp);
		money+=temp;
		return money;
	}
	public int withdraw() {
		System.out.println("��� �� �ݾ��� �Է����ּ���");
		int temp=scan.nextInt();
		if(money-temp>0) {
		System.out.printf("%d�� ��� �Ϸ�\n\n",temp);
		money-=temp;
		}
		else System.out.println("��ݾ��� ���� �ܰ��� �����ϴ�.");
		return money;
	}

}
