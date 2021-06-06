package ksnu.juhyun.report09;

import ksnu.juhyun.report07.Person;
import ksnu.juhyun.report08.Book;
import java.util.ArrayList;

public class ShowInOutList {
	 void showInOutList(ArrayList<int[]> inoutList, Person[] people, Book[] books) {//���� �ֿ�/�ݳ�/ ��ü ��� ����
		 int[] bookLog;
		 System.out.println("<���� �뿩/�ݳ� ��ü ��� ����> ���� ���� ���� �ֽ�!");
		 for (int i=inoutList.size()-1;i>-1;i--) {//�ֱٿ� �Ͼ ������� ǥ���ϱ� ���� �������� ���
			 bookLog=inoutList.get(i);
			 if (bookLog[0]==1) {
				 System.out.print(" �ݳ� ");
			 }
			 else {
				 System.out.print(" ���� ");
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
