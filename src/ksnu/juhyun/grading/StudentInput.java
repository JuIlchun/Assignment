package ksnu.juhyun.grading;

import java.util.Scanner;

public class StudentInput {
	Scanner scan = new Scanner(System.in);
	int[] input(int[] array) {
		System.out.println("ó���� �л� ���� �Է��ϼ��� : ");
		int person = scan.nextInt();
		array = new int[person];
		for (int i=0;i<person;i++) {
			int score= scan.nextInt();			
			array[i]=score;
		}
		return array;
	}
}
