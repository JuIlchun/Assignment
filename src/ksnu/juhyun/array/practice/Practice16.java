package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class Practice16 {
	Scanner scan = new Scanner(System.in);
	void sixteen() { //1 scissors 2 rock 3 paper
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		int human=0; int computer=0;
		while(true)
		{
			human=inputRockPaperScissors();
			if (human==0) {break;}
			if (human==1||human==2||human==3)
			{
				computer=randomComputer();
				judgement(human, computer);
			}
		}
	}
	
	int inputRockPaperScissors() {
		System.out.print("사용자 : ");
		String hand=scan.next();
		
		if (hand.equals("가위")) {return 1;}
		else if (hand.equals("바위")) {return 2;}
		else if (hand.equals("보")) {return 3;}
		else if (hand.equals("그만")) {System.out.println("게임을 종료합니다."); return 0;}
		else {System.out.println("잘못된 입력입니다!"); return 9;}
	}
	
	int randomComputer() {
		int computer=(int)(Math.random()*3+1);
		
		if (computer==1) {System.out.println("컴퓨터 : 가위");}
		else if (computer==2) {System.out.println("컴퓨터 : 바위");}
		else if (computer==3) {System.out.println("컴퓨터 : 보");}
		
		return computer;
	}
	
	void judgement(int human, int computer) {
		int differ=computer-human;
		if ((human==1&&computer==3)||(human==3&&computer==1)) {differ*=-1;}
		if (differ==0) {System.out.println("비겼습니다.");}
		else if (differ<0) {System.out.println("이겼니다.");}
		else System.out.println("졌습니다.");
	}
}
