package ksnu.juhyun.report08;

public class InputBook {
	KeyboardInput scan = new KeyboardInput();
	
	int inputId() {//�Է¹��� ���� ������ �������� �Լ�
		System.out.println("���� ���� �Է�>");
		int count=scan.scanInt();
		return count;
	}
	
	Book[] inputBook(Book[] books,int serial, int existnumber) {//���� ���� �Է� �Լ�
		for (int i=existnumber;i<existnumber+serial;i++) {//Setter�� book��ü�� ���� �־���
			System.out.printf("%d�� ���� ���� �Է�>", i);
			books[i]=new Book();
			books[i].setId(i);
			books[i].setName(scan.scanString());
			books[i].setAuthor(scan.scanString());
			books[i].setYear(scan.scanInt());
			books[i].setPublisher(scan.scanString());
			books[i].setPrice(scan.scanInt());
			books[i].setAmount(scan.scanInt());
		}
		return books;
	}
}
