package javaprogramming2.week3.exam01;

import java.util.Scanner;

public class Student {

    String name;
    int id;
    String phone;
    int year;
    Team myTeam;

    void read(Scanner scan, int id) {
        this.id = id;
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();
    }

    void print() { // Student
        System.out.format("%d %s %s (%d학년)\n",
            id, name, phone, year);
    }

    boolean matches(String kwd) {
        // TODO Auto-generated method stub
        if (name.contains(kwd))
            return true;
        if (kwd.length() >= 4 && phone.contains(kwd))
            return true;
        if (kwd.contentEquals("" + year))
            return true;
        return (kwd.length() > 4 && ("" + id).contains(kwd));
    }

    boolean matches(String[] kwdArr) {
        // TODO Auto-generated method stub
        for (String kwd : kwdArr) {
            if (kwd.charAt(0) == '-') {
                if (matches(kwd.substring(1)))
                    return false;
            } else if (!matches(kwd))
                return false;
        }
        return true;
    }
    public void setTeam(Team team) {
        myTeam = team;
    }
}