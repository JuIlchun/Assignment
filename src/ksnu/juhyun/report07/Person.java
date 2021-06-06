package ksnu.juhyun.report07;

import java.util.*;

public class Person implements Comparable<Person> {
	Scanner scan = new Scanner(System.in);
	protected int citizenNumber;
	protected String name;
	protected int birthyear;
	protected int Ranking;
	protected ArrayList<int[]> inoutBooks = new ArrayList<int[]>();
	
	public String toString() {
		return Integer.toString(citizenNumber)+" "+name+" "+Integer.toString(birthyear);
	}
	
	public void inputPerson() {
		citizenNumber=scan.nextInt();
		name=scan.next();
		birthyear=scan.nextInt();
	}
	
	public int getCitizenNumber() {
		return citizenNumber;
	}
	
	public void setCitizenNumber(int citizenNumber) {
		this.citizenNumber = citizenNumber;
	}
	
	public ArrayList<int[]> getInoutBooks() {
		return inoutBooks;
	}
	
	public void setInoutBooks(ArrayList<int[]> inoutBooks) {
		this.inoutBooks = inoutBooks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRanking() {
		return Ranking;
	}
	
	public void setRanking(int ranking) {
		Ranking = ranking;
	}

	@Override
	public int compareTo(Person person) {
		if (this.Ranking<person.Ranking) {
			return 1;
		}
		else if (this.Ranking==person.Ranking) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
