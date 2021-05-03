package ksnu.juhyun.midterm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MidtermScore {
	Scanner scan = new Scanner(System.in);
	int[][] inputScore() {
		int people=inputPeople();
		int[][] score = new int[3][people];
		for (int i=0;i<people;i++) {
			System.out.print(i+"번 학생 성적 입력> ");
			for (int j=0;j<3;j++) {
				try {
					score[j][i]=scan.nextInt();
				}
				catch (InputMismatchException e){
					System.out.print("오류발생! InputMismatchException!");
				}
			}
		}
		return score;
	}
	
	int inputPeople() {
		int people=0;
		System.out.print("성적입력명수> ");
		try {
			people=scan.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.print("오류발생! InputMismatchException!\n");
		}
		return people;
	}
	
	void printScore(int[][] score) {
		int people=score[0].length;
		System.out.println("Index 국어 영어 수학");
		for (int i=0;i<people;i++) {
			System.out.printf("%d %d %d %d\n",i,score[0][i],score[1][i],score[2][i]);
		}
	}
	
	int[][] editScore(int[][] score) {
		int index=inputIndex();
		System.out.printf("현재 : %d %d %d\n", score[0][index],score[1][index],score[2][index]);
		System.out.print("새로운 성적 : ");
		for (int i=0;i<3;i++) {
			try {
				score[i][index]=scan.nextInt();
			}
			catch (InputMismatchException e){
				System.out.print("오류발생! InputMismatchException!");
			}
		}
		return score;
	}
	
	int inputIndex() {
		System.out.println("학생의 Index번호?");
		int index=0;
		try {
			index=scan.nextInt();
		}
		catch (InputMismatchException e){
			System.out.print("오류발생! InputMismatchException!");
		}
		return index;
	}
	
	void printAverage(int[][] score) {
		float[] subject=new float[3];
		int people=score[0].length;
		for (int i=0;i<people;i++) {
			for (int j=0;j<3;j++) {
				subject[j]+=score[j][i];
			}
		}
		System.out.printf("국어 성적 평균 : %g ",subject[0]/people);
		System.out.printf("영어 성적 평균 : %g ",subject[1]/people);
		System.out.printf("수학 성적 평균 : %g ",subject[2]/people);
	}
	
	void printMaxMin(int[][] score) {
		int[][] index = {{0,0},{0,0},{0,0}}; int[] Max= {0,0,0}; int[] Min= {100,100,100};
		int people = score[0].length;
		for (int i=0;i<people;i++) {
			for (int j=0;j<3;j++) {
				if (score[j][i]>Max[j]) { Max[j]=score[j][i]; index[j][0]=i;}
				if (score[j][i]<Min[j]) { Min[j]=score[j][i]; index[j][1]=i;}
			}
		}
		System.out.printf("국어 최고/최저 : 최고 %d번 %d, 최저 %d번 %d\n",index[0][0],Max[0],index[0][1],Min[0]);
		System.out.printf("영어 최고/최저 : 최고 %d번 %d, 최저 %d번 %d\n",index[1][0],Max[1],index[1][1],Min[1]);
		System.out.printf("수학 최고/최저 : 최고 %d번 %d, 최저 %d번 %d\n",index[2][0],Max[2],index[2][1],Min[2]);
	}
}
