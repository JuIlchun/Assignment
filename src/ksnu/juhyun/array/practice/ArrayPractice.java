package ksnu.juhyun.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	Scanner scan = new Scanner(System.in);
	void practice8() {
		int amount=scan.nextInt();
		int[] arrangement=new int[amount];
		boolean[] isCheck= new boolean[100];
		for (int i=0;i<amount;i++) {
			int number = (int)(Math.random()*100+1);
			while(isCheck[number]==true) {
				number = (int)(Math.random()*100+1);
			}
			arrangement[i]=number;
			isCheck[arrangement[i]]=true;
			System.out.print(arrangement[i]);
		}
	}
	void practice10() {
		int[][] arrangement=new int[4][4];
		boolean[][] isCheck=new boolean[4][4];
		int number=(int)(Math.random()*10+1);
		int x=(int)(Math.random()*4); int y=(int)(Math.random()*4);
		while(isCheck[x][y]==true) {
			x=(int)(Math.random()*4); y=(int)(Math.random()*4);
		}
		arrangement[x][y]=number;
		isCheck[x][y]=true;
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(arrangement[i][j]);
			}
			System.out.println("");
		}
	}
	void practice16() { //1 scissors 2 rock 3 paper
		System.out.print("����� : ");
		String Rpc=scan.next();
		int human=0;
		while(!Rpc.equals("�׸�"))
		{
			int computer=(int)(Math.random()*3);
			if (computer==1) {System.out.print("��ǻ�� : ����");}
			else if (computer==2) {System.out.print("��ǻ�� : ����");}
			else if (computer==3) {System.out.print("��ǻ�� : ��");}
			if (Rpc.equals("����")) {human=1;}
			else if (Rpc.equals("����")) {human=2;}
			else if (Rpc.equals("��")) {human=3;}
			int differ=computer-human;
			if ((human==1&&computer==3)||(human==3&&computer==1)) {differ*=-1;}
			if (differ==0) {System.out.print("�����ϴ�.");}
			else if (differ<0) {System.out.print("�̰�ϴ�.");}
			else System.out.print("�����ϴ�.");
		}
	}

}
