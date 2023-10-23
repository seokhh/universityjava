package javaprogramming2.middleExam;

import java.util.ArrayList;

public class MiddleExam {
    static Manager ItemMgr = new Manager();
    Manager OrderMgr = new Manager();
    void run(){
        ItemMgr.readAll("mid1.txt", new Factory() {
            @Override
            public Manageable create() {
                return new Item();
            }
        });
        ItemMgr.printAll();
    }
    public static void main(String[] args){
        MiddleExam middleExam = new MiddleExam();
        middleExam.run();
    }
}