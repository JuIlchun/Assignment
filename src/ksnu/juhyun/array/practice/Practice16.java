package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class Practice16 {
	Scanner scan = new Scanner(System.in);
	void sixteen() { //1 scissors 2 rock 3 paper
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
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
		System.out.print("����� : ");
		String hand=scan.next();
		
		if (hand.equals("����")) {return 1;}
		else if (hand.equals("����")) {return 2;}
		else if (hand.equals("��")) {return 3;}
		else if (hand.equals("�׸�")) {System.out.println("������ �����մϴ�."); return 0;}
		else {System.out.println("�߸��� �Է��Դϴ�!"); return 9;}
	}
	
	int randomComputer() {
		int computer=(int)(Math.random()*3+1);
		
		if (computer==1) {System.out.println("��ǻ�� : ����");}
		else if (computer==2) {System.out.println("��ǻ�� : ����");}
		else if (computer==3) {System.out.println("��ǻ�� : ��");}
		
		return computer;
	}
	
	void judgement(int human, int computer) {
		int differ=computer-human;
		if ((human==1&&computer==3)||(human==3&&computer==1)) {differ*=-1;}
		if (differ==0) {System.out.println("�����ϴ�.");}
		else if (differ<0) {System.out.println("�̰�ϴ�.");}
		else System.out.println("�����ϴ�.");
	}
}
