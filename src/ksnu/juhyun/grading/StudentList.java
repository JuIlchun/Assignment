package ksnu.juhyun.grading;

public class StudentList {
	int[] print(int array[]) {
		System.out.println("-��ü �л����� ����Ʈ ����");
		int num=array.length;
		for(int i=0;i<num;i++){
			System.out.println(i+1+" : "+array[i]);
		}
		return array;
	}
}
