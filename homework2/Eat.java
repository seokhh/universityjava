package javaprogramming2.week6.homework2;

import java.util.ArrayList;
import java.util.Scanner;

class Eat {
	Food food;
	int qnty;
	String unit;
	int kcal;
	void read(Scanner scan, Dine main) {
		String name = scan.next();
		food = main.findFood(name);
		qnty = scan.nextInt();
		kcal = getKcal();
		unit = food.unit;
	}
	@Override
	public String toString() {
		return String.format("%s %d%s(%dkcal) - %s", 
				food.name, qnty, unit, kcal, food.getDetail(qnty, unit));
	}
	int getKcal() {
		return food.getKcal(qnty,  unit);
	}
}