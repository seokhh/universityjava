package javaprogramming2.midtermexam;

import java.util.Scanner;

public class Message implements Manageable{
    String code, date, line;

    @Override
    public void read(Scanner scanner) {
        code = scanner.next();
        date = scanner.next();
        line = scanner.next();
    }

    @Override
    public void print() {
        System.out.printf("%s (%s)  %s", code, date, line);
    }

    @Override
    public boolean matches(String kwd) {
        if (kwd.equals(code))
            return true;
        return false;
    }
}
