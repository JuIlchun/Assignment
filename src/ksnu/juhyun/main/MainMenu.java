package ksnu.juhyun.main;

import ksnu.juhyun.midterm.MidtermMenu;
import ksnu.juhyun.report07.DataBaseManager;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;
import ksnu.juhyun.report08.Library;
import ksnu.juhyun.report09.InOutLibrary;

import java.util.Scanner;

public class MainMenu {
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		MainMenu MainMenu = new MainMenu();
		Person[] people = {};
		Book[] books = new Book[1000];//��ü �迭 ����
		int number=0;
		while (true)
		{
			MainMenu.print();
			number=Scan.nextInt();
			switch(number)
			{
			case 0:
				Scan.close();
				return;
			case 1:
				Coffee Coffee = new Coffee();
				Coffee.choose();
				break;
			case 2:
				Average Average = new Average();
				Average.getAverage();
				break;
			case 3:
				AtoZ AtoZ = new AtoZ();
				AtoZ.printAtoZ();
				break;
			case 4:
				Sum Sum = new Sum();
				Sum.printSum();
				break;
			case 5:
				Print99 Print99 = new Print99();
				Print99.run99();
				break;
			case 6:
				Multipl Multipl = new Multipl();
				Multipl.ChooseMultipl();
				break;
			case 7:
				GradingMenu GradingMenu = new GradingMenu();
				GradingMenu.Menu();
				break;
			case 8:
				ArrayMenu ArrayMenu = new ArrayMenu();
				ArrayMenu.menu();
				break;
			case 9:
				MidtermMenu MidtermMenu = new MidtermMenu();
				MidtermMenu.menu();
				break;
			case 10:
				DataBaseManager DBManager = new DataBaseManager();
				people=DBManager.mainMenu(people);
				break;
			case 11:
				Library Library = new Library();
				books=Library.LibraryMenu(books);
				break;
			case 12:
				InOutLibrary InOutLibrary = new InOutLibrary();
				InOutLibrary.libraryMenu(people,books);
			}
		}
	}

	void print() {
		System.out.println("o ������ ���α׷��� �߿��� ������ �Լ��� �����ϼ���.\r\n"
				+ "[�������̸� : ������		�й� : 1901114]\r\n"
				+ "1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�\r\n"
				+ "2) �Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�\r\n"
				+ "3) ���ĺ� A���� Z���� ����Ʈ�ϱ�\r\n"
				+ "4) ���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�\r\n"
				+ "5) 99�� �ܼ� ���\r\n"
				+ "6) 99�� ��´ܼ��� ���� ���� �����ؼ� ����Ʈ�ϱ�\r\n"
				+ "7) �л����� ó�� ���α׷�\r\n"
				+ "8) �迭 �������� Ǯ��\r\n"
				+ "9) ����ó�� ���α׷�(�߰����)\r\n"
				+ "10) ���� DB ���� ���α׷�(����07)\r\n"
				+ "11) ������ ���α׷�(����08)\r\n"
				+ "12) ������ ���α׷�-�뿩�ݳ�(����09)\r\n"
				+ "0) ����");
	}
}
