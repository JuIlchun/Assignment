package ksnu.juhyun.report08;

public class PricesBook {
	void pricesBook(Book[] books, int serial) {//도서 통계 보기 함수 (가격과 관련해서 통계를 작성해서 pricesbook으로 명명)
		System.out.println("전체 보유 도서 권수 : "+countBook(books, serial));
		System.out.printf("도서당 평균 가격 : %f\n", averageBook(books, serial));
		System.out.println("최고 가격 도서 : "+books[highestPrice(books, serial)].getName()+" "+books[highestPrice(books, serial)].getPrice());
		System.out.println("최저 가격 도서 : "+books[lowestPrice(books, serial)].getName()+" "+books[lowestPrice(books, serial)].getPrice());
	}
	int countBook(Book[] books, int serial) {//현재 도서관에 책이 몇권 있는지 계산
		int amount=0;
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				amount+=books[i].getAmount(); //각 도서의 수량을 가져옴
			}
		}
		return amount;
	}
	float averageBook(Book[] books, int serial) {//전체 도서의 평균가격을 계산
		int sum=0;
		int count=0;//현재 도서가 몇종류가 있는지 계산
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				sum+=books[i].getPrice(); //각 도서의 가격을 가져옴
				count++;
			}
		}
		return sum/count;
	}
	int highestPrice(Book[] books, int serial) {//도서관에서 가장 비싼 책을 찾기
		int highest=0;
		int index=0;//최고 가격 도서의 번호를 저장
		for (int i=0;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				if(books[i].getPrice()>highest) {//최고가격과 현재 도서의 가격을 비교
					highest=books[i].getPrice(); //각 도서의 가격을 가져옴
					index=i;
				}
			}
		}
		return index;
	}
	int lowestPrice(Book[] books, int serial) {//도서관에서 가장 싼 책을 찾기
		int lowest=books[0].getPrice();//0번째 책의 가격을 기준으로 함
		int index=0;//최저 가격 도서의 번호를 저장
		for (int i=1;i<serial;i++) {
			if (books[i]!=null) {//book객체가 null이 아닐때 (도서를 삭제했을 때를 고려)
				if(books[i].getPrice()<lowest) {//저고가격과 현재 도서의 가격을 비교
					lowest=books[i].getPrice(); //각 도서의 가격을 가져옴
					index=i;
				}
			}
		}
		return index;
	}
}
