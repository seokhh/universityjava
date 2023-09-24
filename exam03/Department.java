package javaprogramming2.week3.exam03;

import java.util.ArrayList;
import java.util.Scanner;


public class Department {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Lecture> lectureList = new ArrayList<>();

    void run() {
        readLectures();
        readAllstudents();
        printAllstudents();
        search();
    }

    void readLectures() {
        Lecture lec = null;
        String code;
        while (true) {
            code = scan.next();
            if (code.contentEquals("end"))
                break;
            lec = new Lecture(code);
            lec.read(scan);
            lectureList.add(lec);
        }
    }

    void readAllstudents() {
        Student st = null;
        int id;
        while (true) {
            id = scan.nextInt();
            if (id == 0)
                break;
            st = new Student();
            st.read(scan, id, this);
            studentList.add(st);
        }
    }

    public Lecture findLecture(String code) {
        for(Lecture lec: lectureList){
            if(lec.matches(code))
                return lec;
        }
        return null;
    }
    void printAllstudents() {
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
    }//Arraylist.contains함수 활용

    public static void main(String args[]) {
        Department my = new Department();
        my.run();
    }
}