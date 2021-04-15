package ksnu.juhyun.array.practice;

import java.util.*;

public class Multipl {
	int[] scan()
	{
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		if (first>second)
		{
			int k = first;
			first = second;
			second = k;
		}
		int[] array = {first, second};
		return array;
	}
	
	void print(int[] whicharr, int[] numarr)
	{
		for (int i=whicharr[0];i<=whicharr[1];i++)
		{
			for (int j=numarr[0];j<=numarr[1];j++)
			{
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
	}

	void ChooseMultipl()
	{
		int[] whicharr;
		int[] numarr;
		System.out.println("몇 단부터 몇 단까지 구구단을 출력할까요?");
		whicharr = this.scan();
		if ((whicharr[0]==0)&&(whicharr[1]==0)) {System.exit(0);}
		System.out.println("어느 수부터 어느 수까지 곱할까요?");
		numarr = this.scan();
		if ((numarr[0]==0)&&(whicharr[1]==0)) {System.exit(0);}
		this.print(whicharr, numarr);
	}
}
