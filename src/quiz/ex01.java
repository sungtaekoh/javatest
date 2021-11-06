package quiz;

import java.util.Scanner;

//백준
public class ex01 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,b =0;
	
	System.out.println("숫자를 입력하세요 : ");
	a = input.nextInt();
	System.out.println("숫자를 입력하세요 : ");
	b = input.nextInt();
	
	System.out.println("합계 : "+(a+b) );
	
	}
}
