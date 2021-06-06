package ksnu.juhyun.report09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInput {
	Scanner scanner = new Scanner(System.in);
	int scanInt() {//Int형 숫자를 입력할때 사용
		int number=0;
		try{
			number=scanner.nextInt();
		}
		catch (InputMismatchException  e){//Try Catch를 사용해 InputMismatchException오류를 해결
			System.out.println("InputMismatchException 발생!");
		}
		return number;
	}
	String scanString() {//문자열 String을 입력할때 사용
		String text="";
		text=scanner.next();
		return text;
	}
}
