package ksnu.juhyun.report07;

public class Researcher extends Person{
	public int employeeNumber;
	public String dept;
	public String[] tostring() {
		String[] number=new String[5];
		number[3]=Integer.toString(employeeNumber);
		number[4]=dept;
		return number;
	}
}
