package javaprogramming2.week2.exam01;

import java.util.Scanner;

public class Student {
    String name;
    int id;
    String phone;
    int year;
    void read(Scanner scan){
        id = scan.nextInt();
        name = scan.next();
        phone = scan.next();
        year = scan.nextInt();
    }
    void print(){
        System.out.format("%d %s %s (%d학년)\n", id, name, phone, year);
    }
}
