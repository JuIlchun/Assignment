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
				System.out.print("�����߻�! InputMismatchException!");
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
		System.out.println("<����ó�� ���α׷�>\r\n"
				+ "1.���� �Է��ϱ�(3����)\r\n"
				+ "2.���� ����\r\n"
				+ "3.���� �����ϱ�\r\n"
				+ "4.��� ���� ����\r\n"
				+ "5.�ְ�/���� ��������\r\n"
				+ "0.���θ޴� ���ư���");
	}
}
