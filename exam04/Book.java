package javaprogramming2.week4.exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title, pub;
    int isbn, year;
    ArrayList<String> authors = new ArrayList<>();
    int price;
    void read(Scanner scan){
        //2 자료구조 생능출판 1001 2003 천인국 공용해 하상호 0  15000
        //http://www.sangreung.co.kr/computer/chun/datastructure PDF
        title = scan.next();
        pub = scan.next();
        isbn = scan.nextInt();
        year = scan.nextInt();
        String tmp;
        while (true){
            tmp = scan.next();
            if(tmp.contentEquals("0"))
                break;
            authors.add(tmp);
        }
        price = scan.nextInt();
    }
    void printBookType(){
        System.out.printf("[일반책] ");
    }
    void print(){
        printBookType();
        System.out.printf("%s %s (%d/%d년) [%d원], 저자: ",
            title, pub, isbn, year, price);
        for(String a: authors)
            System.out.printf("%s", a);
        System.out.println();
    }

    boolean matches(String kwd) {
        if (title.contains(kwd))
            return true;
        if (pub.contains(kwd))
            return true;
        if (kwd.equals(""+isbn))
            return true;
        if (kwd.equals(""+year))
            return true;
        for (String a: authors)
            if (kwd.contentEquals(a))
                return true;
        return false;
    }
}