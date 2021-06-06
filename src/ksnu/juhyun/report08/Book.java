package ksnu.juhyun.report08;

public class Book implements Comparable<Book>{
	private int id; //일련번호
	private String name; //제목
	private String author; //저자이름
	private int year; //출판년도
	private String publisher; //출판사
	private int price; //가격
	private int amount; //보유권수
	private int Ranking;//인기도서 Ranking을 표시하기 위한 int
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRanking() {
		return Ranking;
	}

	public void setRanking(int ranking) {
		Ranking = ranking;
	}

	@Override
	public int compareTo(Book book) {
		if (this.Ranking<book.Ranking) {
			return 1;
		}
		else if (this.Ranking==book.Ranking) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
// 초반에 이렇게 입력을 받았으나 Getter/Setter 함수를 쓰기 위해 변경함
//	void inputInfo() {
//		Scanner scanner = new Scanner(System.in);
//		id=scanner.next();
//		name=scanner.next();
//		author=scanner.next();
//		year=scanner.next();
//		price=scanner.nextInt();
//		count=scanner.nextInt();
//	}
