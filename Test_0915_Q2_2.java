package Test_0915_Q1;

import java.util.Scanner;

public class Test_0915_Q2_2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("출력하고자 하는 단을 입력하세요.");
		int x= scan.nextInt();
		int i=1;
		do{
			System.out.printf("%dX%d = %d\n", x,i,x*i);
			i++;
		}while(i!=10);
	}

}
