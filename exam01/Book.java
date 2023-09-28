package javaprogramming2.week4.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String title, pub;
    int isbn, year;
    ArrayList<String> authors = new ArrayList<>();
    int price;
    void read(Scanner scan){
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
    void print(){
        System.out.printf("%s %s (%d/%d년) [%d원], 저자: ",
            title, pub, isbn, year, price);
        for(String a: authors)
            System.out.printf("%s", a);
        System.out.println();
    }
}