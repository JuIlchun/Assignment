package ksnu.juhyun.report08;

public class ShowBook {
	void printBook(Book[] books, int serial) {//���� ��� ���� �Լ�
		System.out.println("���� ��� ����");
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
			}
		}
	}
}
