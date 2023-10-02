package javaprogramming2.week4.exam04;

import java.util.Scanner;

public class Ebook extends Book {
    String url;
    String format;
    @Override
    void read(Scanner scan){
        super.read(scan);
        url = scan.next();
        format = scan.next();
    }
    @Override
    void print(){
        super.print();
        System.out.printf("%s [%s]\n", url, format);
    }
    @Override
    void printBookType(){
        System.out.printf("[전자책] ");
    }
    @Override
    boolean matches(String kwd){
        if (kwd.equals("전자책"))
            return true;
        if (super.matches(kwd))
            return true;
        if (url.contains(kwd))
            return true;
        if (format.contentEquals(kwd))
            return true;
        return false;
    }
}