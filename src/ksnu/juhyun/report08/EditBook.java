package ksnu.juhyun.report08;

public class EditBook {
	KeyboardInput scan = new KeyboardInput();
	
	Book[] editBook(Book[] books) {
		System.out.println("�������� �����ϱ�");
		
		System.out.println("������ Index ��ȣ?");
		int number=scan.scanInt();
		
		if (books[number]!=null) {//book��ü�� null�� �ƴҶ� (������ �������� ���� ���)
			System.out.println("���� : "+books[number].getName()+" "+books[number].getAuthor()+" "+books[number].getYear()+" "+books[number].getPublisher()+" "+books[number].getPrice()+" "+books[number].getAmount());
			System.out.print("���� : ");
			books[number].setName(scan.scanString());
			books[number].setAuthor(scan.scanString());
			books[number].setYear(scan.scanInt());
			books[number].setPublisher(scan.scanString());
			books[number].setPrice(scan.scanInt());
			books[number].setAmount(scan.scanInt());
		}
		else if (books[number]==null) {
			System.out.println("Index�� ã�� �� �����ϴ�!");
		}
		
		return books;
	}
}
