package javaprogramming2.week6.homework;

public class Dine {
	static Manager eatMgr = new Manager();
	static Manager foodMgr = new Manager();
	void mymain() {
		foodMgr.readAll("food.txt", new Factory() {
			@Override
			public Manageable create() {
				return new Food();
			}
		});
		//foodMgr.printAll();
		eatMgr.readAll("eats-input.txt", new Factory() {
			@Override
			public Manageable create() {
				return new Eat();
			}
		});
		eatMgr.printAll();
	}
	public static void main(String[] args) {
		Dine a = new Dine();
		a.mymain();
	}
}