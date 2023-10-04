package javaprogramming2.week4.homework;

import java.util.Scanner;

public class ELecture extends Lecture{
    ELecture(String code) {
        super(code);
    }
    String url;
    @Override
    void read(Scanner scan) {
        super.read(scan);
        url = scan.next();
    }

    @Override
    void print() {
        super.print();
        System.out.printf("\t[플립러닝] %s\n", url);
    }
    @Override
    void printLectureType(){
        System.out.printf("");
    }
    @Override
    public boolean matches(String kwd) {
        if (kwd.equals("플립러닝")){
            return true;
        }
        if (super.matches(kwd)) {
            return true;
        }
        if (url.contains(kwd)) {
            return true;
        }
        return false;
    }
}