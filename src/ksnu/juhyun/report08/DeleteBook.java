package ksnu.juhyun.report08;

public class DeleteBook {
	KeyboardInput scan = new KeyboardInput();//Ű���� �Է� Ŭ���� ȣ��
	
	Book[] deleteBook(Book[] books, int serial) {//���� ���� ���� �Լ�
		System.out.print("������ ������ȣ �Է� ");
		int number = scan.scanInt();
		
		books[number]=null;
		System.out.printf("%d�� ������ �����Ͽ����ϴ�.\n",number);
		return books;
	}
}
