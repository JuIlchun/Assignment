package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class Practice16 {
	Scanner scan = new Scanner(System.in);
	void sixteen() { //1 scissors 2 rock 3 paper
		String Rpc="";
		int human=0; int computer=0;
		while(true)
		{
			System.out.print("����� : ");
			Rpc=scan.next();
			if (Rpc.equals("�׸�")) {break;}
			else if (Rpc.equals("����")) {human=1;}
			else if (Rpc.equals("����")) {human=2;}
			else if (Rpc.equals("��")) {human=3;}
			else {System.out.println("�߸��� �Է��Դϴ�!"); break;}
			
			computer=(int)(Math.random()*3+1);
			if (computer==1) {System.out.println("��ǻ�� : ����");}
			else if (computer==2) {System.out.println("��ǻ�� : ����");}
			else if (computer==3) {System.out.println("��ǻ�� : ��");}
			
			int differ=computer-human;
			if ((human==1&&computer==3)||(human==3&&computer==1)) {differ*=-1;}
			if (differ==0) {System.out.println("�����ϴ�.");}
			else if (differ<0) {System.out.println("�̰�ϴ�.");}
			else System.out.println("�����ϴ�.");
		}
	}
}
