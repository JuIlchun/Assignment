package ksnu.juhyun.report08;

public class Book implements Comparable<Book>{
	private int id; //�Ϸù�ȣ
	private String name; //����
	private String author; //�����̸�
	private int year; //���ǳ⵵
	private String publisher; //���ǻ�
	private int price; //����
	private int amount; //�����Ǽ�
	private int Ranking;//�α⵵�� Ranking�� ǥ���ϱ� ���� int
	
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
// �ʹݿ� �̷��� �Է��� �޾����� Getter/Setter �Լ��� ���� ���� ������
//	void inputInfo() {
//		Scanner scanner = new Scanner(System.in);
//		id=scanner.next();
//		name=scanner.next();
//		author=scanner.next();
//		year=scanner.next();
//		price=scanner.nextInt();
//		count=scanner.nextInt();
//	}
