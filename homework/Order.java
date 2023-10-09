package javaprogramming2.week5.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Order implements Manageable {
    int orderId;
    User user;
    String date;
    int total;
    ArrayList<OrderItem> orderItemList = new ArrayList<>();

    void calculateTotalAndPoints() {
        total = 0;
        for (OrderItem item : orderItemList) {
            total += item.item.price * item.count;
        }
        user.totalSpent += total;
    }

    public void read(Scanner scan) {
        orderId = scan.nextInt();
        user = Store.findUser(scan.next());
        date = scan.next();

        while (true) {
            String itemCode = scan.next();
            if (itemCode.equals("0")) {
                break;
            }
            int itemCountPerItem = scan.nextInt();
            OrderItem orderItem = new OrderItem(itemCode, itemCountPerItem);
            orderItemList.add(orderItem);
        }
        user.addOrder(this);
        calculateTotalAndPoints();
    }

    @Override
    public boolean matches(String kwd) {
        if (String.valueOf(user.id).contains(kwd)) {
            return true;
        }
        if (date.contains(kwd)) {
            return true;
        }
        for (OrderItem item : orderItemList) {
            if (item.matches(kwd)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        int totalOrderAmount = 0;
        int totalPoints = 0;
        int currentOrderId = 0;

        for (OrderItem item : orderItemList) {
            int itemTotal = item.item.price * item.count;
            totalOrderAmount += itemTotal;
            totalPoints += (itemTotal / 20);

            if (currentOrderId != orderId) {
                System.out.printf("[주문아이디: %d] %s 사용자: %s- 주문금액: %d (포인트: %d점)\n",
                    orderId, date, user.id, totalOrderAmount, totalPoints);
                currentOrderId = orderId;
                totalOrderAmount = 0;
                totalPoints = 0;
            }

            System.out.printf("\t%s %d원 x %d개 = %d원\n", item.item.name, item.item.price, item.count,
                itemTotal);
        }
    }

    class OrderItem {
        Item item;
        int count;

        void read(Scanner scan) {
            String itemName = scan.next();
            item = Store.findItem(itemName);
            count = scan.nextInt();
        }

        boolean matches(String kwd) {
            if (item.name.contains(kwd)) {
                return true;
            }
            if (date.contains(kwd)) {
                return true;
            }
            if (String.valueOf(user.id).contains(kwd)) {
                return true;
            }
            return false;
        }
        void print() {
            System.out.println("상품명: " + item.name);
            System.out.println("가격: " + item.price + "원");
            System.out.println("수량: " + count);
        }
        public OrderItem(String itemCode, int count) {
            this.item = Store.findItem(itemCode);
            this.count = count;
        }
    }
}