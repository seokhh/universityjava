package javaprogramming2.week2.exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class Department2 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Student2> studentList = new ArrayList<>();
    public void run() {
        readAll();
        printAll();
        search();
    }
    private static void readAll() {
        Student2 st = null;
        int id;
        while (true) {
            id = scan.nextInt();
            if (id == 0)
                break;
            st = new Student2();
            st.read(scan, id);
            studentList.add(st);
        }
    }
    private static void printAll() {
        for (Student2 st : studentList) {
            st.print();
        }
    }
    void search() {
        String name = null;
        while (true) {
            System.out.print("이름:");
            name = scan.next();
            if (name.equals("end"))
                break;
            for (Student2 st : studentList) {
                if (st.matches(name))
                    st.print();
            }
        }
    }
    public static void main(String[] args) {
        Department2 department = new Department2();
        department.run();
    }
}
