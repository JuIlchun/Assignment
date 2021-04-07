package ksnu.juhyun.loop2;

import java.util.Scanner;

public class MainMenu {
	public static void main(String args[])
	{
		Scanner Scan = new Scanner(System.in);
		Menuprint Menuprint = new Menuprint();
				
		int number=7;
		while (number>0)
		{
			Menuprint.print();
			number=Scan.nextInt();
			switch(number)
			{
			case 1:
				Coffee Coffee = new Coffee();
				Coffee.choose();
				break;
			case 2:
				Average Average = new Average();
				Average.getAverage();
				break;
			case 3:
				AtoZ AtoZ = new AtoZ();
				AtoZ.printAtoZ();
				break;
			case 4:
				DoSum DoSum = new DoSum();
				DoSum.printSum();
				break;
			case 5:
				Print99 Print99 = new Print99();
				Print99.run99();
				break;
			case 6:
				Multipl Multipl = new Multipl();
				Multipl.ChooseMultipl();
				break;
			}
		}
		Scan.close();
	}
}
