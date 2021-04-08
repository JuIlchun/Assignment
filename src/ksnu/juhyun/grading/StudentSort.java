package ksnu.juhyun.grading;

import java.util.Arrays;

public class StudentSort {
	int[] print(int list[]) {
		int[] array = list.clone();
		int person = array.length;
		Arrays.sort(array);
		for (int i=0;i<person;i++)
		{
			System.out.println(i+" : "+array[i]);
		}
		return array;
	}
}
