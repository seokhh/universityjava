package javaprogramming2.week6.exam02;

import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager studentMgr = new Manager();
	static Manager lectureMgr = new Manager();
	void run() {
		lectureMgr.readAll("lecture.txt", new Factory() {
			@Override
			public Manageable create() {
				return new Lecture();
			}
		});
		lectureMgr.printAll();
		studentMgr.readAll("student.txt", new Factory() {
			@Override
			public Manageable create() {
				return new Student();
			}
		});
		studentMgr.printAll();
		searchMenu();
	}

	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)강의검색 (2)학생검색 (기타) 종료 ");
			num = scan.nextInt();
			switch (num){
				case 1: lectureMgr.search(scan); break;
				case 2: studentMgr.search(scan); break;
				default: break;
			}
		}
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}