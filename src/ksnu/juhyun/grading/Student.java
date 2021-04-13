package ksnu.juhyun.grading;

import java.util.*;

public class Student{
	Scanner scan = new Scanner(System.in);
	
	int[] Input(int[] array) {
		System.out.println("처리할 학생 수를 입력하세요 : ");
		int person = scan.nextInt();
		array = new int[person];
		for (int i=0;i<person;i++) {
			int score= scan.nextInt();			
			array[i]=score;
		}
		return array;
	}
	
	int[] List(int array[]) {
		System.out.println("-전체 학생성적 리스트 보기");
		int num=array.length;
		for(int i=0;i<num;i++){
			System.out.println(i+1+" : "+array[i]);
		}
		return array;
	}
	
	int[] Search(int array[]) {
		System.out.print("검색할 학생의 번호를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num+"번 학생의 성적은 "+array[num-1]+"입니다.");
		return array;
	}
	
	int[] Sort(int list[]) {
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
