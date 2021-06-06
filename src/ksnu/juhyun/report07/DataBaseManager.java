package ksnu.juhyun.report07;

import java.util.Scanner;

public class DataBaseManager {
	Scanner scan = new Scanner(System.in);
	public Person[] mainMenu(Person[] people) {
		int input;
		while(true) {
			printMenu();
			input=scan.nextInt();
			switch (input) {
			case 1: people=inputPersonData(); break;
			case 2: printPersonData(people); break;
			case 3:	searchPersonData(people); break;
			case 4: people=editPersonData(people); break;
			case 5: people=deletePersonData(people); break;
			case 0: return people;
			}
		}
	}

	void printMenu() {
		System.out.println("<����DB���� ���α׷�>\r\n"
				+ "1. ���� ������ ������ �Է�\r\n"
				+ "2. ���� ������ ������ ��ü ���\r\n"
				+ "3. ���� ������ ������ ���� �˻�\r\n"
				+ "4. ���� ������ ������ ����\r\n"
				+ "5. ���� ������ ������ ����\r\n"
				+ "0. ���� �޴��� ���ư���");
	}
	
	Person[] inputPersonData() {
		System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?");
		int count=scan.nextInt();
		
		Person[] people = new Person[count];
		
		for (int i=0;i<count;i++) {
			System.out.println("�������� ���¸� �����ϼ���.\r\n1.�Ϲ��� 2.�л� 3.������ 4.����");
			int number=scan.nextInt();
			
			switch (number) {
			case 1:
				people[i]=new Person();
				people[i].inputPerson();
				break;
			case 2:
				people[i]=new Student();
				people[i].inputPerson();
				break;
			case 3:
				people[i]=new Researcher();
				people[i].inputPerson();
				break;
			case 4:
				people[i]=new Professor();
				people[i].inputPerson();
				break;
			}
		}
		return people;
	}

	void printPersonData(Person[] people) {
		for (Person person : people) {
			if (person instanceof Professor){
				System.out.println("���� : "+person.toString());
			}
			else if (person instanceof Researcher){
				System.out.println("������ : "+person.toString());
			}
			else if (person instanceof Student){
				System.out.println("�л� : "+person.toString());
			}
			else if (person instanceof Person){
				System.out.println("�Ϲ��� : "+person.toString());
			}
		}
	}
	
	void searchPersonData(Person[] people) {
		System.out.println("���� �߿��� �����ϼ���.\n1. �̸����� �˻� 2. ���̷� �˻�");
		int number = scan.nextInt();
		
		if (number==1) {
			searchNameData(people);
		}
		else if (number==2) {
			searchAgeData(people);
		}
	}
	
	void searchNameData(Person[] people) {
		System.out.print("�̸��Է� : ");
		String name=scan.next();
		for (Person person : people) {
			if (name.equals(person.name)) {
				System.out.println("�˻����");
				System.out.println(person.toString());
			}
		}
	}
	
	void searchAgeData(Person[] people) {
		System.out.println("���� ���� �Է� :");
		int firstage = scan.nextInt();	int secondage = scan.nextInt();
		for (Person person : people) {
			if (firstage<(2022-person.birthyear)&&secondage>(2022-person.birthyear)) {
				if (person instanceof Professor){
					System.out.println("���� : "+person.toString());
				}
				else if (person instanceof Researcher){
					System.out.println("������ : "+person.toString());
				}
				else if (person instanceof Student){
					System.out.println("�л� : "+person.toString());
				}
				else if (person instanceof Person){
					System.out.println("�Ϲ��� : "+person.toString());
				}
			}
		}
	}
	
	Person[] editPersonData(Person[] people) {
		System.out.print("������ �������� CitizenNumber���� �Է����ּ���.");
		int id = scan.nextInt();
		for (Person person : people) {
			if (person.citizenNumber==id) {
				System.out.println("������ �������� ���� �Է����ּ���.");
				person.inputPerson();
				System.out.println("�����Ǿ����ϴ�.");
			}
		}
		return people;
	}
	
	Person[] deletePersonData(Person[] people) {
		Person[] editpeople = new Person[people.length-1];
		int index=0;
		
		System.out.println("������ �������� CitizenNumber���� �Է����ּ���.");
		int id = scan.nextInt();
		
		for (Person person : people) {
			if (person.citizenNumber!=id) {
				editpeople[index]=person;
				index++;
			}
		}
		System.out.println("�����Ǿ����ϴ�.");
		return editpeople;
	}
}
