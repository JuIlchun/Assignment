package ksnu.juhyun.grading;

import java.util.Scanner;

public class Sum {
	public void printSum() {
		int sum=0, start=0, end=0;
		System.out.println("�� ���� x�� y�� �Է�(int, int): ");
		Scanner scan = new Scanner(System.in);
		start = scan.nextInt();
		end = scan.nextInt();
		sum = start;
		for(int i=start+1;i<=end;i++,System.out.println()) {
			System.out.printf(sum+"+"+i+"="+"%d",sum+i);
			sum += i;
		}
	}
}
