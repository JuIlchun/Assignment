package ksnu.juhyun.report09;

import java.util.Arrays;
import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;

public class RankingSystem {
	KeyboardInput Input = new KeyboardInput();
	
	void showRanking(Person[] people, Book[] books) {//�뿩�� Ranking�� �α⵵�� Ranking �߿� ����
		System.out.println("<���� �뿩/ �ݳ� ��� ����>");
		System.out.println("1. �뿩�� Ranking\n2. �α⵵�� Ranking");
		int number = Input.scanInt();
		if (number==1) {
			personRanking(people);
		}
		else if (number==2) {
			bookRanking(books);
		}
	}
	
	void personRanking(Person[] people) {//�뿩�� Ranking�� ǥ��
		Person[] p = people;
		Arrays.sort(p);//Person��ü�� Ranking�� �������� Sort
		System.out.println("<�뿩�� Ranking Top 5>");
		if (p.length<5) {//����� 5��̸��϶� ��� ��� ��ŭ ���
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
	
	void bookRanking(Book[] books) {//�α⵵�� Ranking�� ǥ��
		int bookcount=0;
		for (int i=0;i<books.length;i++) {//Book��ü�� ���� ����
			if (books[i]!=null) {bookcount++;}
			else {break;}
		}
		Book[] b= new Book[bookcount];//Book��ü�迭�� ���� ����
		for (int i=0;i<bookcount;i++) {//��ü �迭 ���� ����
			b[i]=books[i];
		}
		Arrays.sort(b);//Book��ü�� Ranking�� �������� Sort
		System.out.println("<�α⵵�� Ranking Top 5>");
		if (b.length<5) {//å�� 5���̸��϶� å ���� ��ŭ ���
			for (int i=0; i<b.length;i++) {
				System.out.println(b[i].getName());
			}
		}
		else {//å�� 5���̻��϶� 5���� ���
			System.out.println(b[0].getName());
			System.out.println(b[1].getName());
			System.out.println(b[2].getName());
			System.out.println(b[3].getName());
			System.out.println(b[4].getName());
		}
	}
}
