package ksnu.juhyun.grading;

import java.util.Scanner;

public class GradingMenu {
	Scanner Scan = new Scanner(System.in);
	Student Student = new Student();
	StudentRepre Repre = new StudentRepre();
	void Menu() {
		int[] array = {0};
		while (true) {
			this.Print();
			int num = Scan.nextInt();
			switch (num) {
			case 1: array=Student.Input(array); break;
			case 2: Student.List(array); break;
			case 3: Student.Search(array); break;
			case 4: Repre.MaxMin(array); break;
			case 5: Repre.AveMid(array); break;
			case 6: Student.Sort(array); break;
			case 0: return;
			}
		}	
	}
	void Print() {
		System.out.print("<�л� ���� ó�� ���α׷�>\r\n"
				+"1) �л� ���� �Է�\r\n"
				+"2) �ϻ� ��ü ���� ����Ʈ ����\r\n"
				+"3) �л��� ��ȣ�� ���� ����\r\n"
				+"4) ���� �ְ� ����, ���� ���� ����\r\n"
				+"5) ���� ��� ����, ������ ���� ����\r\n"
				+"6) ���� �����ؼ� ����\r\n"
				+"0) ���� �޴��� ���ư�\r\n");
	}
}
