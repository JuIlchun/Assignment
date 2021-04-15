package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class Average {
	void getAverage()
	{
		Scanner Scan = new Scanner(System.in);
		int count=0;
		double sum=0;
		int i=0;
		while (( i = Scan.nextInt()) != -1) {
			sum+=i;
			count++;
		}
		System.out.println("입력된 수의 개수는 "+count+"개이며 평균은 "+sum/count+"입니다.");
	}
}
