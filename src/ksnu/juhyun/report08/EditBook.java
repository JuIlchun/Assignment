package ksnu.juhyun.report08;

public class EditBook {
	KeyboardInput scan = new KeyboardInput();
	
	Book[] editBook(Book[] books) {
		System.out.println("도서정보 수정하기");
		
		System.out.println("도서의 Index 번호?");
		int number=scan.scanInt();
		
		if (books[number]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
			System.out.println("현재 : "+books[number].getName()+" "+books[number].getAuthor()+" "+books[number].getYear()+" "+books[number].getPublisher()+" "+books[number].getPrice()+" "+books[number].getAmount());
			System.out.print("수정 : ");
			books[number].setName(scan.scanString());
			books[number].setAuthor(scan.scanString());
			books[number].setYear(scan.scanInt());
			books[number].setPublisher(scan.scanString());
			books[number].setPrice(scan.scanInt());
			books[number].setAmount(scan.scanInt());
		}
		else if (books[number]==null) {
			System.out.println("Index를 찾을 수 없습니다!");
		}
		
		return books;
	}
}
