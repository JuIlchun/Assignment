package ksnu.juhyun.grading;

public class StudentList {
	int[] print(int array[]) {
		System.out.println("-전체 학생성적 리스트 보기");
		int num=array.length;
		for(int i=0;i<num;i++){
			System.out.println(i+1+" : "+array[i]);
		}
		return array;
	}
}
