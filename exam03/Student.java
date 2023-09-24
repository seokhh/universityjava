package javaprogramming2.week3.exam03;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    String name;
    int id;
    String phone;
    int year;
    ArrayList<Lecture> registeredList = new ArrayList<>();

    void read(Scanner scan, int id, Department department) {
        this.id = id;
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();
        String code;
        Lecture lec;
        while(true){
            code = scan.next();
            if(code.contentEquals("0"))
                break;
            lec = department.findLecture(code);
            registeredList.add(lec);
        }
    }

    void print() { // Student
        System.out.format("%d %s %s (%d학년) ", id, name, phone, year);
        System.out.println();
        for(Lecture lec: registeredList){
            System.out.print("\t");
            lec.print();
        }
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
}