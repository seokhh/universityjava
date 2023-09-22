package javaprogramming2.week3.exam02;

import java.util.ArrayList;
import java.util.Scanner;


public class Department {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Team> teamList = new ArrayList<>();

    void run() {
        readAll();
        printAll();
        readteams();
        printteams();
        searchteams();
        search();
    }

    void printteams() {
        for (Team t : teamList) {
            t.print();
        }
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

    void readteams(){
        Team t = null;
        String name;
        while (true) {
            name = scan.next();
            if (name.equals("end"))
                break;
            t = new Team(name);
            t.read(scan, this);
            teamList.add(t);
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
    void searchteams() {
        String kwd = null;
        while (true) {
            System.out.print("팀검색 키워드:");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Team t : teamList) {
                if (t.matches(kwd))
                    t.print();
            }
        }
    }

    public static void main(String args[]) {
        Department my = new Department();
        my.run();
    }

    public Student findStudent(int n) {
        return studentList.get(n-1);
    }
}
