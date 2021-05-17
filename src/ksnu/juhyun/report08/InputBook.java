package ksnu.juhyun.report08;

public class InputBook {
	KeyboardInput scan = new KeyboardInput();
	
	int inputId() {//입력받을 도서 갯수를 가져오는 함수
		System.out.println("도서 개수 입력>");
		int count=scan.scanInt();
		return count;
	}
	
	Book[] inputBook(Book[] books,int serial, int existnumber) {//도서 정보 입력 함수
		for (int i=existnumber;i<existnumber+serial;i++) {//Setter로 book객체에 값을 넣어줌
			System.out.printf("%d번 도서 정보 입력>", i);
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
