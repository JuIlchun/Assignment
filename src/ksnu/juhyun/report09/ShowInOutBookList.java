package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ShowInOutBookList {
	KeyboardInput Input = new KeyboardInput();
	
	void inoutBookList(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//������ �뿩 ��� ����
		System.out.println("�����Ϸù�ȣ�� �Է����ּ���!");
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
	
	void printBookList(ArrayList<int[]> inoutList, Person[] people, int serial) {//ArrayList�� inoutList���� Int�� �迭�� bookList�� �������� ���
		for (int i=0;i<inoutList.size();i++) {
			int[] bookList = inoutList.get(i);
			if (bookList[1]==serial) {
				if (bookList[0]==1) {
					System.out.print(" �ݳ� ");
				}
				else {
					System.out.print(" ���� ");
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
