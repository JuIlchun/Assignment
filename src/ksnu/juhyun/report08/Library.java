package ksnu.juhyun.report08;

public class Library {
	KeyboardInput scan = new KeyboardInput();//키보드 입력 클래스 호출
	
	public void LibraryMenu() {
		SearchBook SearchBook = new SearchBook();//5번과 6번 SearchBook으로 호출
		Book[] books = new Book[1000];//객체 배열 선언
		int serial=0;//책이 배열에서 어디까지 입력되어 있는지 구분하는 변수 (도서의 갯수)
		int number = 0;//switch의 메뉴 변수
		while(true) {
			printMenu();//메뉴화면 호출
			number = scan.scanInt();
			switch (number) {
			case 1:
				InputBook InputBook = new InputBook();//도서 정보 입력 클래스 호출
				int count=InputBook.inputId();//입력받을 도서 갯수를 가져오는 함수
				books=InputBook.inputBook(books,count,serial);//도서 정보 입력 함수
				serial+=count;//이전에 배열에 있던 도서개수와 입력 받은 도서 갯수를 더함
				break;
			case 2:
				ShowBook ShowBook = new ShowBook();//도서 목록 보기 클래스 호출
				ShowBook.printBook(books,serial);
				break;
			case 3:
				EditBook EditBook = new EditBook();//도서 정보 수정 클래스 호출
				EditBook.editBook(books);
				break;
			case 4:
				PricesBook PricesBook = new PricesBook();//도서 통계 보기 클래스 (가격과 관련해서 통계를 작성해서 pricesbook으로 명명)
				PricesBook.pricesBook(books, serial);
				break;
			case 5:
				SearchBook.searchBookAuthor(books, serial);//저자명으로 도서 검색 함수
				break;
			case 6:
				SearchBook.searchBookPrice(books, serial);//가격 범위로 도서 검색 함수
				break;
			case 7:
				DeleteBook DeleteBook = new DeleteBook();//도서 정보 삭제 클래스
				DeleteBook.deleteBook(books, serial);
				break;
			case 0:
				return;
			
				
			}
		}
	}
	void printMenu() {//메뉴화면
		System.out.println("<도서관 프로그램>\r\n"
				+ "1. 도서 정보 입력하기\r\n"
				+ "2. 도서 목록 보기\r\n"
				+ "3. 도서 정보 수정하기\r\n"
				+ "4. 도서 통계 보기\r\n"
				+ "5. 도서 정보 검색(저자명)\r\n"
				+ "6. 가격 범위로 검색\r\n"
				+ "7. 도서 정보 삭제\r\n"
				+ "0. 메인메뉴로 돌아감");
	}
	
	
}
