package ksnu.juhyun.midterm2;

import java.util.Scanner;

public class Library {
	Scanner scanner = new Scanner(System.in);
	int scan() {
		int number=0;
		try{
			number=scanner.nextInt();
		}
		catch (Exception e){
			System.out.println("Exception 발생!");
		}
		return number;
	}
	void printMenu() {
		System.out.println("<도서관 프로그램>\n"
				+ "1.도서 정보 입력하기\n"
				+ "2.도서 목록 보기\n"
				+ "3.도서 정보 수정하기\n"
				+ "4.도서 통계 보기\n"
				+ "5.도서 정보 검색(저자명)\n"
				+ "6.가격범위로 검색\n"
				+ "0.메인메뉴로 돌아가기");
	}
	void libraryMenu() {
		Book[] books={};
		while(true) {
			printMenu();
			int number=scan();
			switch (number) {
			case 1: books=inputBook(); break;
			case 2: printBook(books); break;
			case 3: books=editBook(books); break;
			case 4: pricesBook(books); break;
			case 5: searchBookAuthor(books); break;
			case 6: searchBookPrice(books); break;
			case 0: return;
			}
		}
	}
	Book[] inputBook() {
		System.out.println("도서 개수 입력>");
		int number=scan();
		Book[] books=new Book[number];
		
		for (int i=0;i<number;i++) {
			System.out.printf("%d번 도서 정보 입력>", i);
			books[i]=new Book();
			books[i].inputInfo();
		}
		return books;
	}
	void printBook(Book[] books) {
		int number=books.length;
		System.out.println("도서 목록 보기");
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<number;i++) {
			System.out.println(i+" "+books[i].id+" "+books[i].name+" "+books[i].author+" "+books[i].year+" "+books[i].publisher+" "+books[i].price+" "+books[i].count);
		}
	}
	Book[] editBook(Book[] books) {
		System.out.println("도서정보 수정하기");
		
		System.out.println("도서의 Index 번호?");
		int number=scan();
		
		System.out.println("현재 : "+books[number].id+" "+books[number].name+" "+books[number].author+" "+books[number].year+" "+books[number].publisher+" "+books[number].price+" "+books[number].count);
		System.out.print("수정 : ");
		books[number].inputInfo();
		
		return books;
	}
	void pricesBook(Book[] books) {
		int number=books.length;
		System.out.println("전체 보유 도서 권수 : "+countBook(books));
		System.out.printf("도서당 평균 가격 : %f\n", averageBook(books));
		System.out.println("최고 가격 도서 : "+books[highestPrice(books, number)].id+" "+books[highestPrice(books, number)].price);
		System.out.println("최저 가격 도서 : "+books[lowestPrice(books, number)].id+" "+books[lowestPrice(books, number)].price);
	}
	int countBook(Book[] books) {
		int number=books.length;
		int amount=0;
		for (int i=0;i<number;i++) {
			amount+=books[i].count;
		}
		return amount;
	}
	float averageBook(Book[] books) {
		int sum=0;
		int number=books.length;
		for (int i=0;i<number;i++) {
			sum+=books[i].price;
		}
		return sum/number;
	}
	int highestPrice(Book[] books, int number) {
		int highest=0;
		int index=0;
		for (int i=0;i<number;i++) {
			if(books[i].price>highest) {
				highest=books[i].price;
				index=i;
			}
		}
		return index;
	}
	int lowestPrice(Book[] books, int number) {
		int lowest=books[0].price;
		int index=0;
		for (int i=1;i<number;i++) {
			if(books[i].price<lowest) {
				lowest=books[i].price;
				index=i;
			}
		}
		return index;
	}
	void searchBookAuthor(Book[] books) {
		int number=books.length;
		int index=1;
		System.out.print("저자명 입력");
		String name=scanner.next();
		
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<number;i++) {
			if (books[i].name.equals(name)) {
				System.out.println(index+" "+books[i].id+" "+books[i].name+" "+books[i].author+" "+books[i].year+" "+books[i].publisher+" "+books[i].price+" "+books[i].count);
				index++;
			}
		}
	}
	void searchBookPrice(Book[] books) {
		int index=1;
		int number=books.length;
		
		System.out.print("가격 범위 입력 : ");
		int firstprice=scan();
		int secondprice=scan();
		
		System.out.println("번호    제목    저자    출판년도    출판사    가격    보유권수");
		for (int i=0;i<number;i++) {
			if (firstprice<books[i].price&&books[i].price<secondprice) {
				System.out.println(index+" "+books[i].id+" "+books[i].name+" "+books[i].author+" "+books[i].year+" "+books[i].publisher+" "+books[i].price+" "+books[i].count);
				index++;
			}
		}
		
	}
	public static void main(String[] args) {
		Library lib = new Library();
		lib.libraryMenu();
	}
}
