package ksnu.juhyun.grading;

public class StudentMaxMin {
	int[] print(int array[]) {
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
		System.out.println("�ְ� ���� : "+max+"\n���� ���� : "+min);
		return array;
	}
}
