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
		System.out.println("<대학DB관리 프로그램>\r\n"
				+ "1. 대학 구성원 데이터 입력\r\n"
				+ "2. 대학 구성원 데이터 전체 출력\r\n"
				+ "3. 대학 구성원 데이터 조건 검색\r\n"
				+ "4. 대학 구성원 데이터 변경\r\n"
				+ "5. 대학 구성원 데이터 삭제\r\n"
				+ "0. 메인 메뉴로 돌아가기");
	}
	
	Person[] inputPersonData() {
		System.out.println("몇 명을 입력하시겠습니까?");
		int count=scan.nextInt();
		
		Person[] people = new Person[count];
		
		for (int i=0;i<count;i++) {
			System.out.println("구성원의 형태를 선택하세요.\r\n1.일반인 2.학생 3.연구원 4.교수");
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
				System.out.println("교수 : "+person.toString());
			}
			else if (person instanceof Researcher){
				System.out.println("연구원 : "+person.toString());
			}
			else if (person instanceof Student){
				System.out.println("학생 : "+person.toString());
			}
			else if (person instanceof Person){
				System.out.println("일반인 : "+person.toString());
			}
		}
	}
	
	void searchPersonData(Person[] people) {
		System.out.println("다음 중에서 선택하세요.\n1. 이름으로 검색 2. 나이로 검색");
		int number = scan.nextInt();
		
		if (number==1) {
			searchNameData(people);
		}
		else if (number==2) {
			searchAgeData(people);
		}
	}
	
	void searchNameData(Person[] people) {
		System.out.print("이름입력 : ");
		String name=scan.next();
		for (Person person : people) {
			if (name.equals(person.name)) {
				System.out.println("검색결과");
				System.out.println(person.toString());
			}
		}
	}
	
	void searchAgeData(Person[] people) {
		System.out.println("나이 범위 입력 :");
		int firstage = scan.nextInt();	int secondage = scan.nextInt();
		for (Person person : people) {
			if (firstage<(2022-person.birthyear)&&secondage>(2022-person.birthyear)) {
				if (person instanceof Professor){
					System.out.println("교수 : "+person.toString());
				}
				else if (person instanceof Researcher){
					System.out.println("연구원 : "+person.toString());
				}
				else if (person instanceof Student){
					System.out.println("학생 : "+person.toString());
				}
				else if (person instanceof Person){
					System.out.println("일반인 : "+person.toString());
				}
			}
		}
	}
	
	Person[] editPersonData(Person[] people) {
		System.out.print("편집할 구성원의 CitizenNumber값을 입력해주세요.");
		int id = scan.nextInt();
		for (Person person : people) {
			if (person.citizenNumber==id) {
				System.out.println("수정할 구성원의 값을 입력해주세요.");
				person.inputPerson();
				System.out.println("수정되었습니다.");
			}
		}
		return people;
	}
	
	Person[] deletePersonData(Person[] people) {
		Person[] editpeople = new Person[people.length-1];
		int index=0;
		
		System.out.println("삭제할 구성원의 CitizenNumber값을 입력해주세요.");
		int id = scan.nextInt();
		
		for (Person person : people) {
			if (person.citizenNumber!=id) {
				editpeople[index]=person;
				index++;
			}
		}
		System.out.println("삭제되었습니다.");
		return editpeople;
	}
}
