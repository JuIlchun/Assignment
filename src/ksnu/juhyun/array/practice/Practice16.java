package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class Practice16 {
	Scanner scan = new Scanner(System.in);
	void sixteen() { //1 scissors 2 rock 3 paper
		String Rpc="";
		int human=0; int computer=0;
		while(true)
		{
			System.out.print("사용자 : ");
			Rpc=scan.next();
			if (Rpc.equals("그만")) {break;}
			else if (Rpc.equals("가위")) {human=1;}
			else if (Rpc.equals("바위")) {human=2;}
			else if (Rpc.equals("보")) {human=3;}
			else {System.out.println("잘못된 입력입니다!"); break;}
			
			computer=(int)(Math.random()*3+1);
			if (computer==1) {System.out.println("컴퓨터 : 가위");}
			else if (computer==2) {System.out.println("컴퓨터 : 바위");}
			else if (computer==3) {System.out.println("컴퓨터 : 보");}
			
			int differ=computer-human;
			if ((human==1&&computer==3)||(human==3&&computer==1)) {differ*=-1;}
			if (differ==0) {System.out.println("비겼습니다.");}
			else if (differ<0) {System.out.println("이겼니다.");}
			else System.out.println("졌습니다.");
		}
	}
}
