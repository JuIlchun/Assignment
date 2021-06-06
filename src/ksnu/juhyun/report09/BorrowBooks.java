package ksnu.juhyun.report09;

import java.util.ArrayList;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class BorrowBooks {
	ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	KeyboardInput Input = new KeyboardInput();
	
	ArrayList<int[]> borrowBooks(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//���� �뿩 �ϱ�
		System.out.println("ȸ�� ID�� �Է����ּ���!");
		int personId = Input.scanInt();
		System.out.println("�� ���� å�� �����ðڽ��ϱ�?");
		int countBooks=Input.scanInt();
		
		while (countBooks>5) {//5�� �̻��� å�� �����Ϸ� �ϸ� ����!
			System.out.println("�ִ� 5�Ǳ��� ���Ⱑ���մϴ�! �ٽ� �Է����ּ���!");
			countBooks = Input.scanInt();
		}
		int[][] bookList = new int[countBooks][3];
		
		bookList = createBookList(people, books, bookList, countBooks, personId);//Index 0���� �뿩, 1���� book�� id, 2���� person�� id�� �������� Int�� �迭�� bookList�� ����
		inoutList = inputInOutBooks(inoutList, people, personId, countBooks, bookList);//createBookList���� ���� Int�� �迭�� ArrayList�� inoutBooks�� ����
		
		return inoutList;
	}
	
	
	int[][] createBookList(Person[] people, Book[] books, int[][] bookList, int countBooks, int personId) {//Index 0���� �뿩, 1���� book�� id, 2���� person�� id�� �������� Int�� �迭�� bookList�� ����
		System.out.println("������ å�� �̸��� �Է����ּ���!");
		for (int i=0;i<countBooks;i++) {
			String name = Input.scanString();
			for (int j=0;j<books.length;j++) {
				try {
					if (books[j].getName().equals(name)) {
						if (checkBookAmount(books[j])) {//Book��ü�� Amount(å�� ����)�� Ȯ�� �� Amount�� 1����
							bookList[i][0]=0;
							bookList[i][1]=books[j].getId();
							bookList[i][2]=personId;
							books[j].setRanking(books[j].getRanking()+1);//Book��ü�� Ranking�� 1����
							personRanking(people,personId);//Person��ü�� Ranking�� 1����
							break;
						}
					}
				}
				catch (Exception e) {}
			}
		}
		return bookList;
	}
	
	boolean checkBookAmount(Book book) {//Book��ü�� Amount(å�� ����)�� Ȯ�� �� Amount�� 1����
		if (book.getAmount()!=0) {
			book.setAmount(book.getAmount()-1);//Book��ü�� Amount(å�� ����)�� 1����
			return true;
		}
		else {
			System.out.println("���� �������� �����ִ� å�� �����ϴ�!");
			return false;
		}
	}
	
	void personRanking(Person[] people, int personId) {//Person��ü�� Ranking�� 1����
		for (int i=0;i<people.length;i++) {
			if (people[i].getCitizenNumber()==personId) {
				people[i].setRanking(people[i].getRanking()+1);
			}
		}
	}
	
	ArrayList<int[]> inputInOutBooks(ArrayList<int[]> inoutList, Person[] people, int personId, int countBooks, int[][] bookList) {//createBookList���� ���� Int�� �迭�� ArrayList�� inoutBooks�� ����
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
