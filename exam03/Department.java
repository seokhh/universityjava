package javaprogramming2.week7.exam03;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager<Student> studentMgr = new Manager<Student>();
	static Manager<Lecture> lectureMgr = new Manager<Lecture>(); //인스턴시에이션
	void run() {
		lectureMgr.readAll("lecture.txt", new Factory<Lecture>() {
			@Override
			public Lecture create() {
				return new Lecture();
			}
		});
		lectureMgr.printAll();
		Collections.sort(lectureMgr.mList, new Comparator<Lecture>() {
			@Override
			public int compare(Lecture lec1, Lecture lec2) {
				int result = lec1.code.compareTo(lec2.code);
				if (result != 0) return result;
				return (lec1.name.compareTo(lec2.name));
			}
		});
		System.out.println("===정렬된 강의리스트===");
		lectureMgr.printAll();
		studentMgr.readAll("student.txt", () -> new Student()); //람다식 구현 Student::new 도 가능함 static 메소드를 던지는 방식
		studentMgr.printAll();
		Collections.sort(studentMgr.mList);
		System.out.println("===정렬된 학생리스트===");
		studentMgr.printAll();
	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}