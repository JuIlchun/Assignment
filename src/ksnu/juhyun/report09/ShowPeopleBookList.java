package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ShowPeopleBookList {
	KeyboardInput Input = new KeyboardInput();
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	
	void showBookList(Person[] people, Book[] books) {//�뿩�ں� �뿩/�ݳ� ��� ����
		System.out.println("<�뿩�ں� �뿩/�ݳ� ��� ����>\nȸ�� ID�� �Է����ּ���!");
		int personId = Input.scanInt();
		for (int i=0;i<people.length;i++) {
			if (personId==people[i].getCitizenNumber()) {
				inoutBooks=people[i].getInoutBooks();
				System.out.println(people[i].getName()+"�� ����Դϴ�!");
				printBookList(inoutBooks, books);
			}
		}
	}
	
	void printBookList(ArrayList<int[]> inoutBooks, Book[] books) {//Person��ü�ȿ� ArrayList�� inoutBooks���� Int�� �迭 bookList�� ������ ���
		for (int i=inoutBooks.size()-1;i>-1;i--) {
			int[] bookList=inoutBooks.get(i);
			if (bookList[0]==0) {
				System.out.print(" ���� ");
			}
			else {
				System.out.print(" �ݳ� ");
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
