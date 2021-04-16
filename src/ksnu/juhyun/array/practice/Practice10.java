package ksnu.juhyun.array.practice;

public class Practice10 {
	void ten() {
		int[][] arrangement=new int[4][4];
		boolean[][] isCheck=new boolean[4][4];
		for (int i=0;i<10;i++)
		{
			int number=(int)(Math.random()*10+1);
			int x=(int)(Math.random()*4); int y=(int)(Math.random()*4);
			while(isCheck[x][y]==true) {
				x=(int)(Math.random()*4); y=(int)(Math.random()*4);
			}
			arrangement[x][y]=number;
			isCheck[x][y]=true;
		}
		printArray(arrangement);
	}
	
	void printArray(int[][] arrangement) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(arrangement[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
