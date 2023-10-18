package javaprogramming2.week6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Food implements Manageable{
	//1 패스트푸드	 치킨		조각	 290
	static int serialNo=0;
	int id;
	int type;
	String foodtype;
	String name;
	String unit;
	int cal;
	String measure;
	Food() {
		id = ++serialNo;
	}
	int quantity;

	@Override
	public void read(Scanner scan) {
		type = scan.nextInt();
		foodtype = scan.next();
		name = scan.next();
		unit = scan.next();
		cal = scan.nextInt();
		if (type == 2) {
			quantity = scan.nextInt();
			measure = scan.next();
		}
		Manager.foodMap.put(name, this);
	}
	@Override
	public String toString() {
		if (type == 1)
			return String.format("[%d] %s-%s (%dkcal/%s)", id, foodtype ,name, cal, unit);
		else if (type == 2) {
			return String.format("[%d] %s-%s (%dkcal/%s) %d%s", id, foodtype ,name, cal, unit, quantity, measure);
		}
		return null;
	}

	@Override
	public boolean matches(String kwd) {
		if (name.equals(kwd))
			return true;
		return false;
	}
	int getKcal(int s, String u) {
		return s * cal;
	}
	public int getQuantity() {
		return quantity;
	}
}