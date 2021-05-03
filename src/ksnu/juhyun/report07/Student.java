package ksnu.juhyun.report07;

public class Student extends Person{
	protected int StudentNumber;
	protected int dept;
	public String toString(int number) {
		String StudentNumber=Integer.toString(number);
		return StudentNumber; 
	}
}
