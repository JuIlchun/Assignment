package ksnu.juhyun.report09;

import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;
import java.util.ArrayList;

public class ShowInOutList {
	 void showInOutList(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//도서 애여/반납/ 전체 목록 보기
		 int[] bookLog;
		 System.out.println("<도서 대여/반납 전체 목록 보기> 위에 있을 수록 최신!");
		 for (int i=inoutList.size()-1;i>-1;i--) {//최근에 일어난 순서대로 표시하기 위해 역순으로 출력
			 bookLog=inoutList.get(i);
			 if (bookLog[0]==1) {
				 System.out.print(" 반납 ");
			 }
			 else {
				 System.out.print(" 대출 ");
			 }
			 for (int j=0;j<books.length;j++) {
				 if (books[j]!=null) {
					 if (books[j].getId()==bookLog[1]) {
						 System.out.print(" "+books[j].getName()+" ");
						 break;
					 }
				 }
			 }
			 for (int j=0;j<people.length;j++) {
				 if (people[j].getCitizenNumber()==bookLog[2]) {
					 System.out.print(" "+people[j].getName()+" \n");
					 break;
				 }
			 }
		 }
	 }
}
