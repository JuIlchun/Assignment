package ksnu.juhyun.report07;

import java.util.*;

public class Person {
	Scanner scan = new Scanner(System.in);
	protected int citizenNumber;
	protected String name;
	protected int birthyear;
	
	public String toString() {
		return Integer.toString(citizenNumber)+" "+name+" "+Integer.toString(birthyear);
	}
	public void inputPerson() {
		citizenNumber=scan.nextInt();
		name=scan.next();
		birthyear=scan.nextInt();
	}
}
