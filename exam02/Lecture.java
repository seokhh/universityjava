package javaprogramming2.week6.exam02;

import java.util.Scanner;

public class Lecture implements Manageable {
	String code;
	String name;
	int year;
	String day;
	String time;

	public Lecture(){

	}
	@Override
	public void read(Scanner scan) {
		code = scan.next();
		name = scan.next();
		year = scan.nextInt();
		day = scan.next();
		time = scan.next();
	}
	@Override
	public void print() {
		System.out.printf("(%s) %s (%d학년) %s%s\n", code, name, year, day, time);
	}
	@Override
	public boolean matches(String code2) {
		if (code.equals(code2))
			return true;
		return false;
	}
}