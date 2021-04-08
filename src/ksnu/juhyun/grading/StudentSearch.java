package ksnu.juhyun.grading;

import java.util.Scanner;

public class StudentSearch {
	Scanner scan = new Scanner(System.in);
	int[] print(int array[]) {
		System.out.print("검색할 학생의 번호를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num+"번 학생의 성적은 "+array[num-1]+"입니다.\n");
		return array;
	}
}
