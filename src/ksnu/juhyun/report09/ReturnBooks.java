package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ReturnBooks {
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	KeyboardInput Input = new KeyboardInput();
	
	ArrayList<int[]> returnBooks(ArrayList<int[]> inoutList, Person[] people, Book[] books){//도서 반납 하기
		System.out.println("회원 ID를 입력해주세요!");
		int personId = Input.scanInt();
		System.out.println("몇개의 책을 반납하시겠습니까?");
		int countBooks = Input.scanInt();
		
		int[][] bookList = createBookList(books, countBooks, personId);
		inoutList = inputInOutList(inoutList, people, personId, countBooks, bookList);
		
		return inoutList;
	}
	
	int[][] createBookList(Book[] books, int countBooks, int personId) {//Index 0에는 반납, 1에는 book의 id, 2에는 person의 id를 Int형 배열인 bookList에 저장
		int[][] bookList = new int[countBooks][3];
		System.out.println("어떤 책을 반납하시겠습니까? (책 이름)");
		for (int i=0;i<countBooks;i++) {
			String name = Input.scanString();
			for (int j=0;j<books.length;j++) {
				if (books[j].getName().equals(name)) {
					bookList[i][0]=1;
					bookList[i][1]=books[j].getId();
					bookList[i][2]=personId;
					books[j].setAmount(books[j].getAmount()+1);////Book객체의 Amount(책의 개수)를 1증가
					break;
				}
			}
		}
		return bookList;
	}
	
	ArrayList<int[]> inputInOutList(ArrayList<int[]> inoutList, Person[] people, int personId, int countBooks, int[][] bookList) {//createBookList에서 만든 Int형 배열을 ArrayList인 inoutBooks에 저장
		for (int i=0;i<people.length;i++) {
			if (people[i].getCitizenNumber()==personId) {
				inoutBooks = people[i].getInoutBooks();
				for (int j=0;j<countBooks;j++) {
					inoutBooks.add(bookList[j]);
					inoutList.add(bookList[j]);
				}
				break;
			}	
		}
		return inoutList;
	}
}
