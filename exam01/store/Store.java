package javaprogramming2.week9.exam01.store;

import java.util.Scanner;
import javaprogramming2.week9.exam01.mgr.Factory;
import javaprogramming2.week9.exam01.mgr.Manager;

public class Store {
    Scanner scan = new Scanner(System.in);
    static Manager<Item> itemMgr = new Manager<Item>();
    static Manager<User> userMgr = new Manager<User>();
    void run() {
        itemMgr.readAll("items.txt", new Factory<Item>() {
            @Override
            public Item create() {
                return new Item();
            }
        });
        userMgr.readAll("user.txt", new Factory<User>() {
            @Override
            public User create() {
                return new User();
            }
        });
        menu();
    }
    void menu() {
        int num;
        while (true) {
            System.out.print("(1)물품출력 (2)사용자출력 (3)검색 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 3) break;
            switch (num) {
                case 1 -> itemMgr.printAll();
                case 2 -> userMgr.printAll();
                case 3 -> searchMenu();
                default -> {
                }
            }
        }
    }
    void searchMenu() {
        int num;
        while (true) {
            System.out.print("(1)물품검색 (2)사용자검색 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 2) break;
            switch (num) {
                case 1 -> itemMgr.search(scan);
                case 2 -> userMgr.search(scan);
                default -> {
                }
            }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.run();
    }
}