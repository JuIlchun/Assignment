package ksnu.juhyun.array.practice;

public class AtoZ {
	void printAtoZ() {
		char A ='a';
		do {
			System.out.print(A);
			A=(char)(A+1);
		} while (A<='z');
		System.out.println();
	}
}
