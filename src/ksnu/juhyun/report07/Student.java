package ksnu.juhyun.report07;

public class Student extends Person{
	protected int StudentNumber;
	protected String dept;
	
	public String toString() {
		return Integer.toString(citizenNumber)+" "+name+" "+Integer.toString(birthyear)+" "+Integer.toString(StudentNumber)+" "+dept;
	}
	public void inputPerson() {
		citizenNumber=scan.nextInt();
		name=scan.next();
		birthyear=scan.nextInt();
		StudentNumber=scan.nextInt();
		dept=scan.next();
		
	}
}
