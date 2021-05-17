package ksnu.juhyun.midterm2;

import java.util.Scanner;

public class Book {
	public String id;
	public String name;
	public String author;
	public String year;
	public String publisher;
	public int price;
	public int count;
	
	Book(){
		id="";
		name="";
		author="";
		year="";
		publisher="";
		price=0;
		count=0;
	}
	
	void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		id=scanner.next();
		name=scanner.next();
		author=scanner.next();
		year=scanner.next();
		price=scanner.nextInt();
		count=scanner.nextInt();
	}
}
