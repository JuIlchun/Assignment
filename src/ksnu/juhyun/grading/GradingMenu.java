package ksnu.juhyun.grading;

import java.util.Scanner;

public class GradingMenu {
	Scanner Scan = new Scanner(System.in);
	GradingPrint Print = new GradingPrint();
	StudentInput Input = new StudentInput();
	StudentList List = new StudentList();
	StudentSearch Search = new StudentSearch();
	StudentMaxMin MaxMin = new StudentMaxMin();
	StudentAveMid AveMid = new StudentAveMid();
	StudentSort Sort = new StudentSort();
	void print() {
		int[] array = {0};
		while (true) {
			Print.print();
			int num = Scan.nextInt();
			switch (num) {
			case 1: array=Input.input(array); break;
			case 2: List.print(array); break;
			case 3: Search.print(array); break;
			case 4: MaxMin.print(array); break;
			case 5: AveMid.print(array); break;
			case 6: Sort.print(array); break;
			case 0: return;
			}
		}	
	}
}
