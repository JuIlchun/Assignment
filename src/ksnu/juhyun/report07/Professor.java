package ksnu.juhyun.report07;

public class Professor extends Researcher{
	public String[] position = {"조교수","부교수","교수"};
	private int positionNumber;
	public String[] tostring() {
		String[] number=new String[6];
		number[5]=position[positionNumber];
		return number;
	}
}
