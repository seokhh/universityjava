package javaprogramming2.week2.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    ArrayList<Friend> studentList = new ArrayList<>();

    void run() {
        readAll();
        printAll();
        search();
    }

    void readAll() {
        Friend st = null;
        String name;
        while (true) {
            name = scan.next();
            if (name.equals("end"))
                break;
            st = new Friend();
            st.read(scan, name);
            studentList.add(st);
        }
    }

    void printAll() {
        for (Friend fri : studentList) {
            fri.print();
        }
    }

    void search() {
        String line = null;
        String[] kwdArr;
        scan.nextLine();
        while (true) {
            System.out.print("키워드(통합검색, -면 제외):");
            line = scan.nextLine();
            if (line.equals("end"))
                break;
            kwdArr = line.trim().split(" ");
            for (Friend fri : studentList) {
                if (fri.matches(kwdArr))
                    fri.print();
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("이름, 번호, 주소, 직업 순으로 적어주세요");
        Main my = new Main();
        my.run();
    }
}
