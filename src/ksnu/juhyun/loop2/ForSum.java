package ksnu.juhyun.loop2;

public class ForSum {
	void printSum() {
		int sum=0;
		for (int i=1;i<10;i++) {
			sum+=1;
			System.out.print(i);
			if (i<=9) {
				System.out.print("+");
			}
			else {
				System.out.print("="+sum);
			}
		}
	}
}
