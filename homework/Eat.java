package javaprogramming2.week6.homework;

import java.util.ArrayList;
import java.util.Scanner;

class Eat implements Manageable{
	//10 1 아침 5
	int kcal;
	int month;
	int day;
	String mealType;
	int totalCalories;
	String foodName;
	int foodCount;
	private String[] foodNames;
	private int[] foodQuantities;
	private String[] foodUnits;
	@Override
	public void read(Scanner scan) {
		month = scan.nextInt();
		day = scan.nextInt();
		mealType = scan.next();
		foodCount = scan.nextInt();
		foodNames = new String[foodCount];
		foodQuantities = new int[foodCount];
		foodUnits = new String[foodCount];

		for (int i = 0; i < foodCount; i++) {
			foodNames[i] = scan.next();
			foodQuantities[i] = scan.nextInt();
			foodUnits[i] = scan.next();
			Food foodItem = Manager.findFood(foodNames[i]);
			if (foodUnits[i].equals("ml") || foodUnits[i].equals("cc") || foodUnits[i].equals("g")) {
				int perCal = foodItem.getKcal(1, foodUnits[i]) * foodQuantities[i] / Manager.findFood(foodNames[i]).getQuantity();
				kcal = perCal;
			} else {
				kcal = foodItem.getKcal(foodQuantities[i], foodUnits[i]);
			}
			totalCalories += kcal;
		}
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder(String.format("%d/%d %s %d 총칼로리: %dkcal\n", month, day, mealType, foodCount, totalCalories));

		for (int i = 0; i < foodCount; i++) {
			int individualCalories;
			String unitInfo;

			if (foodUnits[i].equals("ml") || foodUnits[i].equals("cc") || foodUnits[i].equals("g")) {
				individualCalories = Manager.findFood(foodNames[i]).getKcal(foodQuantities[i], foodUnits[i]) / foodQuantities[i];
				int quantity = Manager.findFood(foodNames[i]).getQuantity();
				int perCal = 0;
				if (quantity != 0) {
					perCal = (individualCalories * foodQuantities[i]) / quantity;
				}				unitInfo = String.format("%d%s(%dkcal) - %dkcal/1개 -> %dkcal*%d/%d%s=%dkcal",
					foodQuantities[i], foodUnits[i], perCal, individualCalories,
					individualCalories, foodQuantities[i], Manager.findFood(foodNames[i]).getQuantity(), foodUnits[i], perCal);
			} else {
				individualCalories = Manager.findFood(foodNames[i]).getKcal(foodQuantities[i], foodUnits[i]);
				unitInfo = String.format("%d%s(%dkcal) - %dkcal/1개", foodQuantities[i], foodUnits[i], individualCalories, individualCalories / foodQuantities[i]);
			}
			output.append(String.format("  %s %s\n", foodNames[i], unitInfo));
		}
		return output.toString();
	}
	@Override
	public boolean matches(String kwd) {
		if (foodName.equals(kwd))
			return true;
		return false;
	}
}