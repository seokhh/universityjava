package javaprogramming2.week2.exam01;

import java.util.ArrayList;
import java.util.Scanner;
public class Department{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Student> studentList = new ArrayList<>();
    public void run() {
        readAll();
        printAll();
    }
    private static void readAll() {
        Student st = null;
        for (int i = 0; i < 5; i++) {
            st = new Student();
            st.read(scan);
            studentList.add(st);
        }
    }
    private static void printAll() {
        for (Student st : studentList) {
            st.print();
        }
    }
    public static void main(String[] args) {
        Department department = new Department();
        department.run();
    }
}
