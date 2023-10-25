package javaprogramming2.middleExam;

import java.util.Scanner;

public class Item implements Manageable{
    String name;
    int number;
    String itemNum;
    String company;
    String object;
    int num;
    int price;
    int last;
    int sell;
    String type;


    @Override
    public void read(Scanner scan) {
        name = scan.next();
        number = scan.nextInt();
        itemNum = scan.next();
        company = scan.next();
        object = scan.next();
        num = scan.nextInt();
        price = scan.nextInt();
        last = scan.nextInt();
        sell = scan.nextInt();
        type = scan.next();
    }

    @Override
    public void print() {
        System.out.printf("%s [%d] %s - %s %s %d %d %d %d (%s)",
            name, number, itemNum, company, object, num, price, last, sell, type);
    }

    @Override
    public boolean matches(String kwd) {
        if (kwd.contentEquals(name))
            return true;
        return false;
    }

    int getPrice (String n) {
        if (n.equals(company)) {
            return price;
        } else {
            // Handle the case when 'n' does not match the 'company' field
            return 0; // Or any other default value or error handling logic
        }
    }
}
