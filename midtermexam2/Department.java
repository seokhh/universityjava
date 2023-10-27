package javaprogramming2.midtermexam2;

import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager studentMgr = new Manager();
	static Manager lectureMgr = new Manager();
	static Manager msgMgr = new Manager();
	void run() {
		msgMgr.readAll("notices.txt", Message::new);
		class StudentFac implements Factory{
			public Manageable create(){
				return new Student();
			}
		}
		studentMgr.readAll("students.txt", new StudentFac());
		studentMgr.printAll();
		searchMenu();
	}
	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)학생이름 검색 (2)과목검색 (3)강의별 메세지(기타) 종료 ");
			num = scan.nextInt();
			switch (num){
				case 1: studentMgr.search(scan); break;
				case 2: searchMenu2();
				case 3: lectureMgr.printAll();
				default: break;
			}
		}
	}

	void searchMenu2() {
		int num;
		while (true){
			System.out.print("(1)날짜로 과목 검색  (2)메시지 개수로 과목 검색 => ");
			num = scan.nextInt();
			switch (num){
				case 1: msgMgr.search(scan);
				case 2: lectureMgr.search(scan);
			}
		}
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}