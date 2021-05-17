package ksnu.juhyun.report07;

public class Professor extends Researcher{
	protected String position;
	
	public String toString() {
		return Integer.toString(citizenNumber)+" "+name+" "+Integer.toString(birthyear)+" "+Integer.toString(employeeNumber)+" "+dept+" "+position;
	}
	public void inputPerson() {
		citizenNumber=scan.nextInt();
		name=scan.next();
		birthyear=scan.nextInt();
		employeeNumber=scan.nextInt();
		dept=scan.next();
		position=scan.next();
	}
}
