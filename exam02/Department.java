package javaprogramming2.week7.exam02;

import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager<Student> studentMgr = new Manager<Student>();
	static Manager<Lecture> lectureMgr = new Manager<Lecture>(); //인스턴시에이션
	void run() {
		lectureMgr.readAll("lecture.txt", new Factory <Lecture>() {
			@Override
			public Lecture create() {
				return new Lecture();
			}
		});
		lectureMgr.printAll();
		studentMgr.readAll("student.txt", () -> new Student()); //람다식 구현 Student::new 도 가능함 static 메소드를 던지는 방식
		studentMgr.printAll();
		searchMenu();
	}

	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)강의검색 (2)학생 (기타) 종료 ");
			num = scan.nextInt();
			switch (num) {
				case 1 -> lectureMgr.search(scan);
				case 2 -> studentMgr.search(scan);
				default -> {
				}
			}
		}
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}