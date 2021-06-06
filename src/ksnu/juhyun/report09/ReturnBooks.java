package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class ReturnBooks {
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	KeyboardInput Input = new KeyboardInput();
	
	ArrayList<int[]> returnBooks(ArrayList<int[]> inoutList, Person[] people, Book[] books){//���� �ݳ� �ϱ�
		System.out.println("ȸ�� ID�� �Է����ּ���!");
		int personId = Input.scanInt();
		System.out.println("��� å�� �ݳ��Ͻðڽ��ϱ�?");
		int countBooks = Input.scanInt();
		
		int[][] bookList = createBookList(books, countBooks, personId);
		inoutList = inputInOutList(inoutList, people, personId, countBooks, bookList);
		
		return inoutList;
	}
	
	int[][] createBookList(Book[] books, int countBooks, int personId) {//Index 0���� �ݳ�, 1���� book�� id, 2���� person�� id�� Int�� �迭�� bookList�� ����
		int[][] bookList = new int[countBooks][3];
		System.out.println("� å�� �ݳ��Ͻðڽ��ϱ�? (å �̸�)");
		for (int i=0;i<countBooks;i++) {
			String name = Input.scanString();
			for (int j=0;j<books.length;j++) {
				if (books[j].getName().equals(name)) {
					bookList[i][0]=1;
					bookList[i][1]=books[j].getId();
					bookList[i][2]=personId;
					books[j].setAmount(books[j].getAmount()+1);////Book��ü�� Amount(å�� ����)�� 1����
					break;
				}
			}
		}
		return bookList;
	}
	
	ArrayList<int[]> inputInOutList(ArrayList<int[]> inoutList, Person[] people, int personId, int countBooks, int[][] bookList) {//createBookList���� ���� Int�� �迭�� ArrayList�� inoutBooks�� ����
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
