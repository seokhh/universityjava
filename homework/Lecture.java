package javaprogramming2.week3.homework;

import java.util.Scanner;

public class Lecture {

    String code;
    String name;
    int year;
    String day;
    String time;

    Lecture(String code) {
        this.code = code;
    }
    void read(Scanner scan) {
        name = scan.next();
        year = scan.nextInt();
        day = scan.next();
        time = scan.next();
    }
    void print() {
        System.out.printf("[%s] %s (%d학년) %s %s\n", code, name, year, day, time);

    }

    public boolean matches(String code2) {
        if(code.equals(code2))
            return true;
        return false;
    }
}