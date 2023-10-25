package javaprogramming2.middleExam;

import java.util.Scanner;

public class MiddleExam {
    Scanner scan = new Scanner(System.in);
    static Manager ItemMgr = new Manager();
    static Manager OrderMgr = new Manager();
    void run(){
        ItemMgr.readAll("mid1.txt", new Factory() {
            @Override
            public Manageable create() {
                return new Item();
            }
        });
        ItemMgr.printAll();
        OrderMgr.readAll("mid2.txt", Order::new);
        OrderMgr.printAll();
        searchmenu();
    }

    void searchmenu() {
        int num;
        while (true) {
            System.out.print("(1)고객번호 검색 (2)제품정보 검색 (기타) 종료 ");

            num = scan.nextInt();
            switch (num){
                case 1: ItemMgr.search(scan); break;
                case 2: OrderMgr.search(scan); break;
                default: break;
            }
        }
    }

    public static void main(String args[]){
        MiddleExam middleExam = new MiddleExam();
        middleExam.run();
    }
}