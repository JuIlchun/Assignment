package ksnu.juhyun.grading;

import java.util.Arrays;

public class StudentAveMid {
	int[] print(int array[]) {
		int sum=0;
		int person = array.length;
		for (int i=0;i<person;i++) {
			sum+=array[i];
		}
		System.out.println("��� ���� : "+sum/person);
		
		Arrays.sort(array);
		if (person%2==0) {
			System.out.println("������ : "+array[person/2-1]+"�� "+array[person/2]);
		}
		else if (person%2!=0) {
			System.out.println("������ : "+array[person/2]);
		}
		return array;
	}
}
