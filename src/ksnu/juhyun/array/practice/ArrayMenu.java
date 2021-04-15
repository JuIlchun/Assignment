package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class ArrayMenu {
	Scanner scan = new Scanner(System.in);
	void print() {
		System.out.print("o 배열 연습문제 풀기\r\n"
				+ "1) 연습문제 8번\r\n"
				+ "2) 연습문제 10번\r\n"
				+ "3) 연습문제 16번\r\n"
				+ "0) 종료(앞 화면으로 돌아가기)\r\n");
	}
	void menu() {
		while(true)
		{
			this.print();
			int num = scan.nextInt();
			switch (num) {
				case 1:
					Practice8 Practice8 = new Practice8();
					Practice8.eight();
					break;
				case 2:
					Practice10 Practice10 = new Practice10();
					Practice10.ten();
					break;
				case 3:
					Practice16 Practice16 = new Practice16();
					Practice16.sixteen();
					break;
				case 0: return;
			}
		}
	}
}
