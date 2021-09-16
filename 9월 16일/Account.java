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
		System.out.println("예금 할 금액을 입력해주세요");
		int temp=scan.nextInt();
		System.out.printf("%d원 예금 완료\n\n",temp);
		money+=temp;
		return money;
	}
	public int withdraw() {
		System.out.println("출금 할 금액을 입력해주세요");
		int temp=scan.nextInt();
		if(money-temp>0) {
		System.out.printf("%d원 출금 완료\n\n",temp);
		money-=temp;
		}
		else System.out.println("출금액이 현재 잔고보다 많습니다.");
		return money;
	}

}
