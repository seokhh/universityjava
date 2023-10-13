package javaprogramming2.week6.exam03;

import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager studentMgr = new Manager();
	static Manager lectureMgr = new Manager();
	void run() {
		lectureMgr.readAll("lecture.txt", new Factory() {
			@Override
			public Manageable create() {
				return new Lecture();		//무명클래스 이게 제일 많이 쓰임
			}
		});
		lectureMgr.printAll();
		class StudentFac implements Factory{
			public Manageable create(){
				return new Student();
			}
		}
		studentMgr.readAll("student.txt", new StudentFac());	//로컬클래스 앞에서 정의해줘야함 중첩클래스도 사용가능
		studentMgr.printAll();
		searchMenu();
	}
	/*class StudentFac implements Factory{
		public Manageable create(){
			return new Student();
		}
	}*/
	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)강의검색 (2)학생 (기타) 종료 ");
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