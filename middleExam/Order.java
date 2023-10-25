package javaprogramming2.middleExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Order implements Manageable{
    int orderNum;
    int id;
    int total;
    ArrayList<Item> items = new ArrayList<>();

    @Override
    public void read(Scanner scan) {
        id = scan.nextInt();
        Item item = null;
        String company = null;
        while (true) {
            company = scan.next();
            if (company.equals("0")){
                break;
            }
            item = (Item) Manager.find(company);
            if (item == null) {
                System.out.println("null");
            }
            items.add(item);
            total += item.getPrice(company);
            ++orderNum;
        }
    }

    @Override
    public void print() {
        System.out.printf("[%d] 총 %d원 (%d)", id, total, orderNum);
    }

    @Override
    public boolean matches(String kwd) {
        if (kwd.equals(orderNum))
            return true;
        return false;
    }
}
