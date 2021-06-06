package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class BorrowBooks {
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	KeyboardInput Input = new KeyboardInput();
	
	ArrayList<int[]> borrowBooks(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//도서 대여 하기
		System.out.println("회원 ID를 입력해주세요!");
		int personId = Input.scanInt();
		System.out.println("몇 권의 책을 빌리시겠습니까?");
		int countBooks=Input.scanInt();
		
		while (countBooks>5) {//5권 이상의 책을 대출하려 하면 오류!
			System.out.println("최대 5권까지 대출가능합니다! 다시 입력해주세요!");
			countBooks = Input.scanInt();
		}
		int[][] bookList = new int[countBooks][3];
		
		bookList = createBookList(people, books, bookList, countBooks, personId);//Index 0에는 대여, 1에는 book의 id, 2에는 person의 id를 저장한후 Int형 배열인 bookList에 저장
		inoutList = inputInOutBooks(inoutList, people, personId, countBooks, bookList);//createBookList에서 만든 Int형 배열을 ArrayList인 inoutBooks에 저장
		
		return inoutList;
	}
	
	
	int[][] createBookList(Person[] people, Book[] books, int[][] bookList, int countBooks, int personId) {//Index 0에는 대여, 1에는 book의 id, 2에는 person의 id를 저장한후 Int형 배열인 bookList에 저장
		System.out.println("빌리실 책의 이름을 입력해주세요!");
		for (int i=0;i<countBooks;i++) {
			String name = Input.scanString();
			for (int j=0;j<books.length;j++) {
				try {
					if (books[j].getName().equals(name)) {
						if (checkBookAmount(books[j])) {//Book객체의 Amount(책의 개수)를 확인 후 Amount를 1감소
							bookList[i][0]=0;
							bookList[i][1]=books[j].getId();
							bookList[i][2]=personId;
							books[j].setRanking(books[j].getRanking()+1);//Book객체의 Ranking을 1증가
							personRanking(people,personId);//Person객체의 Ranking을 1증가
							break;
						}
					}
				}
				catch (Exception e) {}
			}
		}
		return bookList;
	}
	
	boolean checkBookAmount(Book book) {//Book객체의 Amount(책의 개수)를 확인 후 Amount를 1감소
		if (book.getAmount()!=0) {
			book.setAmount(book.getAmount()-1);//Book객체의 Amount(책의 개수)를 1감소
			return true;
		}
		else {
			System.out.println("현재 도서관에 남아있는 책이 없습니다!");
			return false;
		}
	}
	
	void personRanking(Person[] people, int personId) {//Person객체의 Ranking을 1증가
		for (int i=0;i<people.length;i++) {
			if (people[i].getCitizenNumber()==personId) {
				people[i].setRanking(people[i].getRanking()+1);
			}
		}
	}
	
	ArrayList<int[]> inputInOutBooks(ArrayList<int[]> inoutList, Person[] people, int personId, int countBooks, int[][] bookList) {//createBookList에서 만든 Int형 배열을 ArrayList인 inoutBooks에 저장
		for (int i=0;i<people.length;i++) {
			if (personId==people[i].getCitizenNumber()) {
				inoutBooks=people[i].getInoutBooks();
				for (int j=0;j<countBooks;j++) {
					inoutBooks.add(bookList[j]);
					inoutList.add(bookList[j]);
				}
				people[i].setInoutBooks(inoutBooks);
				break;
			}
		}
		return inoutList;
	}
}
