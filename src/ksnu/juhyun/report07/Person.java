package ksnu.juhyun.report07;

public class Person {
	public int citizenNumber;
	public String name;
	public int birthyear;
	public String[] tostring() {
		String[] number=new String[3];
		number[0]=Integer.toString(citizenNumber);
		number[1]=name;
		number[2]=Integer.toString(birthyear);
		return number;
	}
}
