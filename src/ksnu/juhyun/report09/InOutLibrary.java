package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class InOutLibrary {
	KeyboardInput Input = new KeyboardInput();
	public void libraryMenu(Person[] people, Book[] books) {//도서관 프로그램
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
	void showMenu() {//도서관 프로그램 메뉴
		System.out.print("<도서관 프로그램-대여반납>\n"
				+ "1. 도서 대여하기 (1명이 1번에 최대 5권의 책 대여가능)\n"
				+ "2. 도서 반납하기(다수의 책 한번에 반납가능)\n"
				+ "3. 도서 대여/반납 전체 목록보기(도서 대여/반납 task를 시간 순으로 나열해서 보기)\n"
				+ "4. 대여자별 대여/반납 기록보기(citizenNumber검색)\n"
				+ "5. 도서별 대여 기록 보기(도서일련번호 검색)\n"
				+ "6. 도서 대여/반납 통계 보기(대여자 Ranking, 인기도서 Ranking)\n"
				+ "0. 종료\n");
	}
}
