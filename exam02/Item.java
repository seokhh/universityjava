package javaprogramming2.week5.exam02;

import java.util.Scanner;

public class Item {
	int num;
	static int count = 0;
	String code;
	String name;
	int price;
	void read(Scanner scan) {
		num = ++count;
		code = scan.next();
		name = scan.next();
		price = scan.nextInt();
	}
	void print() {
		System.out.printf("[%s] %s\t",  code,  name);
		System.out.printf("%5d원\n", price);
	}
	boolean matches(String kwd) {
		if (kwd.length() <= 2 && kwd.equals(""+num))
			return true;
		if (name.contains(kwd))
		    return true;
		if (kwd.length() > 2 && code.contains(kwd))
		    return true;
		return false;
    	}
}