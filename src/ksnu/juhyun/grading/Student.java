package ksnu.juhyun.grading;

import java.util.*;

public class Student{
	Scanner scan = new Scanner(System.in);
	
	int[] Input(int[] array) {
		System.out.println("ó���� �л� ���� �Է��ϼ��� : ");
		int person = scan.nextInt();
		array = new int[person];
		for (int i=0;i<person;i++) {
			int score= scan.nextInt();			
			array[i]=score;
		}
		return array;
	}
	
	int[] List(int array[]) {
		System.out.println("-��ü �л����� ����Ʈ ����");
		int num=array.length;
		for(int i=0;i<num;i++){
			System.out.println(i+1+" : "+array[i]);
		}
		return array;
	}
	
	int[] Search(int array[]) {
		System.out.print("�˻��� �л��� ��ȣ�� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println(num+"�� �л��� ������ "+array[num-1]+"�Դϴ�.");
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
