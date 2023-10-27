package javaprogramming2.midtermexam2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Manageable {
	String name;
	String phone;
	int year;

	ArrayList<Message> registeredList = new ArrayList<>();

	@Override
	public void read(Scanner scan) {
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		String code;
		Message lecture = null;
		while (true) {
			code = scan.next();
			if (code.equals("0"))
				break;
			lecture = (Message) Department.msgMgr.find(code);
			if (lecture == null)
				System.out.println("null: "+code);
			registeredList.add(lecture);
		}
	}

	@Override
	public void print() { // Student
		System.out.format("%s %s (%d학년)\n", name, phone, year);
		for (Message mylec : registeredList) {
			System.out.print("");
			mylec.print();
		}
	}

	@Override
	public boolean matches(String kwd) {
		if (name.contentEquals(kwd))
			return true;
		return false;
	}
}