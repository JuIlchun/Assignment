package ksnu.juhyun.report07;

public class Professor extends Researcher{
	public String[] position = {"������","�α���","����"};
	private int positionNumber;
	public String[] tostring() {
		String[] number=new String[6];
		number[5]=position[positionNumber];
		return number;
	}
}
