package ksnu.juhyun.report08;

public class Library {
	KeyboardInput scan = new KeyboardInput();//Ű���� �Է� Ŭ���� ȣ��
	
	public void LibraryMenu() {
		SearchBook SearchBook = new SearchBook();//5���� 6�� SearchBook���� ȣ��
		Book[] books = new Book[1000];//��ü �迭 ����
		int serial=0;//å�� �迭���� ������ �ԷµǾ� �ִ��� �����ϴ� ���� (������ ����)
		int number = 0;//switch�� �޴� ����
		while(true) {
			printMenu();//�޴�ȭ�� ȣ��
			number = scan.scanInt();
			switch (number) {
			case 1:
				InputBook InputBook = new InputBook();//���� ���� �Է� Ŭ���� ȣ��
				int count=InputBook.inputId();//�Է¹��� ���� ������ �������� �Լ�
				books=InputBook.inputBook(books,count,serial);//���� ���� �Է� �Լ�
				serial+=count;//������ �迭�� �ִ� ���������� �Է� ���� ���� ������ ����
				break;
			case 2:
				ShowBook ShowBook = new ShowBook();//���� ��� ���� Ŭ���� ȣ��
				ShowBook.printBook(books,serial);
				break;
			case 3:
				EditBook EditBook = new EditBook();//���� ���� ���� Ŭ���� ȣ��
				EditBook.editBook(books);
				break;
			case 4:
				PricesBook PricesBook = new PricesBook();//���� ��� ���� Ŭ���� (���ݰ� �����ؼ� ��踦 �ۼ��ؼ� pricesbook���� ���)
				PricesBook.pricesBook(books, serial);
				break;
			case 5:
				SearchBook.searchBookAuthor(books, serial);//���ڸ����� ���� �˻� �Լ�
				break;
			case 6:
				SearchBook.searchBookPrice(books, serial);//���� ������ ���� �˻� �Լ�
				break;
			case 7:
				DeleteBook DeleteBook = new DeleteBook();//���� ���� ���� Ŭ����
				DeleteBook.deleteBook(books, serial);
				break;
			case 0:
				return;
			
				
			}
		}
	}
	void printMenu() {//�޴�ȭ��
		System.out.println("<������ ���α׷�>\r\n"
				+ "1. ���� ���� �Է��ϱ�\r\n"
				+ "2. ���� ��� ����\r\n"
				+ "3. ���� ���� �����ϱ�\r\n"
				+ "4. ���� ��� ����\r\n"
				+ "5. ���� ���� �˻�(���ڸ�)\r\n"
				+ "6. ���� ������ �˻�\r\n"
				+ "7. ���� ���� ����\r\n"
				+ "0. ���θ޴��� ���ư�");
	}
	
	
}
