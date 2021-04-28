package ksnu.juhyun.array.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice8 {
	Scanner scan = new Scanner(System.in);
	void eight() {
		try {
			System.out.print("정수를 몇개 저장할까요? ");
			int amount=scan.nextInt();
			inputArray(amount);
		}
		catch (InputMismatchException i) {
			System.out.println("InputMismatchException 발생!");
		}
	}
	void inputArray(int amount) {
		int[] arrangement=new int[amount+1];
		boolean[] isCheck= new boolean[101];
		
		for (int i=1;i<amount+1;i++) {
			int number = (int)(Math.random()*100+1);
			
			while(isCheck[number]==true) {
				number = (int)(Math.random()*100+1);
			}
			arrangement[i]=number;
			isCheck[arrangement[i]]=true;
			
			System.out.print(arrangement[i]+" ");
			if (i%10==0) {System.out.println("");}
		}
	}
}