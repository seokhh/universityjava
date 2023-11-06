package javaprogramming2.week9.exam04.store;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javaprogramming2.week9.exam04.mgr.Factory;
import javaprogramming2.week9.exam04.mgr.Manager;

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
            System.out.print("(1)물품출력 (2)사용자출력 (3)검색 (4) 정렬 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 4) break;
            switch (num) {
                case 1 -> itemMgr.printAll();
                case 2 -> userMgr.printAll();
                case 3 -> searchMenu();
                case 4 -> itemSort();
                default -> {
                }
            }
        }
    }
    void itemSort(){
        int num;
        while (true) {
            System.out.print("(1)이름정렬 (2)가격정렬 (3)코드정렬 (기타) 종료 ");
            num = scan.nextInt();
            if (num < 1 || num > 3) break;
            switch (num) {
                case 1 -> {
                    Collections.sort(itemMgr.mList);
                    itemMgr.printAll();
                } //리스트 순서를 바꿔버리니 한개를 복제를 하고 한다. 그걸 프린트할려하지만 프린트는 manager 기능이라 어렵다.
                /*case 2 -> {
                    Collections.sort(itemMgr.mList, new Comparator<Item>() {
                        @Override
                        public int compare(Item o1, Item o2) {
                            //if (o1.price > o2.price) return 1;
                            //if (o1.price == o2.price) return 0;
                            return o1.price - o2.price; //크면 양수 같으면 0 작으면 음수로 반환
                        }
                    });
                    itemMgr.printAll();
                }*/
                case 2 -> {
                    itemMgr.sortAndPrint(new Comparator<Item>() { //소트하고 프린트하면서 즉각즉각 정렬하고 프린트해줌
                        @Override
                        public int compare(Item o1, Item o2) {
                            return o1.price - o2.price; //크면 양수 같으면 0 작으면 음수로 반환
                        }
                    });
                    itemMgr.printAll();
                }
                case 3 -> {
                    Collections.sort(itemMgr.mList, new Comparator<Item>() {
                        @Override
                        public int compare(Item o1, Item o2) {
                            return o1.code.compareTo(o2.code);
                        }
                    });
                    itemMgr.printAll();
                }
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