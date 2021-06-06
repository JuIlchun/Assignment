package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class InOutLibrary {
	KeyboardInput Input = new KeyboardInput();
	public void libraryMenu(Person[] people, Book[] books) {//������ ���α׷�
		ArrayList<int[]> inoutList = new ArrayList<int[]>();
		while (true) {
			showMenu();
			int number=Input.scanInt();
			switch (number) {
			case 1: BorrowBooks Borrow = new BorrowBooks(); Borrow.borrowBooks(inoutList, people, books); break;
			case 2: ReturnBooks Return = new ReturnBooks(); Return.returnBooks(inoutList, people, books); break;
			case 3: ShowInOutList InOutList = new ShowInOutList(); InOutList.showInOutList(inoutList, people, books); break;
			case 4: ShowPeopleBookList PeopleBookList = new ShowPeopleBookList(); PeopleBookList.showBookList(people, books); break;
			case 5: ShowInOutBookList InOutBookList = new ShowInOutBookList(); InOutBookList.inoutBookList(inoutList, people, books);break;
			case 6: RankingSystem RankingSystem = new RankingSystem(); RankingSystem.showRanking(people, books); break;
			case 0: return;
			}
		}
	}
	void showMenu() {//������ ���α׷� �޴�
		System.out.print("<������ ���α׷�-�뿩�ݳ�>\n"
				+ "1. ���� �뿩�ϱ� (1���� 1���� �ִ� 5���� å �뿩����)\n"
				+ "2. ���� �ݳ��ϱ�(�ټ��� å �ѹ��� �ݳ�����)\n"
				+ "3. ���� �뿩/�ݳ� ��ü ��Ϻ���(���� �뿩/�ݳ� task�� �ð� ������ �����ؼ� ����)\n"
				+ "4. �뿩�ں� �뿩/�ݳ� ��Ϻ���(citizenNumber�˻�)\n"
				+ "5. ������ �뿩 ��� ����(�����Ϸù�ȣ �˻�)\n"
				+ "6. ���� �뿩/�ݳ� ��� ����(�뿩�� Ranking, �α⵵�� Ranking)\n"
				+ "0. ����\n");
	}
}
