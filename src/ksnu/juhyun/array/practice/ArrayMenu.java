package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class ArrayMenu {
	Scanner scan = new Scanner(System.in);
	void print() {
		System.out.print("o �迭 �������� Ǯ��\r\n"
				+ "1) �������� 8��\r\n"
				+ "2) �������� 10��\r\n"
				+ "3) �������� 16��\r\n"
				+ "0) ����(�� ȭ������ ���ư���)\r\n");
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
