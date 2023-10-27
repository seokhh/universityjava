package javaprogramming2.midtermexam2;

import java.util.Scanner;

public class Message implements Manageable{
    String code;
    String date;
    String line;
    Lecture lecture;
    @Override
    public void read(Scanner scan) {
        code = scan.next();
        date = scan.next();
        line = scan.nextLine();
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) %s", code, date, line);
        System.out.println();
    }

    @Override
    public boolean matches(String kwd) {
        if (code.equals(kwd))
            return true;
        if (date.contains(kwd))
            return true;
    return false;
    }
}
