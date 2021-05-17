package ksnu.juhyun.report08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInput {
	Scanner scanner = new Scanner(System.in);
	int scanInt() {
		int number=0;
		try{
			number=scanner.nextInt();
		}
		catch (InputMismatchException  e){
			System.out.println("InputMismatchException ¹ß»ý!");
		}
		return number;
	}
	String scanString() {
		String text="";
		text=scanner.next();
		return text;
	}
}
