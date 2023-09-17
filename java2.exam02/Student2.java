package javaprogramming2.week2.exam02;

import java.util.Scanner;

public class Student2 {
    String name;
    int id;
    String phone;
    int year;
    void read(Scanner scan, int id){
        this.id = id;
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();
    }
    void print(){
        System.out.format("%d %s %s (%d학년)\n", id, name, phone, year);
    }

    boolean matches(String kwd) {
        if (kwd.equals(name))
            return true;
        if (kwd.equals("" + id))
            return true;
        if (kwd.equals(phone))
            return true;
        return false;
    }
}
