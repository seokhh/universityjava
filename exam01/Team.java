package javaprogramming2.week3.exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    String teamName;
    ArrayList<Student> members = new ArrayList<>();
    Team(String name) {
        teamName = name;
    }
    void read(Scanner scan, Department department) {
        Student st = null;
        int n;
        while (true) {
            n = scan.nextInt();
            if (n == 0)
                break;
            st = department.findStudent(n);
            members.add(st);
            st.setTeam(this);
        }
    }

    void print() {
        System.out.printf("%s: ", teamName);
        for (Student st: members) {
            System.out.printf("%s ", st.name);
            System.out.println();
        }
    }
}