package ksnu.juhyun.main;

import ksnu.juhyun.midterm.MidtermMenu;
import ksnu.juhyun.report07.DataBaseManager;
import ksnu.juhyun.report08.Library;

import java.util.Scanner;

public class MainMenu {
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		MainMenu MainMenu = new MainMenu();
				
		int number=0;
		while (true)
		{
			MainMenu.print();
			number=Scan.nextInt();
			switch(number)
			{
			case 0:
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
				DBManager.mainMenu();
				break;
			case 11:
				Library Library = new Library();
				Library.LibraryMenu();
			}
		}
	}

	void print() {
		System.out.println("o 다음의 프로그램들 중에서 수행할 함수를 선택하세요.\r\n"
				+ "[구현자이름 : 박주현		학번 : 1901114]\r\n"
				+ "1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램\r\n"
				+ "2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기\r\n"
				+ "3) 알파벳 A부터 Z까지 프린트하기\r\n"
				+ "4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기\r\n"
				+ "5) 99단 단순 찍기\r\n"
				+ "6) 99단 출력단수와 수의 범위 설정해서 프린트하기\r\n"
				+ "7) 학생성적 처리 프로그램\r\n"
				+ "8) 배열 연습문제 풀기\r\n"
				+ "9) 성적처리 프로그램(중간고사)\r\n"
				+ "10) 대학 DB 관리 프로그램\r\n"
				+ "11) 도서관 프로그램\r\n"
				+ "0) 종료");
	}
}
