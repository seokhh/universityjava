package javaprogramming2.week6.exam04.mgr;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//패키지 분류 해줌으로써 부가적인 클래스와 인터페이스를 모아줌
public class Manager{
    static ArrayList<Manageable> mList = new ArrayList<>();

    public void readAll(String filename, Factory fac) {
        Scanner filein = openFile(filename);
        Manageable m = null;
        while (filein.hasNext()) {
            m = fac.create();
            m.read(filein);
            mList.add(m);
        }
        filein.close();
    }
    public Scanner openFile(String filename) {
        Scanner filein = null;
        try {
            filein = new Scanner(new File(filename));
        } catch (IOException e)
        {
            System.out.println("파일 입력 오류");
            System.exit(0);
        }
        return filein;
    }

    public void printAll() {
        for (Manageable m: mList)
            m.print();
    }

    public void search(Scanner scan) {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Manageable m : mList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }
    public static Manageable find(String kwd){
        for (Manageable m: mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }
}