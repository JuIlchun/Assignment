package ksnu.juhyun.main;

import java.util.*;

public class Coffee {
	void choose() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� Ŀ�� �帱���??");
		String order = scan.next();
		int price=0;
		switch (order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�!");
		}
		if (price!=0) System.out.println(order + "�� " + price + "���Դϴ�");
	}
}
