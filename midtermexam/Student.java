package javaprogramming2.midtermexam;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Manageable{
    String name, phone;
    int year;
    ArrayList<Lecture> registeredList = new ArrayList<>();

    @Override
    public void read(Scanner scanner) {
        name = scanner.next();
        phone = scanner.next();
        year = scanner.nextInt();
        String code;
        Lecture lecture = null;
        while (true) {
            code = scanner.next();
            if (code.equals("0"))
                break;
            lecture = (Lecture) Main.lectureMgr.find(code);
            if (lecture == null)
                System.out.println("null: "+code);
            registeredList.add(lecture);
        }
    }

    @Override
    public void print() {
        System.out.format("[%s] %s (%d학년)\n", name, phone, year);
        for (Lecture mylec : registeredList) {
            System.out.print("\t");
            mylec.print();
        }
    }

    @Override
    public boolean matches(String kwd) {
        if (name.contentEquals(kwd))
            return true;
        return false;
    }
}
