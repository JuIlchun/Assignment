package ksnu.juhyun.report08;

public class SearchBook {
	KeyboardInput scan = new KeyboardInput();
	void searchBookAuthor(Book[] books, int serial) {//���ڸ����� ���� �˻� �Լ�
		System.out.print("���ڸ� �Է�");
		String name=scan.scanString();
		
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				if (books[i].getAuthor().equals(name)) {//����ڰ� �Է��� ���ڸ�� ���� ������ ���ڸ��� ��
					System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
				}
			}
		}
	}
	void searchBookPrice(Book[] books, int serial) {//���� ������ ���� �˻� �Լ�
		System.out.print("���� ���� �Է� : ");
		int firstprice=scan.scanInt();
		int secondprice=scan.scanInt();
		
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
				if (firstprice<books[i].getPrice()&&books[i].getPrice()<secondprice) {//����ڰ� �Է��� ���ݰ� ���� ������ ������ ��
					System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
				}
			}
		}
		
	}
}
