package ksnu.juhyun.midterm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MidtermMenu {
	Scanner scan = new Scanner(System.in);
	MidtermScore Midterm = new MidtermScore();
	public void menu() {
		int number=0;
		int[][] score=new int[3][];
		while (true) {
			printMenu();
			try {
				number=scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.print("오류발생! InputMismatchException!");
			}
			switch (number) {
			case 1: score=Midterm.inputScore(); break;
			case 2: Midterm.printScore(score); break;
			case 3: score=Midterm.editScore(score); break;
			case 4: Midterm.printAverage(score); break;
			case 5: Midterm.printMaxMin(score); break;
			case 0: return;
			}
		}
	}
	void printMenu() {
		System.out.println("<성적처리 프로그램>\r\n"
				+ "1.성적 입력하기(3과목)\r\n"
				+ "2.성적 보기\r\n"
				+ "3.성적 수정하기\r\n"
				+ "4.평균 성적 보기\r\n"
				+ "5.최고/최저 성적보기\r\n"
				+ "0.메인메뉴 돌아가기");
	}
}
