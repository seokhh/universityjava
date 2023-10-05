package javaprogramming2.week5.exam01;

import java.util.Scanner;

public class Tissue implements Manageable{
    String tissueName;
    int nSheets;
    int price;

    @Override
    public void read(Scanner scan) {
        tissueName = scan.next();
        nSheets = scan.nextInt();
        price = scan.nextInt();
    }

    @Override
    public void print() {
        System.out.printf("\t%s %d장 [%d원]\n", tissueName, nSheets, price);
    }

    @Override
    public boolean matches(String kwd) {
        if (kwd.contentEquals("티슈"))
            return true;
        if (tissueName.contains(kwd))
            return true;
        if (kwd.contentEquals(""+nSheets))
            return true;
        return false;
    }
}
