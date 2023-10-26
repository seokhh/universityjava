package javaprogramming2.midtermexam;

import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    static Manager studentMgr = new Manager();
    static Manager lectureMgr = new Manager();
    static Manager MsgMgr = new Manager();
    void run() {
        MsgMgr.readAll("notices.txt", Message::new);
        MsgMgr.printAll();
        studentMgr.readAll("students.txt", Student::new);
        studentMgr.printAll();
        searchMenu();
    }
    void searchMenu() {
        int num;
        while (true) {
            System.out.print("(1)메세지 (2)학생 (기타) 종료 ");
            num = scan.nextInt();
            switch (num){
                case 1: MsgMgr.search(scan); break;
                case 2: studentMgr.search(scan); break;
                default: break;
            }
        }
    }

    public static void main(String args[]) {
        Main my = new Main();
        my.run();
    }
}