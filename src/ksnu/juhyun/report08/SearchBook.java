package ksnu.juhyun.report08;

public class SearchBook {
	KeyboardInput scan = new KeyboardInput();
	void searchBookAuthor(Book[] books, int serial) {//저자명으로 도서 검색 함수
		System.out.print("저자명 입력");
		String name=scan.scanString();
		
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				if (books[i].getAuthor().equals(name)) {//사용자가 입력한 저자명과 현재 도서의 저자명을 비교
					System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
				}
			}
		}
	}
	void searchBookPrice(Book[] books, int serial) {//가격 범위로 도서 검색 함수
		System.out.print("가격 범위 입력 : ");
		int firstprice=scan.scanInt();
		int secondprice=scan.scanInt();
		
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				if (firstprice<books[i].getPrice()&&books[i].getPrice()<secondprice) {//사용자가 입력한 가격과 현재 도서의 가격을 비교
					System.out.println(books[i].getId()+" "+books[i].getName()+" "+books[i].getAuthor()+" "+books[i].getYear()+" "+books[i].getPublisher()+" "+books[i].getPrice()+" "+books[i].getAmount());
				}
			}
		}
		
	}
}
