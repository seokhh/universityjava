package javaprogramming2.week5.exam03;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Manageable {
    String id;
    String pwd;
    int point;
    ArrayList<Item> basket = new ArrayList<>();
    public void read(Scanner scan) {
        id = scan.next();
        pwd = scan.next();
        point = scan.nextInt();  // 1%
        int num = 0;
        Item item = null;
        while (true) {
            num = scan.nextInt();
            if (num == 0) break;
            item = Store.findItem(""+num);
            basket.add(item);
        }
    }
    public boolean matches(String kwd) {
        if (id.equals(kwd))
            return true;
        return false;
    }

    public void print() {
        System.out.format("[%s] (%d점)\n", id, point);
        for (Item item: basket) {
            System.out.print("   ");
            item.print();
        }
    }
}