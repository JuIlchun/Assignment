package ksnu.juhyun.report08;

public class ShowBook {
	void printBook(Book[] books, int serial) {//도서 목록 보기 함수
		System.out.println("도서 목록 보기");
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
			}
		}
	}
}
