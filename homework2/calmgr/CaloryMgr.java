package javaprogramming2.week6.homework2.calmgr;

import java.util.Scanner;
import javaprogramming2.week6.homework2.mgr.Calory;
import javaprogramming2.week6.homework2.mgr.Factory;
import javaprogramming2.week6.homework2.mgr.Manager;

public class CaloryMgr {
	static Manager foodMgr = new Manager();
	Manager dineMgr = new Manager();
	
	void run() {
		foodMgr.readAll("food.txt", new Factory() {
			public Calory create(Scanner scan) {
				int n = scan.nextInt();
				if (n == 1) return (Calory) new Food();
				return new DetailFood();
			}
		});
		foodMgr.printAll();
		System.out.println();
		dineMgr.readAll("eats-input.txt", new Factory() {
			public Calory create(Scanner scan) {
				return (Calory) new Dine();
			}
		});
		dineMgr.printAll();
	}
	
	public static void main(String[] args) {
		CaloryMgr calmg = new CaloryMgr();
		calmg.run();
	}
}
