package javaprogramming2.week4.homework;

import java.util.Scanner;

public class Lecture {
//2 DD748	시스템소프트웨어	2 수 123 www.fliplearning.com/dd748
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
    void printLectureType(){
        System.out.printf("[일반] ");
    }
    void print() {
        printLectureType();
        System.out.printf("[%s] %s (%d학년) %s %s\n", code, name, year, day, time);
    }
    public boolean matches(String code2) {
        if(code.equals(code2))
            return true;
        return false;
    }
}