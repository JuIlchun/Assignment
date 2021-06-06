package ksnu.juhyun.report09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardInput {
	Scanner scanner = new Scanner(System.in);
	int scanInt() {//Int�� ���ڸ� �Է��Ҷ� ���
		int number=0;
		try{
			number=scanner.nextInt();
		}
		catch (InputMismatchException  e){//Try Catch�� ����� InputMismatchException������ �ذ�
			System.out.println("InputMismatchException �߻�!");
		}
		return number;
	}
	String scanString() {//���ڿ� String�� �Է��Ҷ� ���
		String text="";
		text=scanner.next();
		return text;
	}
}
