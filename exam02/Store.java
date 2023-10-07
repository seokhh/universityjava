package javaprogramming2.week5.exam02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	Scanner scan = new Scanner(System.in);
	static ArrayList<Item> itemList = new ArrayList<>();
	static ArrayList<User> userList = new ArrayList<>();
	void run() {
		readAllItems();
		readAllUsers();
		menu();
	}
	void menu() {
		int num;
		while (true) {
			System.out.print("(1)물품출력 (2)사용자출력 (3)검색 (기타) 종료 ");
			num = scan.nextInt();
			if (num < 1 || num > 3) break;
			switch(num) {
			case 1: printAllItems(); break;
			case 2: printAllUsers(); break;
			case 3: searchMenu(); break;
			default: break;
			}
		}
	}
	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)물품검색 (2)사용자검색 (기타) 종료 ");
			num = scan.nextInt();
			if (num < 1 || num > 2) break;
			switch(num) {
			case 1: searchAllItems(); break;
			case 2: searchAllUsers(); break;
			default: break;
			}
		}
	}
	void searchAllItems() {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			if (kwd.contentEquals("end"))
				break;
			for (Item m: itemList) {
				if (m.matches(kwd))
					m.print();			
			}
		}
	}

	void searchAllUsers() {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			if (kwd.contentEquals("end"))
				break;
			for (User u: userList) {
				if (u.matches(kwd))
					u.print();			
			}
		}
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e)
		{
			System.out.println("파일 입력 오류");
			System.exit(0);
		}
		return filein;
	}
	void readAllItems() {
		Scanner filein = openFile("items.txt");
		Item m = null;
		while (filein.hasNext()) {
			m = new Item();
			m.read(filein);
			itemList.add(m);
		}	
	}

	void readAllUsers() {
		Scanner filein = openFile("user.txt");
		User u = null;
		while (filein.hasNext()) {
			u = new User();
			u.read(filein);
			userList.add(u);
		}	
	}
	
	static Item findItem(String kwd) {
		for (Item m: itemList) {
			if (m.matches(kwd))
				return m;
		}
		return null;
	}
	void printAllItems() {
		for (Item m: itemList) {
			m.print();
		}		
	}
	void printAllUsers() {
		for (User u: userList) {
			u.print();
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		store.run();
	}
}
