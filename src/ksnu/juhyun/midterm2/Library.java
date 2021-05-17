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
			System.out.println("Exception �߻�!");
		}
		return number;
	}
	void printMenu() {
		System.out.println("<������ ���α׷�>\n"
				+ "1.���� ���� �Է��ϱ�\n"
				+ "2.���� ��� ����\n"
				+ "3.���� ���� �����ϱ�\n"
				+ "4.���� ��� ����\n"
				+ "5.���� ���� �˻�(���ڸ�)\n"
				+ "6.���ݹ����� �˻�\n"
				+ "0.���θ޴��� ���ư���");
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
		System.out.println("���� ���� �Է�>");
		int number=scan();
		Book[] books=new Book[number];
		
		for (int i=0;i<number;i++) {
			System.out.printf("%d�� ���� ���� �Է�>", i);
			books[i]=new Book();
			books[i].inputInfo();
		}
		return books;
	}
	void printBook(Book[] books) {
		int number=books.length;
		System.out.println("���� ��� ����");
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
		for (int i=0;i<number;i++) {
			System.out.println(i+" "+books[i].id+" "+books[i].name+" "+books[i].author+" "+books[i].year+" "+books[i].publisher+" "+books[i].price+" "+books[i].count);
		}
	}
	Book[] editBook(Book[] books) {
		System.out.println("�������� �����ϱ�");
		
		System.out.println("������ Index ��ȣ?");
		int number=scan();
		
		System.out.println("���� : "+books[number].id+" "+books[number].name+" "+books[number].author+" "+books[number].year+" "+books[number].publisher+" "+books[number].price+" "+books[number].count);
		System.out.print("���� : ");
		books[number].inputInfo();
		
		return books;
	}
	void pricesBook(Book[] books) {
		int number=books.length;
		System.out.println("��ü ���� ���� �Ǽ� : "+countBook(books));
		System.out.printf("������ ��� ���� : %f\n", averageBook(books));
		System.out.println("�ְ� ���� ���� : "+books[highestPrice(books, number)].id+" "+books[highestPrice(books, number)].price);
		System.out.println("���� ���� ���� : "+books[lowestPrice(books, number)].id+" "+books[lowestPrice(books, number)].price);
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
		System.out.print("���ڸ� �Է�");
		String name=scanner.next();
		
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
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
		
		System.out.print("���� ���� �Է� : ");
		int firstprice=scan();
		int secondprice=scan();
		
		System.out.println("��ȣ    ����    ����    ���ǳ⵵    ���ǻ�    ����    �����Ǽ�");
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
