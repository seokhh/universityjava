package javaprogramming2.week5.exam01;

import java.util.Scanner;

public class Pen implements Manageable{
    String itemName;
    float mmThick;
    int price;

    @Override
    public void read(Scanner scan) {
        itemName = scan.next();
        mmThick = scan.nextFloat();
        price = scan.nextInt();
    }

    @Override
    public void print() {
        System.out.printf("\t%s %fmm [%d원]\n", itemName, mmThick, price);
    }

    @Override
    public boolean matches(String kwd) {
        if (kwd.contentEquals("펜"))
            return true;
        if (itemName.contains(kwd))
            return true;
        if (kwd.contentEquals(""+mmThick))
            return true;
        return false;
    }
}
