package Test_0915_Q1;

import java.util.Scanner;

public class Test_0915_Q2_3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("출력하고자 하는 단을 입력하세요.\n>");
		int x =scan.nextInt();
		System.out.println("출력하고자 하는 데이터를 입력하세요.\n>");
		int y =scan.nextInt();
		
		for (int i=0; i<10; i+=y) {
			if(i!=0) {
			System.out.printf("%dX%d= %d\n",x,i,x*i);
			}
		}
		
	}

}
