package ksnu.juhyun.report08;

public class DeleteBook {
	KeyboardInput scan = new KeyboardInput();//키보드 입력 클래스 호출
	
	Book[] deleteBook(Book[] books, int serial) {//도서 정보 삭제 함수
		System.out.print("삭제할 도서번호 입력 ");
		int number = scan.scanInt();
		
		books[number]=null;
		System.out.printf("%d번 도서를 삭제하였습니다.\n",number);
		return books;
	}
}
