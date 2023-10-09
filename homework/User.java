package javaprogramming2.week5.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Manageable {

    String id;
    String pwd;
    int point;
    int totalOrders;
    int totalSpent;
    ArrayList<Order> basket = new ArrayList<>();

    public void read(Scanner scan) {
        id = scan.next();
        pwd = scan.next();
        point = scan.nextInt();
    }
    public boolean matches(String kwd) {
        if (id.contains(kwd)) {
            return true;
        }

        for (Order order : basket) {
            if (order.matches(kwd)) {
                return true;
            }

            for (Order.OrderItem item : order.orderItemList) {
                if (item.matches(kwd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addOrder(Order order) {
        totalOrders++;
        basket.add(order);
    }

    public void print() {
        System.out.printf("[%s] %d회 총구매액 %d원 (포인트 %d점)\n", id, totalOrders, totalSpent, totalSpent / 20);

        for (Order order : basket) {
            System.out.printf("   [주문아이디: %d] %s 사용자: %s - 주문금액: %d (포인트: %d점)\n",
                order.orderId, order.date, order.user.id, order.total, (order.total / 20));

            for (Order.OrderItem item : order.orderItemList) {
                System.out.printf("\t%s %d원 x %d개 = %d원\n", item.item.name, item.item.price,
                    item.count,
                    item.item.price * item.count);
            }
        }
    }
}