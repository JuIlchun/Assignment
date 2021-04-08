package ksnu.juhyun.grading;

import java.util.Arrays;

public class StudentAveMid {
	int[] print(int array[]) {
		int sum=0;
		int person = array.length;
		for (int i=0;i<person;i++) {
			sum+=array[i];
		}
		System.out.println("평균 점수 : "+sum/person);
		
		Arrays.sort(array);
		if (person%2==0) {
			System.out.println("중위값 : "+array[person/2-1]+"과 "+array[person/2]);
		}
		else if (person%2!=0) {
			System.out.println("중위값 : "+array[person/2]);
		}
		return array;
	}
}
