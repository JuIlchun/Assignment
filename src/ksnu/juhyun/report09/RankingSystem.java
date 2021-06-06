package ksnu.juhyun.report09;

import java.util.Arrays;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class RankingSystem {
	KeyboardInput Input = new KeyboardInput();
	
	void showRanking(Person[] people, Book[] books) {//대여자 Ranking과 인기도서 Ranking 중에 선택
		System.out.println("<도서 대여/ 반납 통계 보기>");
		System.out.println("1. 대여자 Ranking\n2. 인기도서 Ranking");
		int number = Input.scanInt();
		if (number==1) {
			personRanking(people);
		}
		else if (number==2) {
			bookRanking(books);
		}
	}
	
	void personRanking(Person[] people) {//대여자 Ranking을 표시
		Person[] p = people;
		Arrays.sort(p);//Person객체의 Ranking을 기준으로 Sort
		System.out.println("<대여자 Ranking Top 5>");
		if (p.length<5) {//사람이 5명미만일때 사람 명수 만큼 출력
			for (int i=0; i<p.length;i++) {
				System.out.println(p[i].getName());
			}
		}
		else {
			System.out.println(p[0].getName());
			System.out.println(p[1].getName());
			System.out.println(p[2].getName());
			System.out.println(p[3].getName());
			System.out.println(p[4].getName());
		}
	}
	
	void bookRanking(Book[] books) {//인기도서 Ranking을 표시
		int bookcount=0;
		for (int i=0;i<books.length;i++) {//Book객체의 개수 세기
			if (books[i]!=null) {bookcount++;}
			else {break;}
		}
		Book[] b= new Book[bookcount];//Book객체배열을 새로 생성
		for (int i=0;i<bookcount;i++) {//객체 배열 깊은 복사
			b[i]=books[i];
		}
		Arrays.sort(b);//Book객체의 Ranking을 기준으로 Sort
		System.out.println("<인기도서 Ranking Top 5>");
		if (b.length<5) {//책이 5개미만일때 책 개수 만큼 출력
			for (int i=0; i<b.length;i++) {
				System.out.println(b[i].getName());
			}
		}
		else {//책이 5개이상일때 5개만 출력
			System.out.println(b[0].getName());
			System.out.println(b[1].getName());
			System.out.println(b[2].getName());
			System.out.println(b[3].getName());
			System.out.println(b[4].getName());
		}
	}
}
