package ksnu.juhyun.grading;

import java.util.Scanner;

public class GradingMenu {
	Scanner Scan = new Scanner(System.in);
	Student Student = new Student();
	StudentRepre Repre = new StudentRepre();
	void Menu() {
		int[] array = {0};
		while (true) {
			this.Print();
			int num = Scan.nextInt();
			switch (num) {
			case 1: array=Student.Input(array); break;
			case 2: Student.List(array); break;
			case 3: Student.Search(array); break;
			case 4: Repre.MaxMin(array); break;
			case 5: Repre.AveMid(array); break;
			case 6: Student.Sort(array); break;
			case 0: return;
			}
		}	
	}
	void Print() {
		System.out.print("<학생 성적 처리 프로그램>\r\n"
				+"1) 학생 성적 입력\r\n"
				+"2) 하생 전체 성적 리스트 보기\r\n"
				+"3) 학생의 번호로 성적 보기\r\n"
				+"4) 성적 최고 점수, 최저 점수 보기\r\n"
				+"5) 성적 평균 점수, 중위값 점수 보기\r\n"
				+"6) 성적 정렬해서 보기\r\n"
				+"0) 메인 메뉴로 돌아감\r\n");
	}
}
