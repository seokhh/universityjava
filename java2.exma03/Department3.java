package javaprogramming2.week2.java2.exam03;

import java.util.ArrayList;
import java.util.Scanner;
public class Department3 {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();

    void run() {
        readAll();
        printAll();
        search();
    }

    void readAll() {
        Student st = null;
        int id;
        while (true) {
            id = scan.nextInt();
            if (id == 0)
                break;
            st = new Student();
            st.read(scan, id);
            studentList.add(st);
        }
    }

    void printAll() {
        for (Student st : studentList) {
            st.print();
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
            for (Student st : studentList) {
                if (st.matches(kwdArr))
                    st.print();
            }
        }
    }

    public static void main(String args[]) {
        Department3 my = new Department3();
        my.run();
    }

}
