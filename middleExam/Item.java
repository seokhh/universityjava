package javaprogramming2.middleExam;

import java.util.Scanner;

public class Item implements Manageable{
    Scanner scan = new Scanner(System.in);
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
    public void read(Scanner scanner) {
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

        return false;
    }
}
