package javaprogramming2.week2.homework;

import java.util.Scanner;

public class Friend {
    String name, phoneNumber, address, major;

    void read(Scanner scan, String name) {
        this.name = name;
        phoneNumber = scan.next();
        address = scan.next();
        major = scan.next();
    }

    void print() {
        System.out.format("%s, %s, %s, %s\n",
            name, phoneNumber, address, major);
    }
    boolean matches(String kwd) {
        // TODO Auto-generated method stub
        if (name.contains(kwd))
            return true;
        if (kwd.length() >= 4 && phoneNumber.contains(kwd))
            return true;
        if (address.equals(kwd))
            return true;
        return (kwd.length() > 1 && (major).equals(kwd));
    }

    boolean matches(String[] kwdArr) {
        // TODO Auto-generated method stub
        for (String kwd : kwdArr) {
            if (kwd.charAt(0) == '-') {
                if (matches(kwd.substring(1)))
                    return false;
            }
            else if (!matches(kwd))
                return false;
        }
        return true;
    }
}
