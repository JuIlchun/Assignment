package ksnu.juhyun.main;

import java.util.Arrays;

public class StudentRepre {
	int[] AveMid(int array[]) {
		float sum=0;
		int person = array.length;
		for (int i=0;i<person;i++) {
			sum+=array[i];
		}
		System.out.println("평균 점수 : "+sum/person);
		
		Arrays.sort(array);
		if (person%2==0) {
			System.out.println("중위값 : "+(array[person/2-1]+array[person/2])/2);
		}
		else if (person%2!=0) {
			System.out.println("중위값 : "+array[person/2]);
		}
		return array;
	}
	int[] MaxMin(int array[]) {
		int person = array.length;
		int max=0;
		int min=100;
		for (int i=0;i<person;i++) {
			if (array[i]>max) {
				max=array[i];
			}
			if (array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("최고 점수 : "+max+"\n최저 점수 : "+min);
		return array;
	}
}
