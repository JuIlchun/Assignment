package ksnu.juhyun.report07;

public class Researcher extends Person{
	protected int employeeNumber;
	protected String dept;
	
	public String toString() {
		return Integer.toString(citizenNumber)+" "+name+" "+Integer.toString(birthyear)+" "+Integer.toString(employeeNumber)+" "+dept;
	}
	public void inputPerson() {
		citizenNumber=scan.nextInt();
		name=scan.next();
		birthyear=scan.nextInt();
		employeeNumber=scan.nextInt();
		dept=scan.next();
	}
}
