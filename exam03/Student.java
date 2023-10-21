package javaprogramming2.week7.exam03;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Manageable, Comparable<Student> {

	String name;
	int id;
	String phone;
	int year;
	ArrayList<Lecture> registeredList = new ArrayList<>();

	@Override
	public void read(Scanner scan) {
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		String code;
		Lecture lecture = null;
		while (true) {
			code = scan.next();
			if (code.equals("0"))
				break;
			lecture = Department.lectureMgr.find(code);
			if (lecture == null)
				System.out.println("null: " + code);
			registeredList.add(lecture);
		}
	}

	@Override
	public void print() { // Student
		System.out.format("%d %s %s (%d학년)\n", id, name, phone, year);
		/*for (Lecture mylec : registeredList) {
			System.out.print("\t");
			mylec.print();
		}*/
	}

	@Override
	public boolean matches(String kwd) {
		if (name.contentEquals(kwd))
			return true;
		return ("" + id).contentEquals(kwd);
	}

	@Override
	public int compareTo(Student other) {
		if (year > other.year) return 1;
		if (year < other.year) return -1;
		if (!name.equals(other.name))
			return name.compareTo(other.name);
		if (id > other.id) return 1;
		if (id < other.id) return -1;
		return 0;
	}
}