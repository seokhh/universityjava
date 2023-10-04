package javaprogramming2.week4.homework;

import java.util.ArrayList;
import java.util.Scanner;


public class Department {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Lecture> lectureList = new ArrayList<>();

    void run() {
        readLectures();
        readAllstudents();
        search();
    }

    void readLectures() {
        Lecture lec = null;
        String code;
        while (true) {
            code = scan.next();
            if (code.contentEquals("end"))
                break;
            int n = scan.nextInt();
            switch (n) {
                case 1: lec = new Lecture(code);break;
                case 2: lec = new ELecture(code); break;
                default: break;
            }
            lec.read(scan);
            lectureList.add(lec);
        }
    }

    void printAllLectures() {
        for (Lecture lec : lectureList){
            lec.print();
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

    void printAllstudents() {
        for (Student st : studentList) {
            st.print();
        }
    }

    Lecture findLecture(String code) {
        for(Lecture lec: lectureList){
            if(lec.matches(code))
                return lec;
        }
        return null;
    }

    void search() {
        String line = null;
        String[] kwdArr = new String[0];
        scan.nextLine();
        while (true) {
            System.out.print("메뉴선택\t(1) 학생 (2) 과목 (3) 연관검색 : ");
            line = scan.nextLine();
            if (line.equals("end"))
                break;
            if (line.equals("1"))
                printAllstudents();
            else if (line.equals("2"))
                printAllLectures();
            else if (line.equals("3")) {
                System.out.print("연관검색 메뉴 (1) 과목별 수강생 (2) 요일별 수강생 (3) 타학년 과목 수강생수 조사 : ");
                int n = scan.nextInt();
                if (n == 1) {
                    System.out.print("검색할 과목을 입력해주세요: ");
                    String lectureCode = scan.next();
                    boolean found = false;
                    for (Lecture lec : lectureList) {
                        if (lec.matches(lectureCode)) {
                            System.out.println(lec.name + " 수강생:");
                            boolean hasStudents = false;
                            for (Student st : studentList) {
                                if (st.registeredList.contains(lec)) {
                                    System.out.print(st.name + " ");
                                    hasStudents = true;
                                }
                            }
                            if (!hasStudents) {
                                System.out.printf("수강생이 없음");
                            }
                            System.out.println();
                            System.out.println();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("과목을 찾을 수 없습니다.");
                    }
                } else if (n == 2) {
                    System.out.print("검색할 요일을 입력해주세요: ");
                    String day = scan.next();
                    System.out.println(day +"요일 수강생:");
                    for (Student st : studentList) {
                        for (Lecture lec : st.registeredList) {
                            if (lec.day.equals(day)) {
                                System.out.print(st.name + " ");
                                break;
                            }
                        }
                    }
                    System.out.println();
                } else if (n == 3) {
                    System.out.print("타학년을 검색할 학년을 입력해주세요: ");
                    int yearToSearch = scan.nextInt();
                    System.out.println(yearToSearch + "학년 학생 중에서 타학년 과목을 신청한 학생들:");

                    for (Student st : studentList) {
                        if (st.year == yearToSearch) {
                            boolean found = false;
                            for (Lecture lec : st.registeredList) {
                                if (lec.year != yearToSearch) {
                                    found = true;
                                    break;
                                }
                            }
                            if (found) {
                                System.out.print(st.name + " ");
                            }
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("잘못된 선택입니다.");
                }
                scan.nextLine();
            } else {
                kwdArr = line.trim().split(" ");
                if (kwdArr.length > 0) { // Check if there are keywords
                    for (Student st : studentList) {
                        if (st.matches(kwdArr))
                            st.print();
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        Department my = new Department();
        my.run();
    }
}