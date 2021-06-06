package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ShowPeopleBookList {
	KeyboardInput Input = new KeyboardInput();
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	
	void showBookList(Person[] people, Book[] books) {//대여자별 대여/반납 기록 보기
		System.out.println("<대여자별 대여/반납 기록 보기>\n회원 ID를 입력해주세요!");
		int personId = Input.scanInt();
		for (int i=0;i<people.length;i++) {
			if (personId==people[i].getCitizenNumber()) {
				inoutBooks=people[i].getInoutBooks();
				System.out.println(people[i].getName()+"의 기록입니다!");
				printBookList(inoutBooks, books);
			}
		}
	}
	
	void printBookList(ArrayList<int[]> inoutBooks, Book[] books) {//Person객체안에 ArrayList인 inoutBooks에서 Int형 배열 bookList를 가져와 출력
		for (int i=inoutBooks.size()-1;i>-1;i--) {
			int[] bookList=inoutBooks.get(i);
			if (bookList[0]==0) {
				System.out.print(" 대출 ");
			}
			else {
				System.out.print(" 반납 ");
			}
			for (int j=0;j<books.length;j++) {
				if (books[j]!=null) {
					 if (books[j].getId()==bookList[1]) {
						 System.out.print(" "+books[j].getName()+" \n");
						 break;
					 }
				 }
			}
		}
	}
}
