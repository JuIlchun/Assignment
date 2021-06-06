package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ShowInOutBookList {
	KeyboardInput Input = new KeyboardInput();
	
	void inoutBookList(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//도서별 대여 기록 보기
		System.out.println("도서일련번호를 입력해주세요!");
		int serial = Input.scanInt();
		for (int i=0;i<books.length;i++) {
			if (books[i]!=null) {
				if (books[i].getId()==serial) {
					System.out.println("  <"+books[i].getName()+">");
					break;
				}
			}
		}
		printBookList(inoutList, people, serial);
	}
	
	void printBookList(ArrayList<int[]> inoutList, Person[] people, int serial) {//ArrayList인 inoutList에서 Int형 배열인 bookList를 가져온후 출력
		for (int i=0;i<inoutList.size();i++) {
			int[] bookList = inoutList.get(i);
			if (bookList[1]==serial) {
				if (bookList[0]==1) {
					System.out.print(" 반납 ");
				}
				else {
					System.out.print(" 대출 ");
				}
				for (int j=0;j<people.length;j++) {
					if (people[j].getCitizenNumber()==bookList[2]) {
						System.out.println(" "+people[j].getName()+" ");
						break;
					}
				}
			}
		}
	}
}
