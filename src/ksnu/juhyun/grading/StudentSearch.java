package ksnu.juhyun.grading;

import java.util.Scanner;

public class StudentSearch {
	Scanner scan = new Scanner(System.in);
	int[] print(int array[]) {
		System.out.print("�˻��� �л��� ��ȣ�� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println(num+"�� �л��� ������ "+array[num-1]+"�Դϴ�.\n");
		return array;
	}
}
